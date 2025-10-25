package br.com.one.models;

import br.com.one.calculator.Rating;

public class Movie extends AudioVisualContent implements Rating {

    @Override
    public int getRating() {
        return (int) finalAverage() /2;
    }
}
