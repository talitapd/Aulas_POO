package br.com.questao1;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        CartaoCredito cc = new CartaoCredito("05/10/2023 05:00:00", 50,60,"12356","MASTER","Talita");
        CartaoDebito cd = new CartaoDebito("05/10/2023 6:00", 635,60,"256398","Guilherme");
        Pix p = new Pix("05/10/2023 22:00", 562,63,true);

        System.out.println("\n Informações de pagamento CARTÃO DE CREDITO: \n" + cc.imprimirCupomFiscal());
        System.out.println("\n Informações de pagamento CARTÃO DE DEBITO: \n" + cd.imprimirCupomFiscal());
        System.out.println("\n Informações  de pagamento PIX: \n" + p.imprimirCupomFiscal());
    }
}