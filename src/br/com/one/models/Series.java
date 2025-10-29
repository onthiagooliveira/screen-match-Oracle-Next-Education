package br.com.one.models;

/**
 * Representa uma série de TV.
 * Contém informações sobre temporadas, episódios e duração de cada episódio.
 */
public class Series extends AudioVisualContent {
    private int seasons;
    private int episodesPerSeason;
    private int episodeDuration; // em minutos
    private boolean active;

    /**
     * Cria uma instância de Series (série) com todos os atributos necessários.
     *
     * @param title              título da série
     * @param synopsis           sinopse da série
     * @param year               ano de lançamento
     * @param category           categoria/ gênero da série
     * @param selfClassification classificação indicativa da série
     * @param seasons            número de temporadas
     * @param episodesPerSeason  número de episódios por temporada
     * @param episodeDuration    duração de cada episódio em minutos
     * @param active             indica se a série está ativa/exibindo novos episódios
     */
    public Series(String title, String synopsis, int year, String category, int selfClassification,
                  int seasons, int episodesPerSeason, int episodeDuration, boolean active) {
        super();
        super.setTitleMedia(title);
        super.setSynopsis(synopsis);
        super.setYearOfRelease(year);
        super.setCategory(category);
        super.setSelfClassification(selfClassification);
        this.seasons = seasons;
        this.episodesPerSeason = episodesPerSeason;
        this.episodeDuration = episodeDuration;
        this.active = (boolean) active;
    }

    // ====================
    // Getters
    // ====================
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
        return active;
    }

    // ====================
    // Setters
    // ====================
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
        this.active = active;
    }

    /**
     * Calcula a duração total da série em horas.
     *
     * @return duração total da série em horas
     */
    @Override
    public double getDurationInHours() {
        return (double) (episodesPerSeason * episodeDuration * seasons) / 60;
    }

    @Override
    public String toString() {
        return "Série: " + getTitleMedia() + " (" + getYearOfRelease() + ")";
    }
}