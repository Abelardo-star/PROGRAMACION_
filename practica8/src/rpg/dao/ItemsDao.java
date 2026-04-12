package rpg.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import rpg.model.Items;
import rpg.utils.Log;

public class ItemsDao {
    private List<Items> listaItems;

    public ItemsDao() {
        this.listaItems = new ArrayList<>();
        cargarTodosLosItems();
    }

    // Carga inicial para tener los datos en memoria
    private void cargarTodosLosItems() {
        String sql = "SELECT * FROM Items";
        try (Connection con = ConexionDB.getConexion();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                listaItems.add(new Items(
                        rs.getInt("id"), rs.getString("nombre"), rs.getString("tipo"),
                        rs.getInt("precio_oro"), rs.getInt("bonificador_ataque"), rs.getInt("bonificador_defensa")
                ));
            }
        } catch (SQLException e) {
            Log.Error("Error ItemsDao (Carga): " + e.getMessage());
        }
    }

    public List<Items> getInventario(int idPersonaje, List<Items> todosLosItems) {
        List<Items> mochila = new ArrayList<>();
        String sql = "SELECT id_item FROM Inventarios WHERE id_personaje = ?";

        try (Connection con = ConexionDB.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idPersonaje);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int idBuscado = rs.getInt("id_item");
                // Buscamos el objeto completo en la lista general
                for (Items item : todosLosItems) {
                    if (item.getId() == idBuscado) {
                        mochila.add(item);
                        break;
                    }
                }
            }
        } catch (SQLException e) {
            Log.Error("Error al obtener inventario del personaje " + idPersonaje);
        }
        return mochila;
    }
    public Items buscarPorId(int idBuscado) {
        for (Items item : listaItems) {
            if (item.getId() == idBuscado) {
                return item;
            }
        }
        return null; // Si no lo encuentra
    }

    public List<Items> getListaItems() {
        return listaItems;
    }
}