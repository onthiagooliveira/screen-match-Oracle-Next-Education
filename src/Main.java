import br.com.one.models.Movie;

public class Main {
    public static void main(String[] args) {

        Movie mv = new Movie();
        mv.setTitle("Gran Torino");
        mv.setSynopsis("""
                Walt, um veterano viúvo da Guerra da Coreia enfrenta seus próprios preconceitos enquanto protege seu
                Gran Torino 1972 e seus vizinhos imigrantes asiáticos de uma gangue.""");
        mv.setDurationInMinutes(93.6);
        mv.setYearOfRelease(2008);
        mv.setCategory("Drama");
        mv.setIndicativeClassification(14);

        mv.displayData();
        mv.evaluatesFilm(9.1);
        mv.evaluatesFilm(8.7);
        System.out.printf("Nota: %.1f \n", mv.finalAverage());
        System.out.printf("Avaliações: %d \n", mv.getNumberOfReviews());
    }
}
