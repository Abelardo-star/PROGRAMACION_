package rpg.dao;
import java.sql.*;
public class ConexionDB {
    private static final String URL = "jdbc:postgresql://localhost:5432/XRPG";
    private static final String USER = "xrpg_user";
    private static final String PASS = "xrpg_password";

    public static Connection getConexion() throws SQLException {
        try {
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            throw new SQLException("Error al conectar con la base de datos XRPG", e);
        }
    }
}
