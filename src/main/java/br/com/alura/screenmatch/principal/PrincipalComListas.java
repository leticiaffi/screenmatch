package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Marley e eu",  2008);
        meuFilme.avalia(9);
        Filme filmeFlor = new Filme("Avatar 1",  2009);
        filmeFlor.avalia(6);
        Filme filmeJu = new Filme("Jurassic Park",  1993);
        filmeJu.avalia(4);
        Serie prisonBreak = new Serie("Prison Break",  2005);

        List<Titulo> lista = new ArrayList<>();
        lista.add(filmeJu);
        lista.add(filmeFlor);
        lista.add(meuFilme);
        lista.add(prisonBreak);
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
            System.out.println("Classificação" + filme.getClassificacao());
        }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Letícia");
        buscaPorArtista.add("Pedro");
        buscaPorArtista.add("Ju");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação : ");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de Titulos ordenados : ");
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano : ");
        System.out.println(lista);

    }
}
