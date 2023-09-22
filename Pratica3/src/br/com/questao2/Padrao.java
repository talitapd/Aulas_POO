package br.com.questao2;

public class Padrao extends Funcionario {

    public Padrao(int matricula, String nome, double salario) {
        super(matricula, nome, salario);
    }

    public double calcularProventos() {
        return getSalario();
    }
}
