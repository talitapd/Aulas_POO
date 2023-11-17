package Pratica_7;

import java.sql.*;

public class Consulta {
   
    private final String url = "jdbc:postgresql://localhost/BDlivrariaUniversitaria";
    private final String user = "postgres";
    private final String password = "123456";

    private static final String QUERY_TITULO = "select * from livro where nm_titulo like ?";
    private static final String QUERY_VALOR = "select * from livro where vl_preco>=?";

    public void BuscaTitulo(String titulo) throws SQLException {
        System.out.println(QUERY_TITULO);

        try (Connection connection = DriverManager.getConnection(url, user, password);

             PreparedStatement preparedStatement = connection.prepareStatement(QUERY_TITULO);) {
            titulo=titulo + "%";
            preparedStatement.setString(1, titulo);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String id = rs.getString("id_isbn");
                String name_titulo = rs.getString("nm_titulo");
                System.out.println(id + " - " + name_titulo);
            }
        } catch (SQLException e) {

            printSQLException(e);
        }
    }


    public void BuscaValor(Double valor) throws SQLException {
        System.out.println(QUERY_VALOR);

        try (Connection connection = DriverManager.getConnection(url, user, password);

             PreparedStatement preparedStatement = connection.prepareStatement(QUERY_VALOR);) {
            preparedStatement.setDouble(1, valor);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String id = rs.getString("id_isbn");
                String name_titulo = rs.getString("nm_titulo");
                Double valor_livro = rs.getDouble("vl_preco");
                System.out.println(id + " - " + name_titulo + " - " + valor_livro);
            }
        } catch (SQLException e) {

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
