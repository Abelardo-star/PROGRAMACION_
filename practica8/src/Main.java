import java.sql.*;

public class Main {
    public static void main(String[] args) {

        try (Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/XRPG",
                "xrpg_user",
                "xrpg_password");

             Statement statement = connection.createStatement();
             ResultSet resultset = statement.executeQuery("SELECT * FROM Personajes")) {

            while (resultset.next()) {
                String nombre = resultset.getString("nombre");
                int nivel = resultset.getInt("nivel");
                int oro = resultset.getInt("oro");

                System.out.println(nombre + " | Nivel: " + nivel + " | Oro: " + oro);
            }

        } catch (SQLException e) {
            System.out.println("Error en la conexión de la base de datos");
            e.printStackTrace();
        }
    }
}