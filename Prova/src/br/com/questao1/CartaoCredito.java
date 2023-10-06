package br.com.questao1;

public class CartaoCredito extends Pagamento{
    private String numCartao;
    private String bandeiraCartao;
    private String titulocartao;

    public CartaoCredito(String dataHoraPagamento, int numeroPagamento, double valorPago, String numCartao, String bandeiraCartao, String titulocartao) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
        this.numCartao = numCartao;
        this.bandeiraCartao = bandeiraCartao;
        this.titulocartao = titulocartao;
    }

    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public String getBandeiraCartao() {
        return bandeiraCartao;
    }

    public void setBandeiraCartao(String bandeiraCartao) {
        this.bandeiraCartao = bandeiraCartao;
    }

    public String getTitulocartao() {
        return titulocartao;
    }

    public void setTitulocartao(String titulocartao) {
        this.titulocartao = titulocartao;
    }

    @Override
    public String imprimirCupomFiscal() {
        return "Data e hora do pagamento:  " + getDataHoraPagamento()
                + "\n Número Pagamento  " + getNumeroPagamento()
                + "\n Valor pago: " + getValorPago()
                + "\n Número do cartão " + getNumCartao()
                + "\n Bandeira do Cartão: " + getBandeiraCartao()
                + "\n Titulo Do Cartão: " + getTitulocartao()
                ;
    }
}
