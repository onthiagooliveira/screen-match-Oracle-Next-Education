package br.com.one.models;

/**
 * Representa um conteúdo audiovisual, como filmes, séries ou documentários.
 * <p>
 * Esta classe armazena informações básicas sobre o conteúdo, como título,
 * sinopse, categoria, duração, ano de lançamento e classificação indicativa.
 * Também permite o registro e cálculo de avaliações de usuários.
 * </p>
 *
 * @author Thiago
 * @version 1.0
 * @since 2025
 */
public class AudioVisualContent {

    /** Título do conteúdo audiovisual. */
    private String titleMedia;

    /** Sinopse ou descrição breve do conteúdo. */
    private String synopsis;

    /** Categoria ou gênero do conteúdo (ex: Ação, Drama, Comédia). */
    private String category;

    /** Duração do conteúdo em horas. */
    private double durationInHours;

    /** Soma total das notas de avaliação recebidas. */
    private double evaluationGrade;

    /** Ano de lançamento do conteúdo. */
    private int yearOfRelease;

    /** Classificação indicativa (ex: 10, 12, 16, 18). */
    private int selfClassification;

    /** Número total de avaliações recebidas. */
    private int numberOfReviews;

    /**
     * Construtor completo do conteúdo audiovisual.
     *
     * @param titleMedia         título do conteúdo
     * @param synopsis           sinopse do conteúdo
     * @param category           categoria ou gênero
     * @param durationInHours    duração em horas
     * @param yearOfRelease      ano de lançamento
     * @param selfClassification classificação indicativa
     */
    public AudioVisualContent(String titleMedia, String synopsis, String category, double durationInHours,
                              int yearOfRelease, int selfClassification) {
        this.titleMedia = titleMedia;
        this.synopsis = synopsis;
        this.category = category;
        this.durationInHours = durationInHours;
        this.yearOfRelease = yearOfRelease;
        this.selfClassification = selfClassification;
    }

    /** Construtor padrão (sem parâmetros). */
    public AudioVisualContent() {
    }

    // ============================================================
    // Getters
    // ============================================================

    /** @return o título do conteúdo */
    public String getTitleMedia() {
        return titleMedia;
    }

    /** @return a sinopse do conteúdo */
    public String getSynopsis() {
        return synopsis;
    }

    /** @return a duração em horas */
    public double getDurationInHours() {
        return durationInHours;
    }

    /** @return o ano de lançamento */
    public int getYearOfRelease() {
        return yearOfRelease;
    }

    /** @return a categoria ou gênero */
    public String getCategory() {
        return category;
    }

    /** @return a classificação indicativa */
    public int getSelfClassification() {
        return selfClassification;
    }

    /** @return o número de avaliações */
    public int getNumberOfReviews() {
        return numberOfReviews;
    }

    // ============================================================
    // Setters
    // ============================================================

    /**
     * Define o título do conteúdo.
     *
     * @param titleMedia título a ser definido
     */
    public void setTitleMedia(String titleMedia) {
        this.titleMedia = titleMedia;
    }

    /**
     * Define a sinopse do conteúdo.
     *
     * @param synopsis sinopse a ser definida
     */
    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    /**
     * Define a duração do conteúdo em minutos, convertendo para horas.
     *
     * @param durationInHours duração em minutos
     */
    public void setDurationInHours(double durationInHours) {
        this.durationInHours = durationInHours / 60;
    }

    /**
     * Define o ano de lançamento.
     *
     * @param year ano de lançamento
     */
    public void setYearOfRelease(int year) {
        this.yearOfRelease = year;
    }

    /**
     * Define a categoria ou gênero do conteúdo.
     *
     * @param category categoria a ser definida
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Define a classificação indicativa.
     *
     * @param selfClassification classificação indicativa
     */
    public void setSelfClassification(int selfClassification) {
        this.selfClassification = selfClassification;
    }

    // ============================================================
    // Métodos utilitários
    // ============================================================

    /**
     * Exibe no console a ficha técnica completa do conteúdo audiovisual.
     * <p>
     * Inclui título, sinopse, ano, gênero, classificação indicativa,
     * duração, média e número de avaliações.
     * </p>
     */
    public void displayData() {
        System.out.printf("""
                        ================================
                        Título                  : %s
                        Sinopse                 : %s
                        Ano                     : %d
                        Gênero                  : %s
                        Classificação Indicativa: %d
                        Duração (horas)         : %.2f
                        Média de avaliações     : %.1f
                        Número de avaliações    : %d
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
     * Registra uma nova avaliação para o conteúdo audiovisual.
     *
     * @param nota nota atribuída ao conteúdo (0 a 10)
     */
    public void evaluatesContentAudioVisual(double nota) {
        evaluationGrade += nota;
        numberOfReviews++;
    }

    /**
     * Calcula a média das avaliações do conteúdo audiovisual.
     *
     * @return média das avaliações ou 0.0 se ainda não houver avaliações
     */
    public double finalAverage() {
        return evaluationGrade / numberOfReviews;
    }
}
