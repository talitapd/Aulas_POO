package exercicio2;

public class main {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Talita", "talitadiniz@hotmail.com", "3198670-7572", "TI", 155.0, "12/04", "123", true);
        Funcionario func2 = new Funcionario("Talita", "talitadiniz@hotmail.com", "3198670-7572", "TI", 15.000, "12/45", "123", false);
        Funcionario func3 = new Funcionario("Talita", "talitadiniz@hotmail.com", "3198670-7572", "TI", 15.000, "12/03", "456", true);
        Funcionario func4 = new Funcionario("Talita", "talitadiniz@hotmail.com", "3198670-7572", "TI", 15.000, "12/12", "234", false);
        Funcionario func5 = new Funcionario("Talita", "talitadiniz@hotmail.com", "3198670-7572", "TI", 15.000, "12/12", "345", true);

        Empresa minhaEmpresa = new Empresa("ABC LTDA", "1234", 3);

        minhaEmpresa.adicionarFuncionario(func1);
        minhaEmpresa.adicionarFuncionario(func2);
        minhaEmpresa.adicionarFuncionario(func3);
        minhaEmpresa.adicionarFuncionario(func4);
        minhaEmpresa.adicionarFuncionario(func5);

        minhaEmpresa.mostrarFuncionarios();

    }
}
