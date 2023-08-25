//Faça um programa que leia o tempo gasto numa viagem (em horas), a velocidade média
//e o valor km por litro de um veículo. Calcule o consumo final de combustível gasto.

import java.util.Scanner;

public class Pratica_1 {
    public static void main(String[] args) {
        double velocidade, tempo, distancia, kmLitro,consumo;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a velocidade:");
        velocidade = ler.nextDouble();
        System.out.println("Digite o tempo gasto:");
        tempo = ler.nextDouble();
        System.out.println("Digite o km/Litro:");
        kmLitro = ler.nextDouble();
        distancia = velocidade * tempo;
        consumo = distancia / kmLitro;
        System.out.println("O consumo médio: "+ consumo);
    }
}
