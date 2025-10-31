package br.com.one.main;

import br.com.one.calculator.RecommendationFilter;
import br.com.one.models.Episode;
import br.com.one.models.Movie;
import br.com.one.models.Series;
import br.com.one.services.ConnectTMDB;

import java.io.IOException;
import java.util.ArrayList;


/**
 * Classe principal da aplicação de gerenciamento de mídia.
 * Demonstra a criação de filmes, séries e episódios,
 * avaliações e filtragem de recomendações.
 *
 * @author Thiago Alves
 * @version 2.0
 */
public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        // Realiza a conexão com a API The Movie Database (TMDB)
        ConnectTMDB.connect();

    }
}
