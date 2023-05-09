package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("Marley e eu", 2008);
        meuFilme.setDuracaoEmMinutos(115);

        Filme filmeFlor = new Filme("Avatar 1", 2009);
        filmeFlor.setDuracaoEmMinutos(162);

        Filme filmeJu = new Filme("Jurassic Park", 1993);
        filmeJu.setAnoDeLancamento(1993);
        filmeJu.setDuracaoEmMinutos(127);

        meuFilme.exibeFichaTenica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie prisonBreak = new Serie("Prison Break", 2005);
        prisonBreak.setEpisodiosPorTemporada(15);
        prisonBreak.setMinutosPorEpisodio(60);
        prisonBreak.setTemporadas(5);
        prisonBreak.exibeFichaTenica();
        System.out.println("Duracao total: " + prisonBreak.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(prisonBreak);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(prisonBreak);
        filtro.filtra(episodio);


        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeJu);
        listaDeFilmes.add(filmeFlor);
        listaDeFilmes.add(meuFilme);
        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme " + listaDeFilmes.get(0).toString());
    }


}