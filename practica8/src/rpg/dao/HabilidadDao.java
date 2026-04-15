package rpg.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import rpg.model.Habilidades;
import rpg.utils.Log;

public class HabilidadDao {
    private List<Habilidades> listaHabilidades;

    public HabilidadDao() {
        this.listaHabilidades = new ArrayList<>();
        cargarHabilidadesBase();
    }

    private void cargarHabilidadesBase() {
        String sql = "SELECT * FROM Habilidades";
        try (Connection con = ConexionDB.getConexion();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                listaHabilidades.add(new Habilidades(
                        rs.getInt("id"), rs.getString("nombre"), rs.getInt("dano_base"),
                        rs.getInt("usos_maximos"), rs.getInt("id_clase")
                ));
            }
        } catch (SQLException e) {
            Log.Error("Error HabilidadDao (Carga): " + e.getMessage());
        }
    }

    public List<Habilidades> getHabilidadesPersonaje(List<Habilidades> todas, int idPerso) {
        List<Habilidades> equipadas = new ArrayList<>();
        String sql = "SELECT id_habilidad FROM Personajes_Habilidades WHERE id_personaje = ? AND equipada_combate = true";

        try (Connection con = ConexionDB.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idPerso);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int idHab = rs.getInt("id_habilidad");
                for (Habilidades h : todas) {
                    if (h.getId() == idHab) {
                        equipadas.add(h);
                        break;
                    }
                }
            }
        } catch (SQLException e) {
            Log.Error("Error al cargar habilidades del personaje " + idPerso);
        }
        return equipadas;
    }

    public List<Habilidades> getListaHabilidades() {
        return listaHabilidades;
    }
}