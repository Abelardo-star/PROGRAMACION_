package rpg.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import rpg.model.Razas;
import rpg.utils.Log;

public class RazasDao {
    private List<Razas> listaRazas;

    public RazasDao() {
        this.listaRazas = new ArrayList<>();
        this.cargarDatos();
    }

    private void cargarDatos() {
        String query = "SELECT * FROM Razas";
        try (Connection con = ConexionDB.getConexion();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(query)) {
            while (rs.next()) {
                listaRazas.add(new Razas(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getInt("bonificador_vida"),
                        rs.getInt("bonificador_fuerza")
                ));
            }
        } catch (SQLException e) {
            Log.Error("Fallo al cargar Razas: " + e.getMessage());
        }
    }

    public Razas buscarPorId(int id) {
        for (Razas r : listaRazas) {
            if (r.getId() == id) return r;
        }
        return null;
    }

    public List<Razas> getListaRazas() {
        return listaRazas;
    }
}