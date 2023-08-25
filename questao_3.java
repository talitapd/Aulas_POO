//Faça um programa que leia uma frase, calcule e mostre o número de vogais existentes.

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class questao_3 {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);

        String frase;
        int contVogal=0;
        System.out.println("Digite uma frase");
        frase = ler.nextLine();
        frase = frase.toUpperCase();

        for(int i=0;i<frase.length();i++){
            if (frase.charAt(i)== 'A'|| frase.charAt(i)== 'E' || frase.charAt(i)== 'I' || frase.charAt(i)== 'O'|| frase.charAt(i)== 'U')
                contVogal++;
        }
        System.out.println("Número de vogais na frase é " + contVogal );
    }
}
