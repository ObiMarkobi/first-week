package com.esercizi.esercizio2;

public class Sculpture extends ArtWork{

    private double height;
    private double length;
    private double depth;

    public Sculpture() {
    }

    public Sculpture(double height, double length, double depth) {
        this.height = height;
        this.length = length;
        this.depth = depth;
    }

    public Sculpture(String title, String artist, double height, double length, double depth) {
        super(title, artist);
        this.height = height;
        this.length = length;
        this.depth = depth;
    }

    public double encumbrance(){
        return height*length*depth;
    }

    @Override
    public double printEncumbrance() {
        return encumbrance();
    }
}
