package br.com.questao3;

public class Main {
    public static void main(String[] args) {
    Caminhao ca = new Caminhao("vgt425",2010,2);
        System.out.println("\n" + ca.toString());
    Onibus on = new Onibus("dfr253", 2015, 5);
        System.out.println("\n" + on.toString());
    }
}
