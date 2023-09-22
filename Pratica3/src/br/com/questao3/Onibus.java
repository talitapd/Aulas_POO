package br.com.questao3;

public class Onibus extends Veiculo{
    private int assentos;

    public Onibus(String placa, int ano, int assentos) {
        super(placa, ano);
        this.assentos = assentos;
    }

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
    public String toString() {
        return "Placa: " + getPlaca() + "\n" + "Ano: " + getAno() + "\n" + "Assentos: " + getAssentos();
    }
}
