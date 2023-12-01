package provaAV2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private int numeroPedido;
    private Date dataHorPedido;
    private double precoTotal;
    private int statusPedido;

    private List<PedidoItem> itensPedido = new ArrayList<>();

    public Pedido(int numeroPedido, Date dataHorPedido, double precoTotal, int statusPedido) {
        this.numeroPedido = numeroPedido;
        this.dataHorPedido = dataHorPedido;
        this.precoTotal = precoTotal;
        this.statusPedido = statusPedido;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Date getDataHorPedido() {
        return dataHorPedido;
    }

    public void setDataHorPedido(Date dataHorPedido) {
        this.dataHorPedido = dataHorPedido;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public int getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(int statusPedido) {
        this.statusPedido = statusPedido;
    }

    public List<PedidoItem> getItensPedido() {
        return itensPedido;
    }

    public void setItensPedido(List<PedidoItem> itensPedido) {
        this.itensPedido = itensPedido;
    }

    // Método para inserir um pedido
    public static void InserirPedido(Pedido pedido, List<Pedido> listaPedidos) {
        listaPedidos.add(pedido);
    }

    // Método para alterar o status do pedido
    public int AlterarStatus(int novoStatus) {
        this.statusPedido = novoStatus;
        return this.statusPedido;
    }

    // Método para consultar se um pedido existe
    public static boolean ConsultarPedido(List<Pedido> listaPedidos, int numeroPedido) {
        for (Pedido pedido : listaPedidos) {
            if (pedido.getNumeroPedido() == numeroPedido) {
                return true;  // Pedido encontrado
            }
        }
        return false;  // Pedido não encontrado
    }

    // Método para inserir itens no pedido
    public void InserirItensPedido(PedidoItem pedidoItem) {
        this.itensPedido.add(pedidoItem);
        // Atualizar o preço total do pedido com base no novo item adicionado
        this.CalculaTotalPagar();
    }

    // Método para excluir itens do pedido
    public void ExcluirItensPedido(PedidoItem pedidoItem) {
        this.itensPedido.remove(pedidoItem);
        // Atualizar o preço total do pedido com base no item removido
        this.CalculaTotalPagar();
    }

    // Método para calcular o total a pagar
    public double CalculaTotalPagar() {
        double total = 0;
        for (PedidoItem pedidoItem : this.itensPedido) {
            total += pedidoItem.getPrecoItem();
        }
        this.precoTotal = total;
        return this.precoTotal;
    }

    public void adicionarItem(PedidoItem pedidoItem) {
        this.itensPedido.add(pedidoItem);
        // Atualizar o preço total do pedido com base no novo item adicionado
        this.CalculaTotalPagar();
    }
}
