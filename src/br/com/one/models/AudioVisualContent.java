package br.com.one.models;

public class AudioVisualContent {
    private String titleMedia;
    private String synopsis;
    private String category;

    private double durationInHours;
    private double evaluationGrade;

    private int yearOfRelease;
    private int selfClassification;
    private int numberOfReviews;

    // Getters
    public String getTitleMedia() {
        return titleMedia;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public double getDurationInHours() {
        return durationInHours;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public String getCategory() {
        return category;
    }

    public int getSelfClassification() {
        return selfClassification;
    }

    public int getNumberOfReviews() {
        return numberOfReviews;
    }

    // Setters
    public void setTitleMedia(String titleMedia) {
        this.titleMedia = titleMedia;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public void setDurationInHours(double durationInHours) {
        this.durationInHours = durationInHours / 60;
    }

    public void setYearOfRelease(int year) {
        this.yearOfRelease = year;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setSelfClassification(int selfClassification) {
        this.selfClassification = selfClassification;
    }

    /**
     * Exibe no console a ficha técnica completa do conteúdo audiovisual.
     * Inclui título, sinopse, ano, gênero, classificação, duração e média de avaliações.
     */
    public void displayData() {
        System.out.printf("""
                        ================================
                        Título                 : %s
                        Sinopse                : %s
                        Ano                    : %d
                        Gênero                 : %s
                        Classificação Indicativa: %d
                        Duração (minutos)      : %.2f
                        Média de avaliações    : %.1f
                        Número de avaliações   : %d
                        ================================
                        """,
                titleMedia,
                synopsis,
                yearOfRelease,
                category,
                selfClassification,
                getDurationInHours(),
                finalAverage(),
                numberOfReviews
        );
    }

    /**
     * Realiza a avaliação de um conteúdo audiovisual.
     *
     * @param nota nota de avaliação de um conteúdo
     */
    public void evaluatesContentAudioVisual(double nota) {
        evaluationGrade += nota;
        numberOfReviews++;
    }

    /**
     * Realiza calculo de avaliação do conteúdo com base na nota e no número de visualizações.
     *
     * @return nota final de avaliação do conteúdo
     */
    public double finalAverage() {
        return evaluationGrade / numberOfReviews;
    }

}
