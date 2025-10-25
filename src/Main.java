import br.com.one.calculator.RecommendationFilter;
import br.com.one.calculator.TotalMediaTime;
import br.com.one.models.AudioVisualContent;
import br.com.one.models.Episode;
import br.com.one.models.Movie;
import br.com.one.models.Series;

public class Main {
    public static void main(String[] args) {

        // Instancia um filme
        Movie granTorino = new Movie();
        granTorino.setTitle("Gran Torino");
        granTorino.setSynopsis("""
                Walt, um veterano viúvo da Guerra da Coreia enfrenta seus próprios preconceitos enquanto protege seu Gran
                Torino 1972 e seus vizinhos imigrantes asiáticos de uma gangue.""");
        granTorino.setDurationInHours(93.6);
        granTorino.setYearOfRelease(2008);
        granTorino.setCategory("Drama");
        granTorino.setSelfClassification(14);

        // Avaliando o filme
        granTorino.evaluatesContentAudioVisual(7.5);
        granTorino.evaluatesContentAudioVisual(8.9);

        // Exibindo os dados
        granTorino.displayData();
        System.out.printf("Duração: %.2f min\n", granTorino.getDurationInHours());
        System.out.printf("Avaliação: %.1f\n", granTorino.finalAverage());
        System.out.printf("Número de avaliações: %d\n", granTorino.getNumberOfReviews());

        // Instancia uma série
        Series theOffice = new Series();
        theOffice.setTitle("The Office");
        theOffice.setSynopsis("""
                Esta série hilária retrata o cotidiano caótico de funcionários insatisfeitos e um chefe sem noção.""");
        theOffice.setYearOfRelease(2005);
        theOffice.setCategory("Comédia");
        theOffice.setSelfClassification(12);
        theOffice.setSeasons(9);
        theOffice.setEpisodesPerSeason(8);
        theOffice.setEpisodeDuration(21);

        // Avaliando the Office
        theOffice.evaluatesContentAudioVisual(8.1);
        theOffice.evaluatesContentAudioVisual(8.3);
        theOffice.evaluatesContentAudioVisual(7.7);

        // Exibindo os dados
        theOffice.displayData();
        System.out.printf("tempo para maratonar: %.2f min\n", theOffice.getDurationInHours());
        System.out.printf("Avaliação: %.1f\n", theOffice.finalAverage());
        System.out.printf("Número de avaliações: %d\n", theOffice.getNumberOfReviews());


        // Verificando filtragem
        RecommendationFilter filtro = new RecommendationFilter();
        filtro.filter(granTorino);

        Episode episodio = new Episode();
        episodio.setEpisodeName("Dander Muffin");
        episodio.setEpisodeNumber(1);
        episodio.setTotalViews(60); // Lógica de ranking para séries = número de exibições dos episódios
        filtro.filter(episodio);
    }
}
