package br.com.questao1;

public class Vip extends Ingresso {

    private double valorAdicional;

    public Vip(double valorIngresso, double valorAdicional) {
        super(valorIngresso);
        this.valorAdicional = getValorAdicional();
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public void imprimeIngresso(){
        System.out.println(" Ingresso Vip - valor: " + (getValorIngresso () + getValorAdicional()));
    }
}
