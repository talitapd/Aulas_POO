package exercicio2;
public class Empresa {
    private String nome;
    private String cnpj;
    private int qtd_de_funcionario;
    private Funcionario[] funcionarios;

    public Empresa(String nome, String cnpj, int qtd_de_funcionario) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.qtd_de_funcionario = qtd_de_funcionario;
        this.funcionarios = new Funcionario[100];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getQtd_de_funcionario() {
        return qtd_de_funcionario;
    }

    public void setQtd_de_funcionario(int qtd_de_funcionario) {
        this.qtd_de_funcionario = qtd_de_funcionario;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        if (this.qtd_de_funcionario < 100) {
            this.funcionarios[this.qtd_de_funcionario] = funcionario;
            this.qtd_de_funcionario++;
            System.out.println("Funcionário " + getNome() + " adicionado com sucesso!");
        } else {
            System.out.println("Não é possível adicionar mais funcionários.");
        }
    }

    public void mostrarFuncionarios() {
        for (int i = 0; i < this.qtd_de_funcionario; i++) {
            this.funcionarios[i].mostrardados();
        }
    }
}