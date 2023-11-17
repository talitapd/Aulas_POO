package Pratica_7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Inserir {
    private final String url = "jdbc:postgresql://localhost/BDlivrariaUniversitaria";
    private final String user = "postgres";
    private final String password = "123456";

    private static final String INSERT_USERS_SQL = "INSERT INTO livro(id_isbn, id_categoria, id_editora,"+
            "nm_titulo, vl_preco) " +
            " VALUES (?, ?, ?, ?, ?)";

    public Inserir (String id_isbn, int id_categoria , int id_editora, String nm_titulo, Double vl_preco) throws SQLException {
        System.out.println(INSERT_USERS_SQL);
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            try (PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
                preparedStatement.setString(1, id_isbn);
                preparedStatement.setInt(2, id_categoria);
                preparedStatement.setInt(3, id_editora);
                preparedStatement.setString(4, nm_titulo);
                preparedStatement.setDouble(5, vl_preco);

                System.out.println(preparedStatement);
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {

            // print SQL exception information
            printSQLException(e);
        }
    }

    public static void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}