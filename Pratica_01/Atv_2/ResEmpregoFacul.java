package Pratica_01.Atv_2;

public class ResEmpregoFacul {
    public static void main(String[] args) {
        EmpregadoDaFaculdade empregado = new EmpregadoDaFaculdade();
        empregado.setNome("João");
        empregado.setSalario(2000.0);
        empregado.setHorasAula(10);

        double gastos = empregado.getGastos();
        String info = empregado.getInfo();

        System.out.println("Resultado do getGastos(): " + gastos);
        System.out.println("Resultado do getInfo(): " + info);
    }
}
