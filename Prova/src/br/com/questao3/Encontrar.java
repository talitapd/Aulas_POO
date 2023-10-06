package br.com.questao3;
import java.util.Scanner;

public class Encontrar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o título: ");
        String titulo = scanner.nextLine();
        System.out.print("Digite a descrição: ");
        String descricao = scanner.nextLine();
        System.out.print("Digite o status: ");
        String status = scanner.nextLine();

        // Criar um objeto AchadoPerdido com base nas entradas do usuário
        AchadoPerdido achadoPerdido = new AchadoPerdido(titulo, descricao, "", "Tipo do item", "", "", status);

        System.out.print("Digite o título a ser buscado: ");
        String tituloBuscado = scanner.nextLine();
        scanner.close();

        String resultadoBusca = achadoPerdido.buscarTitulo(tituloBuscado);

        if (resultadoBusca != null) {
            System.out.println("Item encontrado!");
            System.out.println("Detalhes do item:");
            achadoPerdido.visualizarDetalhes();
        } else {
            System.out.println("Item não encontrado.");
        }
    }
}

