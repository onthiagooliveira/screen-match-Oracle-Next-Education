import br.com.one.models.AudioVisualContent;
import br.com.one.models.Series;

public class Main {
    public static void main(String[] args) {

        AudioVisualContent audVisualContent = new AudioVisualContent();
        audVisualContent.setTitle("Gran Torino\n");
        audVisualContent.setSynopsis("""
                Walt, um veterano viúvo da Guerra da Coreia enfrenta seus próprios preconceitos enquanto protege seu
                Gran Torino 1972 e seus vizinhos imigrantes asiáticos de uma gangue.
                """);
        audVisualContent.setDurationInHours(93.6);
        audVisualContent.setYearOfRelease(2008);
        audVisualContent.setCategory("Drama");
        audVisualContent.setSelfClassification(14);

        audVisualContent.displayData();

        audVisualContent.evaluatesContentAudioVisual(9.1);
        audVisualContent.evaluatesContentAudioVisual(8.7);


        System.out.printf("Nota: %.1f \n", audVisualContent.finalAverage());
        System.out.printf("Avaliações: %d \n", audVisualContent.getNumberOfReviews());

        Series serie = new Series();
        audVisualContent.setTitle("Gotham");
        audVisualContent.setSynopsis("""
                Antes de Batman, a cidade de Gotham já existia. James Gordon (Ben McKenzie) é um detetive iniciante 
                polícia. Corajoso, sincero e ansioso para mostrar serviço, o recém-promovido tem como missão solucionar
                o caso do assassinato dos bilionários Thomas e Martha Wayne, um dos casos mais complexos da cidade. Com
                seu parceiro, o oficial Harvey Bullock (Donal Logue), Gordon conhece o único sobrevivente do assassinato:
                Bruce (David Mazuouz), um garoto de 12 anos, filho do casal, por quem ele imediatamente sente uma grande
                afeição.
                """);
        audVisualContent.setYearOfRelease(2014);
        audVisualContent.setCategory("Policial");
        audVisualContent.setSelfClassification(14);
        serie.setSeasons(4);
        serie.setEpisodesPerSeason(4);
        serie.setEpisodeDuration(22);

        audVisualContent.evaluatesContentAudioVisual(8.9);
        audVisualContent.displayData();
        System.out.printf("Nota: %.1f\n", audVisualContent.finalAverage());
        System.out.printf("Temporadas: %d\n", serie.getSeasons());
        System.out.printf("Episódios: %d\n", serie.getEpisodesPerSeason());
        System.out.printf("Tempo para maratonar: %.2f", serie.getDurationInHours());


    }
}
