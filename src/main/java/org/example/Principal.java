package org.example;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args){
        Filme meuFilme = new Filme();
        meuFilme.setNome("Marley e eu");
        meuFilme.setAnoDeLancamento(2008);
        meuFilme.setDuracaoEmMinutos(155);

        meuFilme.exibeFichaTenica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie prisonBreak = new Serie();
        prisonBreak.setNome("Prison Break");
        prisonBreak.setAnoDeLancamento(2005);
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
    }


}