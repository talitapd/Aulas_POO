package Atv_1;

public class Cliente {

    private String nome;
    private int sexo; // 0 para fem, 1 para masc
    private String telefone;
    private String cpf;
    private String email;

    public Cliente(String nome, int sexo, String telefone, String cpf, String email) {
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.cpf = cpf;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}