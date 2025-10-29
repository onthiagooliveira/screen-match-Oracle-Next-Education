package br.com.one.models;

import br.com.one.calculator.Rating;

/**
 * Representa um episódio de uma série.
 * Contém informações sobre nome, número, total de visualizações e série a que pertence.
 */
public class Episode implements Rating {
    private int episodeNumber;
    private int totalViews;
    private String episodeName;
    private Series series;

    /**
     * Cria uma instância de Episode (episódio) associada a uma série.
     *
     * @param episodeNumber número do episódio na série
     * @param episodeName   nome/título do episódio
     * @param series        série à qual o episódio pertence
     * @param totalViews    número total de visualizações do episódio
     */
    public Episode(int episodeNumber, String episodeName, Series series, int totalViews) {
        this.episodeNumber = episodeNumber;
        this.episodeName = episodeName;
        this.series = series;
        this.totalViews = totalViews;
    }


    // ====================
    // Getters
    // ====================
    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public String getEpisodeName() {
        return episodeName;
    }

    public Series getSeries() {
        return series;
    }

    public int getTotalViews() {
        return totalViews;
    }

    // ====================
    // Setters
    // ====================
    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public void setEpisodeName(String episodeName) {
        this.episodeName = episodeName;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    /**
     * Retorna a classificação do episódio com base no número de visualizações.
     *
     * @return classificação do episódio
     */
    @Override
    public int getRating() {
        return totalViews > 100 ? 4 : 2;
    }
}
