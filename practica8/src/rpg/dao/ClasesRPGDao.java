package rpg.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import rpg.model.ClasesRPG;
import rpg.utils.Log;

public class ClasesRPGDao {
    private List<ClasesRPG> listaClases;
    private HabilidadDao hDao;

    public ClasesRPGDao(HabilidadDao habilidadDao) {
        this.hDao = habilidadDao;
        this.listaClases = new ArrayList<>();
        this.importarClases();
    }

    private void importarClases() {
        String query = "SELECT * FROM Clases_RPG";
        try (Connection con = ConexionDB.getConexion();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(query)) {
            while (rs.next()) {
                listaClases.add(new ClasesRPG(rs.getInt("id"), rs.getString("nombre")));
            }
        } catch (SQLException e) {
            Log.Error("Fallo al cargar Clases: " + e.getMessage());
        }
    }

    public ClasesRPG buscarPorId(int idBuscado) {
        for (ClasesRPG c : listaClases) {
            if (c.getIdClase() == idBuscado) return c;
        }
        return null;
    }


    public List<ClasesRPG> getListaClases() {
        return listaClases;
    }
}