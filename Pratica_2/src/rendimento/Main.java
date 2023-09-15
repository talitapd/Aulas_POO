package rendimento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor inicial do rendimento:");
        double vrInicial = ler.nextDouble();

        System.out.println("Digite a taxa de juros:");
        double txJuros = ler.nextDouble();

        System.out.println("Digite o numeroi de meses para rendimento: ");
        int numMeses = ler.nextInt();

        questao2 r1 = new questao2(vrInicial,txJuros,numMeses);
        r1.calculaRendimento();
    }
}
