package br.com.one.calculator;

import br.com.one.models.AudioVisualContent;

public class TotalMediaTime {
    private double totalInMinutes;

    public double getTotalInMinutes() {
        return totalInMinutes;
    }

    public void calculatesMediaTimes(AudioVisualContent audioVisualContent) {
        this.totalInMinutes += audioVisualContent.getDurationInHours();
    }
}