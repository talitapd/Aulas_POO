package provaAV2;

public class PedidoItem {
    private String nomeItem;
    private int qtdeItem;
    private double precoItem;
    private Produto pedidoItem;

    public PedidoItem(String nomeItem, int qtdeItem, double precoItem) {
        this.nomeItem = nomeItem;
        this.qtdeItem = qtdeItem;
        this.precoItem = precoItem;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public int getQtdeItem() {
        return qtdeItem;
    }

    public void setQtdeItem(int qtdeItem) {
        this.qtdeItem = qtdeItem;
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(double precoItem) {
        this.precoItem = precoItem;
    }

    // Método para verificar se há estoque suficiente para o item
    boolean verificaEstoque() {
        int quantidadeMinimaAceitavel = 10;
        return qtdeItem >= quantidadeMinimaAceitavel;
    }

    public void adicionarAoPedido(Pedido pedido) {
        if (pedido != null) {
            // Verificar se há estoque suficiente para o item
            if (verificaEstoque()) {
                // Adicionar o item ao pedido
                pedido.adicionarItem(this);

                // Atualizar o estoque do item
                pedidoItem.atualizaEstoqueComPedidoItem(this);

                System.out.println("Item '" + nomeItem + "' adicionado ao pedido com sucesso.");
            } else {
                System.out.println("Estoque insuficiente para o item: " + nomeItem);
            }
        } else {
            System.out.println("Pedido inválido.");
        }
    }
}
