package exercicio2;


import javax.swing.*;

public class Funcionario extends Pessoa{
    private String departamento;
    private double salario;
    private String dataEntrada;
    private String rg;
    private boolean empregado;


    public Funcionario(String nome, String email, String telefone, String departamento, double salario,String dataEntrada,String rg, boolean empregado) {
        super(nome, email, telefone);
        this.departamento = departamento;
        this.salario = salario;
        this.dataEntrada= dataEntrada;
        this.rg = rg;
        this.empregado = true;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public boolean isEmpregado() {
        return empregado;
    }

    public void setEmpregado(boolean empregado) {
        this.empregado = empregado;
    }

    public void bonificar(double valor){
        salario += valor;
    }

    public void demitir(){
        this.empregado = false;
    }

    public void mostrardados(){
        String mensagem = "Nome: " + getNome() + "\n" + "Telefone: " + getTelefone() + "\n" + "RG: " + getRg() + "\n" +"Departamento: " + getDepartamento() + "\n" + "Salario: " + getSalario() + "\n" + "Data de Entrada na empresa: " + getDataEntrada() + "\n" + "Continua na empresa: " + isEmpregado() ;
        JOptionPane.showMessageDialog(null, mensagem,"DADOS FUNCIONARIOS", JOptionPane.INFORMATION_MESSAGE);
    }
}
