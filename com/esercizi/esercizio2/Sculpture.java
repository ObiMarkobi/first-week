package com.esercizi.esercizio2;

public class Sculpture extends ArtWork {

    private double height;
    private double length;
    private double depth;

    /**
     * Costruttore vuoto
     */
    public Sculpture() {
    }

    /**
     * @param height - altezza scultura
     * @param length - lunghezza scultura
     * @param depth  - profondità scultura
     */
    public Sculpture(double height, double length, double depth) {
        this.height = height;
        this.length = length;
        this.depth = depth;
    }

    /**
     * @param title  - titolo dell'opera d'arte, preso dalla superclasse
     * @param artist - artista dell'opera d'arte, preso dalla superclasse
     * @param height - altezza della scultura
     * @param length - lunghezza della scultura
     * @param depth  - profondità della scultura
     */
    public Sculpture(String title, String artist, double height, double length, double depth) {
        super(title, artist);
        this.height = height;
        this.length = length;
        this.depth = depth;
    }

    /**
     * Calcolo ingombro della scultura.
     *
     * @return - ingombro
     */
    @Override
    public double printEncumbrance() {
        return height * length * depth;
    }
}
