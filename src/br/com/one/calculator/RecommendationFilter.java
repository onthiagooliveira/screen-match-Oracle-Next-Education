package br.com.one.calculator;

public class RecommendationFilter {

    public void filter(Rating rating) {
        if (rating.getRating() >= 4) {
            System.out.println("\uD83D\uDD25 Em alta");
        } else if (rating.getRating() >= 2) {
            System.out.println("\uD83E\uDD48 Bem avaliado");
        } else {
            System.out.println("\uD83C\uDFAC Assistir depois");
        }
    }
}
