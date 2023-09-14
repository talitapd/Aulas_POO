package Pratica_01.Atv_3;

import java.util.Scanner;

//e) Criar no Void main() um objeto com dados solicitados e testes dos métodos
//implementados na classe: Construtor, avaliarAluno, avaliarRecuperação caso seja
//necessário. Os demais métodos também podem ser testados.
//Solicite os dados pelo teclado

 public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.println("Digite a matrícula: ");
        String matricula = scanner.nextLine();
        System.out.println("Digite a nota da AV1: ");
        double notaAV1 = scanner.nextDouble();
        System.out.println("Digite a nota da AV2: ");
        double notaAV2 = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer
        System.out.println("Digite o curso: ");
        String curso = scanner.nextLine();
        System.out.println("Digite o período: ");
        String periodo = scanner.nextLine();

        Aluno aluno = new Aluno(nome, matricula, notaAV1, notaAV2, curso, periodo);

        System.out.println("Notas do aluno:");
        System.out.println("AV1: " + notaAV1);
        System.out.println("AV2: " + notaAV2);

        System.out.println("Digite a nova nota da AV1: ");
        double novaNotaAV1 = scanner.nextDouble();
        aluno.alteraNotaAV1(novaNotaAV1);

        System.out.println("Digite a nova nota da AV2: ");
        double novaNotaAV2 = scanner.nextDouble();
        aluno.alteraNotaAV2(novaNotaAV2);

        System.out.println("Digite a nota da AE: ");
        double notaAE = scanner.nextDouble();
        aluno.alteraNotaAE(notaAE);

        System.out.println("Resultado da Avaliação:");
        aluno.avaliarAluno();

        scanner.close();
    }
}