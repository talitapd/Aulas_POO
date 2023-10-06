package br.com.questao1;

public class CartaoDebito extends Pagamento{
    private String numCartao;
    private String tituloCartao;

    public CartaoDebito(String dataHoraPagamento, int numeroPagamento, double valorPago, String numCartao, String tituloCartao) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
        this.numCartao = numCartao;
        this.tituloCartao = tituloCartao;
    }

    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public String getTituloCartao() {
        return tituloCartao;
    }

    public void setTituloCartao(String tituloCartao) {
        this.tituloCartao = tituloCartao;
    }

    @Override
    public String imprimirCupomFiscal() {
        return "Data e hora do pagamento:  " + getDataHoraPagamento()
                + "\n Número Pagamento  " + getNumeroPagamento()
                + "\n Valor pago: " + getValorPago()
                + "\n Número do cartão " + getNumCartao()
                + "\n Titulo do cartão: " + getTituloCartao();
    }
}
