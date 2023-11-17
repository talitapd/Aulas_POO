package Pratica_7;

import javax.swing.*;
import java.sql.SQLException;

public class main {
    public static void main(String[] args) throws SQLException {
        String id_isbn, nm_titulo, cod_excluir, busca_Titulo;
        int id_categoria, id_editora;
        Double vl_preco, buscarValor;

        id_isbn = JOptionPane.showInputDialog("Digite ISBN");
        nm_titulo = JOptionPane.showInputDialog("Digite Titulo");
        id_categoria = Integer.parseInt(JOptionPane.showInputDialog("Digite codigo da categoria"));
        id_editora = Integer.parseInt(JOptionPane.showInputDialog("Digite codigo Editora"));
        vl_preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do livro"));
        Inserir inserir = new Inserir(id_isbn,id_categoria ,id_editora, nm_titulo, vl_preco);
    }
}
