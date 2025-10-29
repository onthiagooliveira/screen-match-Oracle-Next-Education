package br.com.one.main;

import br.com.one.models.AudioVisualContent;
import br.com.one.models.Movie;
import br.com.one.models.Series;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Classe principal da aplicação para demonstrar o uso de listas de conteúdos audiovisuais.
 * <p>
 * A classe {@code MainLists} simula uma pequena aplicação de streaming, criando
 * instâncias de {@link Movie} e {@link Series}, armazenando-as em uma lista e
 * exibindo informações sobre cada conteúdo.
 * </p>
 *
 * <p><b>Funcionalidades demonstradas:</b></p>
 * <ul>
 *     <li>Criação e instanciação de objetos das classes {@code Movie} e {@code Series};</li>
 *     <li>Armazenamento de diferentes tipos de conteúdo em uma lista genérica ({@code ArrayList});</li>
 *     <li>Uso de polimorfismo para percorrer e exibir os dados de cada conteúdo;</li>
 *     <li>Avaliação e cálculo da média de notas dos conteúdos.</li>
 * </ul>
 *
 * <p><b>Autor:</b> Thiago Alves</p>
 * <p><b>Versão:</b> 1.0</p>
 * <p><b>Desde:</b> 2025</p>
 */
public class MainLists {

    public static void main(String[] args) {

        // =========================
        // Criação da lista principal de conteúdos
        // =========================
        ArrayList<AudioVisualContent> playList = new ArrayList<>();

        // =========================
        // Criação dos filmes e séries disponíveis
        // =========================
        Movie granTorino = new Movie(
                "Gran Torino",
                """
                        Walt, um veterano viúvo da Guerra da Coreia enfrenta seus próprios preconceitos enquanto protege
                        seu Gran Torino 1972 e seus vizinhos imigrantes asiáticos de uma gangue.
                        """,
                93.6,
                2008,
                "Drama",
                14
        );
        granTorino.evaluatesContentAudioVisual(8.5);

        Movie batmanTheDarkNight = new Movie(
                "Batman: O Cavaleiro das Trevas",
                """
                        Batman, tenente Gordon e o promotor público continuam a desmantelar o submundo do crime de Gotham,
                        mas um novo vilão ameaça destruir o trabalho deles.
                        """,
                139.20,
                2008,
                "Ação",
                12
        );
        batmanTheDarkNight.evaluatesContentAudioVisual(10);

        Movie theAvengersUltimate = new Movie(
                "Vingadores: Ultimato",
                """
                        As consequências devastadoras dos atos de Thanos, que dizimaram metade das criaturas do universo
                        e destruíram os Vingadores, leva os heróis remanescentes a tomarem uma atitude final na grande
                        conclusão da sequência de vinte e dois filmes da Marvel Studios, "Vingadores: Ultimato”.
                        """,
                186,
                2019,
                "Ação",
                12
        );
        theAvengersUltimate.evaluatesContentAudioVisual(9.1);

        Series theOffice = new Series(
                "The Office",
                """
                        Esta série hilária retrata o cotidiano caótico de funcionários insatisfeitos e um chefe sem noção.
                        """,
                2005,
                "Comédia",
                12,
                9,
                8,
                21,
                true
        );
        theOffice.evaluatesContentAudioVisual(8.9);

        // =========================
        // Adicionando os conteúdos à lista
        // =========================
        playList.add(granTorino);
        playList.add(batmanTheDarkNight);
        playList.add(theAvengersUltimate);
        playList.add(theOffice);

        // =========================
        // Organizando os conteúdos disponíveis
        // =========================
        Collections.sort(playList);

        // =========================
        // Exibição dos conteúdos disponíveis
        // =========================
        System.out.println("🎬 Lista de conteúdos disponíveis:");
        System.out.println();

        for (AudioVisualContent item : playList) {
            System.out.println("================================");
            System.out.println("Título: " + item.getTitleMedia());
            System.out.printf("Média de avaliações: %.1f%n", item.finalAverage());

            if (item instanceof Movie filme) {
                System.out.println("Tipo: Filme");
                System.out.println("Ranking (0–5): " + filme.getRating());
            } else if (item instanceof Series serie) {
                System.out.println("Tipo: Série");
                System.out.println("Número de temporadas: " + serie.getSeasons());
            }
        }

    }
}
