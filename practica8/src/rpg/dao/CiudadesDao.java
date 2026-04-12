package rpg.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import rpg.model.Ciudades;
import rpg.utils.Log;

public class CiudadesDao {
    private List<Ciudades> listaCuidades;

    public CiudadesDao() {
        this.listaCuidades = new ArrayList<>();
        this.leerCiudades();
    }

    private void leerCiudades() {
        String query = "SELECT * FROM Ciudades";
        try (Connection con = ConexionDB.getConexion();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(query)) {
            while (rs.next()) {
                listaCuidades.add(new Ciudades(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getInt("nivel_minimo_acceso")
                ));
            }
        } catch (SQLException e) {
            Log.Error("Fallo al cargar Ciudades: " + e.getMessage());
        }
    }

    public Ciudades buscarPorId(int id) {
        for (Ciudades ciu : listaCuidades) {
            if (ciu.getId() == id)
                return ciu;
        }
        return null;
    }

    public List<Ciudades> getListaCiudades() {
        return listaCuidades;
    }
}