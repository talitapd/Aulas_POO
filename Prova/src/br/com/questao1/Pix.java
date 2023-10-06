package br.com.questao1;

public class Pix extends Pagamento{
    private boolean comprovanteTransacaoPix;

    public Pix(String dataHoraPagamento, int numeroPagamento, double valorPago, boolean comprovanteTransacaoPix) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
        this.comprovanteTransacaoPix = comprovanteTransacaoPix;
    }

    public boolean isComprovanteTransacaoPix() {
        return comprovanteTransacaoPix;
    }

    public void setComprovanteTransacaoPix(boolean comprovanteTransacaoPix) {
        this.comprovanteTransacaoPix = comprovanteTransacaoPix;
    }

    public boolean comprovanteTrasacaoPix() {
        return false;
    }

    @Override
    public String imprimirCupomFiscal() {
        String comprovante = comprovanteTransacaoPix ? "Sim" : "Não";
        return "Data e hora do pagamento:  " + getDataHoraPagamento()
                + "\n Número Pagamento  " + getNumeroPagamento()
                + "\n Valor pago: " + getValorPago()
                + "\nComprovante de Transação PIX: " + comprovante;
    }
}
