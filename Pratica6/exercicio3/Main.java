package exercicio3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int i;
        ArrayList<Artigo> artigos = new ArrayList<>();

        for (i= 1; i <= 10; i++){
            Artigo artigo = new Artigo("Titulo: " + i,"\nResumo: "+ i,"\nAutores: " + i);
            artigos.add(artigo);
        }

    Edicao edicao = new Edicao(1,2,"12/09/2023",54,"Teste");

        for (Artigo artigo : artigos){
            edicao.getArtigos().add(artigo);
        }
        RevistaCientifica revista = new RevistaCientifica("Exercico", 123456999978L, "Semanal");
        revista.adicionaEdicao(edicao);
    }
}
