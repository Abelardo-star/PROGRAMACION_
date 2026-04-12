package rpg.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import rpg.model.*;
import rpg.utils.Log;

public class PersonajesDao {
    private List<Personajes> catalogoAventureros;
    private ItemsDao daoArticulos;
    private HabilidadDao daoTecnicas;

    // Constructor que recibe los DAOs necesarios para el inventario y habilidades
    public PersonajesDao(ItemsDao daoArticulos, HabilidadDao daoTecnicas) {
        this.catalogoAventureros = new ArrayList<>();
        this.daoArticulos = daoArticulos;
        this.daoTecnicas = daoTecnicas;
    }

    public PersonajesDao() {}

    public void cargarPersonajes(CiudadesDao cDao, RazasDao rDao, ClasesRPGDao clDao) {
        this.catalogoAventureros.clear();
        String query = "SELECT * FROM Personajes";

        try (Connection con = ConexionDB.getConexion();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(query)) {

            while (rs.next()) {
                Razas razaVinculada = rDao.buscarPorId(rs.getInt("id_raza"));
                ClasesRPG claseVinculada = clDao.buscarPorId(rs.getInt("id_clase"));

                Integer idCiudad = (Integer) rs.getObject("id_ciudad_actual");
                Ciudades localidad = null;
                if (idCiudad != null) {
                    localidad = cDao.buscarPorId(idCiudad);
                }

                Personajes aventurero = new Personajes(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getInt("nivel"),
                        rs.getInt("oro"),
                        rs.getInt("vida_actual"),
                        razaVinculada,
                        claseVinculada,
                        localidad
                );

                // Cargar inventario y habilidades desde los otros DAOs
                aventurero.setInventario(daoArticulos.getInventario(aventurero.getId(), daoArticulos.getListaItems()));
                aventurero.setHabilidadesEquipadas(daoTecnicas.getHabilidadesPersonaje(daoTecnicas.getListaHabilidades(), aventurero.getId()));

                this.catalogoAventureros.add(aventurero);
            }
        } catch (SQLException e) {
            Log.Error("Error al cargar personajes: " + e.getMessage());
        }
    }

    public void actualizarOro(int idPersonaje, int nuevoOro) {
        String sql = "UPDATE Personajes SET oro = ? WHERE id = ?";
        try (Connection con = ConexionDB.getConexion();
             PreparedStatement pstmt = con.prepareStatement(sql)) {

            pstmt.setInt(1, nuevoOro);
            pstmt.setInt(2, idPersonaje);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            Log.Error("Error SQL al actualizar oro: " + e.getMessage());
        }
    }

    public void desterrarPersonaje(int idPersonaje) {
        String sql = "UPDATE Personajes SET id_ciudad_actual = NULL WHERE id = ?";
        try (Connection con = ConexionDB.getConexion();
             PreparedStatement pstmt = con.prepareStatement(sql)) {

            pstmt.setInt(1, idPersonaje);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            Log.Error("Error SQL al desterrar personaje: " + e.getMessage());
        }
    }
    public void ActualizarCuidad(int idCiudad, int idPersonaje ){
        String sql = "UPDATE PERSONAJES SET ID_CIUDAD_ACTUAL = ? WHERE ID = ?";
        try(Connection connection = ConexionDB.getConexion();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setInt(1,idCiudad);
            preparedStatement.setInt(2,idPersonaje);
            preparedStatement.executeUpdate();
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
    public void registrarItemEnInventario(int idPersonaje, int idItem) {
        String sql = "INSERT INTO Inventarios (id_personaje, id_item, cantidad) VALUES (?, ?, 1) " +
                "ON CONFLICT (id_personaje, id_item) DO UPDATE SET cantidad = Inventarios.cantidad + 1";

        try (Connection con = ConexionDB.getConexion();
             PreparedStatement pstmt = con.prepareStatement(sql)) {

            pstmt.setInt(1, idPersonaje);
            pstmt.setInt(2, idItem);

            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error al registrar item en inventario");
            Log.Error("Error SQL en registrarItemEnInventario: " + e.getMessage());
        }
    }

    public void insertarNuevoPersonaje(String nombre, int idRaza, int idClase) {
        String sql = "INSERT INTO Personajes (nombre, id_raza, id_clase, nivel, oro, vida_actual) VALUES (?, ?, ?, 1, 100, 100)";

        try (Connection con = ConexionDB.getConexion();
             PreparedStatement pstmt = con.prepareStatement(sql)) {

            pstmt.setString(1, nombre);
            pstmt.setInt(2, idRaza);
            pstmt.setInt(3, idClase);

            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error al insertar el nuevo personaje");
            Log.Error("Error SQL en insertarNuevoPersonaje: " + e.getMessage());
        }
    }

    public List<Personajes> getListaPersonajes() {
        return catalogoAventureros;
    }

    public Personajes buscarPorId(int idBuscado) {
        for (int i = 0; i < catalogoAventureros.size(); i++) {
            Personajes p = catalogoAventureros.get(i);
            if (p.getId() == idBuscado) {
                return p;
            }
        }
        return null;
    }

}