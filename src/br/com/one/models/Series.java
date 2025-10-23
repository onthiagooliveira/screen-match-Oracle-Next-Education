package br.com.one.models;

public class Series extends AudioVisualContent {
    private int seasons;
    private int episodesPerSeason;
    private int episodeDuration;

    private boolean isActive;

    // Getters
    public int getSeasons() {
        return seasons;
    }

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public int getEpisodeDuration() {
        return episodeDuration;
    }

    public boolean isActive() {
        return isActive;
    }

    @Override
    public double getDurationInHours() {
        return (double) (episodesPerSeason * episodeDuration * seasons) / 60;
    }

    // Setters

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public void setEpisodeDuration(int episodeDuration) {
        this.episodeDuration = episodeDuration;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}

