package com.esercizi.esercizio2;

public class Square extends ArtWork {

    private double height;
    private double length;

    /**
     * Costruttore vuoto
     */
    public Square() {
    }

    /**
     * @param height - altezza del quadro
     * @param length - lunghezza del quadro
     */
    public Square(double height, double length) {
        this.height = height;
        this.length = length;
    }

    /**
     * @param title  - titolo dell'opera d'arte, in questo caso il quadro
     * @param artist - artista dell'opera d'arte, in questo caso il quadro
     * @param height - altezza del quadro
     * @param length - lunghezza del quadro
     */
    public Square(String title, String artist, double height, double length) {
        super(title, artist);
        this.height = height;
        this.length = length;
    }

    /**
     * @return - altezza del quadro
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height - altezza del quadro
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * @return - lunghezza del quadro
     */
    public double getLength() {
        return length;
    }

    /**
     * @param length - lunghezza del quadro
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Calcolo ingombro del quadro
     *
     * @return - ingombro
     */
    @Override
    public double printEncumbrance() {
        return length * height;
    }

}
