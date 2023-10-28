package exercicio1;

import javax.swing.*;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        String nomeRedeSocial = JOptionPane.showInputDialog(null,"Informe o nome da Rede Social: ","REDE SOCICAL",JOptionPane.PLAIN_MESSAGE);
        String descricaoRedeSocial = JOptionPane.showInputDialog(null,"Informe a descrição da Rede Social: ","REDE SOCIAL",JOptionPane.PLAIN_MESSAGE);

        RedeSocial redeSocial = new RedeSocial(nomeRedeSocial,descricaoRedeSocial);

        String datapublicacao1 = JOptionPane.showInputDialog(null,"Informe a Data da publicação: ", "PUBLICAÇÃO",JOptionPane.INFORMATION_MESSAGE);
        String textopublicacao1 = JOptionPane.showInputDialog(null, "Informe o texto da publicação: ","PUBLICAÇÃO",JOptionPane.INFORMATION_MESSAGE);
        String linkpublicacao1 = JOptionPane.showInputDialog(null, "Informe o link da publicação: ", "PUBLICAÇÃO",JOptionPane.INFORMATION_MESSAGE);
        Publicacao publicacao1 = new Publicacao(datapublicacao1,textopublicacao1,linkpublicacao1);

        String datapublicacao2 = JOptionPane.showInputDialog(null,"Informe a Data da  Segunda publicação: ","PUBLICAÇÃO",JOptionPane.INFORMATION_MESSAGE);
        String textopublicacao2 = JOptionPane.showInputDialog(null,"Informe o texto da  Segunda publicação: ", "PUBLICAÇÃO",JOptionPane.INFORMATION_MESSAGE);
        String linkpublicacao2 = JOptionPane.showInputDialog(null,"Informe o link da Segunda publicação: ", "PUBLICAÇÃO",JOptionPane.INFORMATION_MESSAGE);
        Publicacao publicacao2 = new Publicacao(datapublicacao2,textopublicacao2,linkpublicacao2);

        redeSocial.inserePublicacao(publicacao1);
        redeSocial.inserePublicacao(publicacao2);

        redeSocial.imprimePublicacoes();

    }
}
