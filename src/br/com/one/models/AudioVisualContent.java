package br.com.one.models;

public class AudioVisualContent {
    private String title;
    private String synopsis;
    private double durationInMinutes;
    private int yearOfRelease;
    private String category;
    private int indicativeClassification;
    private double evaluationGrade;
    private int numberOfReviews;

    public String getTitle() {
        return title;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public double getDurationInMinutes() {
        return durationInMinutes;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public String getCategory() {
        return category;
    }

    public int getIndicativeClassification() {
        return indicativeClassification;
    }

    public int getNumberOfReviews() {
        return numberOfReviews;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public void setDurationInMinutes(double durationInMinutes) {
        this.durationInMinutes = durationInMinutes / 60;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setIndicativeClassification(int indicativeClassification) {
        this.indicativeClassification = indicativeClassification;
    }

    public void displayData() {
        System.out.printf("Título : %s \n", title);
        System.out.printf("Synopsis: %s \n", synopsis);
        System.out.printf("Duração: %.2f min \n", durationInMinutes);
        System.out.printf("Ano de Lançamento: %d \n", yearOfRelease);
        System.out.printf("Gênero: %s \n", category);
        System.out.printf("Classificação: %d anos \n", indicativeClassification);
    }

    public void evaluatesFilm(double nota) {
        evaluationGrade += nota;
        numberOfReviews++;
    }

    public double finalAverage(){
        return evaluationGrade / numberOfReviews;
    }
}
