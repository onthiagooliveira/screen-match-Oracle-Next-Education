package br.com.one.models;

public class Episode {
    private int episodeNumber;
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
}
