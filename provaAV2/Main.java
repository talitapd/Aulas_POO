package provaAV2;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Criar uma lista de produtos
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        // Inserir 5 produtos distintos
        Categoria categoriaEletronicos = new Categoria();
        categoriaEletronicos.setDescCategoria("Eletrônicos");

        Produto produto1 = new Produto("Smartphone", 999.99, "Telefone inteligente", 50, categoriaEletronicos);
        Produto produto2 = new Produto("Laptop", 1499.99, "Computador portátil", 30, categoriaEletronicos);
        Produto produto3 = new Produto("Fones de Ouvido", 79.99, "Fones de ouvido sem fio", 100, categoriaEletronicos);
        Produto produto4 = new Produto("Smartwatch", 199.99, "Relógio inteligente", 20, categoriaEletronicos);
        Produto produto5 = new Produto("Tablet", 399.99, "Tablet Android", 40, categoriaEletronicos);

        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);
        listaProdutos.add(produto4);
        listaProdutos.add(produto5);

        // Criar uma lista de pedidos
        ArrayList<Pedido> listaPedidos = new ArrayList<>();

        // Criar o primeiro pedido
        Pedido pedido1 = new Pedido(1, new Date(), 0, 1);

        // Adicionar itens ao primeiro pedido
        PedidoItem item1Pedido1 = new PedidoItem("Smartphone", 2, 999.99);
        PedidoItem item2Pedido1 = new PedidoItem("Laptop", 1, 1499.99);

        // Validar se os produtos existem antes de adicionar ao pedido
        if (validarPedidoItem(item1Pedido1, listaProdutos) && validarPedidoItem(item2Pedido1, listaProdutos)) {
            pedido1.InserirItensPedido(item1Pedido1);
            pedido1.InserirItensPedido(item2Pedido1);

            // Atualizar estoque e status do pedido
            atualizarEstoqueEStatus(pedido1, listaProdutos);
            listaPedidos.add(pedido1);

            // Calcular o valor total a pagar para o primeiro pedido
            pedido1.CalculaTotalPagar();
        } else {
            System.out.println("Erro: PedidoItem não válido.");
        }

        // Criar o segundo pedido
        Pedido pedido2 = new Pedido(2, new Date(), 0, 1);

        // Adicionar itens ao segundo pedido
        PedidoItem item1Pedido2 = new PedidoItem("Fones de Ouvido", 3, 79.99);
        PedidoItem item2Pedido2 = new PedidoItem("Smartwatch", 1, 199.99);

        // Validar se os produtos existem antes de adicionar ao pedido
        if (validarPedidoItem(item1Pedido2, listaProdutos) && validarPedidoItem(item2Pedido2, listaProdutos)) {
            pedido2.InserirItensPedido(item1Pedido2);
            pedido2.InserirItensPedido(item2Pedido2);

            // Atualizar estoque e status do pedido
            atualizarEstoqueEStatus(pedido2, listaProdutos);
            listaPedidos.add(pedido2);

            // Calcular o valor total a pagar para o segundo pedido
            pedido2.CalculaTotalPagar();
        } else {
            System.out.println("Erro: PedidoItem não válido.");
        }

        // Exibir informações dos pedidos
        System.out.println("Informações dos Pedidos:");
        for (Pedido pedido : listaPedidos) {
            System.out.println("Número do Pedido: " + pedido.getNumeroPedido());
            System.out.println("Data do Pedido: " + pedido.getDataHorPedido());
            System.out.println("Preço Total: " + pedido.getPrecoTotal());
            System.out.println("Status do Pedido: " + pedido.getStatusPedido());

            // Exibir itens do Pedido
            System.out.println("Itens do Pedido:");
            for (PedidoItem item : pedido.getItensPedido()) {
                System.out.println("Nome do Item: " + item.getNomeItem());
                System.out.println("Quantidade do Item: " + item.getQtdeItem());
                System.out.println("Preço do Item: " + item.getPrecoItem());
            }

            System.out.println();
        }
    }

    // Método para validar se um PedidoItem existe na lista de Produtos
    private static boolean validarPedidoItem(PedidoItem pedidoItem, ArrayList<Produto> listaProdutos) {
        for (Produto produto : listaProdutos) {
            if (produto.getNomeProduto().equals(pedidoItem.getNomeItem())) {
                return true;
            }
        }
        return false;
    }

    // Método para atualizar o estoque e o status do pedido após a inserção de itens
    private static void atualizarEstoqueEStatus(Pedido pedido, ArrayList<Produto> listaProdutos) {
        for (PedidoItem item : pedido.getItensPedido()) {
            for (Produto produto : listaProdutos) {
                if (produto.getNomeProduto().equals(item.getNomeItem())) {
                    // Atualizar estoque com base no PedidoItem
                    produto.atualizaEstoqueComPedidoItem(item);
                }
            }
        }
        // Atualizar status do pedido para 2
        pedido.AlterarStatus(2);
    }
}
