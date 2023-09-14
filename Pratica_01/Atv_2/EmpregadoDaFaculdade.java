package Pratica_01.Atv_2;

public class EmpregadoDaFaculdade {
    private String nome;
    private double salario;
    private int horasAula;

    public double getGastos() {
        double gastos = this.salario + (horasAula * 40);
        return gastos;
    }

    public String getInfo() {
        double valorTotal = this.salario + (horasAula * 40);
        return "Nome: " + this.nome + " receberá: " + valorTotal;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setHorasAula(int horasAula) {
        this.horasAula = horasAula;
    }
}
