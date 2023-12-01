package provaAV2;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private String nomeProduto;
    private double precoProduto;
    private String descProduto;
    private int estoqueAtual;
    private Categoria categoria;

    private static List<Produto> listaProdutos = new ArrayList<>();

    public Produto(String nomeProduto, double precoProduto, String descProduto, int estoqueAtual, Categoria categoria) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.descProduto = descProduto;
        this.estoqueAtual = estoqueAtual;
        this.categoria = categoria;
        listaProdutos.add(this);
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public String getDescProduto() {
        return descProduto;
    }

    public void setDescProduto(String descProduto) {
        this.descProduto = descProduto;
    }

    public int getEstoqueAtual() {
        return estoqueAtual;
    }

    public void setEstoqueAtual(int estoqueAtual) {
        this.estoqueAtual = estoqueAtual;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    // Método para inserir um produto na lista
    public static void InserirProduto(Produto produto) {
        listaProdutos.add(produto);
    }
    // Método para buscar um produto na lista pelo nome
    public static boolean BuscarProduto(String nomeProduto) {
        for (Produto produto : listaProdutos) {
            if (produto.getNomeProduto().equals(nomeProduto)) {
                return true;  // Produto encontrado
            }
        }
        return false;  // Produto não encontrado
    }

    // Método para atualizar o estoque com base em um PedidoItem
    public void atualizaEstoqueComPedidoItem(PedidoItem pedidoItem) {
        // Certifique-se de que o pedidoItem não é nulo e o estoque é suficiente
        if (pedidoItem != null && pedidoItem.verificaEstoque()) {
            // Atualiza o estoque
            this.estoqueAtual -= pedidoItem.getQtdeItem();
            System.out.println("Estoque do produto '" + this.nomeProduto + "' atualizado com sucesso.");
        } else {
            System.out.println("PedidoItem inválido ou estoque insuficiente para o produto '" + this.nomeProduto + "'.");
        }
    }
}
