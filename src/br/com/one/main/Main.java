package br.com.one.main;

import br.com.one.calculator.RecommendationFilter;
import br.com.one.models.Episode;
import br.com.one.models.Movie;
import br.com.one.models.Series;

/**
 * Classe principal da aplicação de gerenciamento de mídia.
 * Demonstra a criação de filmes, séries e episódios,
 * avaliações e filtragem de recomendações.
 *
 * @author Thiago Alves
 * @version 2.0
 */
public class Main {

    public static void main(String[] args) {

        // =========================
        // Criação e avaliação de um filme
        // =========================
        Movie granTorino = new Movie(
                "Gran Torino",
                """
                Walt, um veterano viúvo da Guerra da Coreia enfrenta seus próprios preconceitos enquanto protege seu
                Gran Torino 1972 e seus vizinhos imigrantes asiáticos de uma gangue.""",
                93.6,
                2008,
                "Drama",
                14
        );

        granTorino.evaluatesContentAudioVisual(7.5);
        granTorino.evaluatesContentAudioVisual(8.9);

        displayMovieData(granTorino);

        // =========================
        // Criação e avaliação de uma série
        // =========================
        Series theOffice = new Series(
                "The Office",
                """
                Esta série hilária retrata o cotidiano caótico de funcionários insatisfeitos e um chefe sem noção.""",
                2005,
                "Comédia",
                12,
                9,
                8,
                21,
                true
        );

        theOffice.evaluatesContentAudioVisual(8.1);
        theOffice.evaluatesContentAudioVisual(8.3);
        theOffice.evaluatesContentAudioVisual(7.7);

        displaySeriesData(theOffice);

        // =========================
        // Criação e avaliação de um episódio
        // =========================
        Episode episodio = new Episode(
                1,
                "Dander Muffin",
                theOffice,
                60
        );

        RecommendationFilter filtro = new RecommendationFilter();
        filtro.filter(granTorino);
        filtro.filter(episodio);
    }

    private static void displayMovieData(Movie movie) {
        movie.displayData();
        System.out.printf("Duração: %.2f min\n", movie.getDurationInHours());
        System.out.printf("Avaliação média: %.1f\n", movie.finalAverage());
        System.out.printf("Número de avaliações: %d\n", movie.getNumberOfReviews());
    }

    private static void displaySeriesData(Series series) {
        series.displayData();
        System.out.printf("Tempo para maratonar: %.2f min\n", series.getDurationInHours());
        System.out.printf("Avaliação média: %.1f\n", series.finalAverage());
        System.out.printf("Número de avaliações: %d\n", series.getNumberOfReviews());
    }
}
