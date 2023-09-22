package br.com.questao1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Normal n1 = new Normal(100);
        n1.imprimeIngresso();
        Vip v1 = new Vip(100,20);
        v1.imprimeIngresso();
        Camarote c1 = new Camarote(100,100,"Camarote");
        c1.imprimeIngresso();*/

        Scanner menu = new Scanner(System.in);
        System.out.println(" Escolha o seu ingresso: ");
        System.out.println(" 1 - Ingresso Normal ");
        System.out.println(" 2- Ingresso Vip");
        System.out.println(" 3 - Ingresso Camarote");

        int opcao = menu.nextInt();

        switch (opcao) {
            case 1:
                /*System.out.println();*/
                Normal n1 = new Normal(100);
                n1.imprimeIngresso();
                break;

            case 2:
                Vip v1 = new Vip(100, 20);
                v1.imprimeIngresso();
                break;

            case 3:
                Camarote c1 = new Camarote(100,100,"Camarote");
                c1.imprimeIngresso();
        }
    }
}
