package br.com.one.models;

import br.com.one.calculator.Rating;

/**
 * Representa um filme com informações como título, sinopse, duração e categoria.
 * Implementa a interface Rating para avaliação do filme.
 */
public class Movie extends AudioVisualContent implements Rating {

    /**
     * Cria uma instância de Movie (filme) com todos os atributos necessários.
     *
     * @param title             título do filme
     * @param synopsis          sinopse do filme
     * @param duration          duração em minutos
     * @param year              ano de lançamento
     * @param category          categoria/ gênero do filme
     * @param selfClassification classificação indicativa do filme
     */
    public Movie(String title, String synopsis, double duration, int year, String category, int selfClassification) {
        setTitleMedia(title);
        setSynopsis(synopsis);
        setDurationInHours(duration);
        setYearOfRelease(year);
        setCategory(category);
        setSelfClassification(selfClassification);
    }


    /**
     * Retorna a classificação do filme em uma escala de 0 a 5.
     * Baseia-se na média final das avaliações.
     *
     * @return classificação do filme
     */
    @Override
    public int getRating() {
        return (int) (finalAverage() / 2);
    }

    @Override
    public String toString() {
        return "Filme: " + getTitleMedia() + " (" + getYearOfRelease() + ")";
    }
}
