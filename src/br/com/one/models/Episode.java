package br.com.one.models;

import br.com.one.calculator.Rating;

public class Episode extends Series implements Rating {
    private int episodeNumber;
    private int totalViews;

    private String episodeName;
    private Series seriesThatBelongs;

    // Getters
    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public String getEpisodeName() {
        return episodeName;
    }

    public Series getSeriesThatBelongs() {
        return seriesThatBelongs;
    }

    public int getTotalViews() {
        return totalViews;
    }

    // Setters
    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public void setEpisodeName(String episodeName) {
        this.episodeName = episodeName;
    }

    public void setSeriesThatBelongs(Series seriesThatBelongs) {
        this.seriesThatBelongs = seriesThatBelongs;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    @Override
    public int getRating() {
        if (totalViews > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
