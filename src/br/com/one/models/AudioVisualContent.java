package br.com.one.models;

public class AudioVisualContent {
    private String title;
    private String synopsis;
    private String category;

    private double durationInHours;
    private double evaluationGrade;

    private int yearOfRelease;
    private int selfClassification;
    private int numberOfReviews;

    // Getters
    public String getTitle() {
        return title;
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
    public void setTitle(String title) {
        this.title = title;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public void setDurationInHours(double durationInHours) {
        this.durationInHours = durationInHours / 60;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setSelfClassification(int selfClassification) {
        this.selfClassification = selfClassification;
    }

    // Displays technical data sheet
    public void displayData() {
        System.out.printf("""
                Título : %s
                Synopsis: %s
                Duração: %.1f min
                Ano: %d
                Gênero: %s
                Classificação indicativa: %d
                """, title, synopsis, durationInHours, yearOfRelease, category, selfClassification);
    }

    // Evaluates content audio visual
    public void evaluatesContentAudioVisual(double nota) {
        evaluationGrade += nota;
        numberOfReviews++;
    }

    public double finalAverage() {
        return evaluationGrade / numberOfReviews;
    }
}
