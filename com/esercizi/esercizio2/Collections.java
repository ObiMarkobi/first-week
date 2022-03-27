package com.esercizi.esercizio2;

import java.util.ArrayList;

public class Collections {

    private String name;
    private String location;
    private ArrayList<ArtWork> artWorks = new ArrayList<>();

    /**
     * Costruttore vuoto
     */
    public Collections() {
    }

    /**
     *
     * @param name - nome della collezione, di tipo String
     * @param location - luogo della collezione, di tipo String
     */
    public Collections(String name, String location) {
        this.name = name;
        this.location = location;
    }

    /**
     *
     * @param name - nome della collezione, di tipo String
     * @param location - luogo della collezione, di tipo String
     * @param artWorks - lista di opere d'arte, di tipo ArtWork
     */
    public Collections(String name, String location, ArrayList<ArtWork> artWorks) {
        this.name = name;
        this.location = location;
        this.artWorks = artWorks;
    }

    /**
     *
     * @return - nome della collezione
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name - nome della collezione
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return - luogo della collezione
     */
    public String getLocation() {
        return location;
    }

    /**
     *
     * @param location - luogo della collezione
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     *
     * @return - lista delle opere d'arte
     */
    public ArrayList<ArtWork> getArtWorks() {
        return artWorks;
    }

    /**
     *
     * @param artWorks - lista delle opere d'arte
     */
    public void setArtWorks(ArrayList<ArtWork> artWorks) {
        this.artWorks = artWorks;
    }

    /**
     * Metodo che aggiunge alla collezione un'opera d'arte, inserita come parametro.
     * @param a - oggetto della classe ArtWork,ovvero un'opera d'arte
     */
    public void addArtWork(ArtWork a){
        artWorks.add(a);
    }

    /**
     * Stampa della collezione intera (Titolo e Artista) dell'opera d'arte a cui ci si riferisce,
     * con nome della collezione (presumibilmente un museo) e il suo luogo.
     */
    public void printCollection(){
        System.out.println("\nThe collection of the museum " + this.name +
                ", situated in " + this.location + ", is the following: \n");
        for(ArtWork a : artWorks){
            System.out.println("Title: "+ a.getTitle() + ",\tArtist: " + a.getArtist());
        }
    }

    /**
     * Stampa dell'ingombro di un'opera d'arte, inserita come parametro.
     * Funzionamento: se l'opera d'arte fa parte della collezione, stamperà l'ingombro; altrimenti stampa messaggio di mancanza opera.
     * @param a - un'opera d'arte, appartenente alla classe ArtWork
     */
    public void printEncumbrance(ArtWork a){

        if(!(this.artWorks.contains(a)))
            System.out.println("\nThe Art Work, named \"" + a.getTitle() + "\", is not included in the collection.");
        else
            System.out.println("\nThe Art Work's encumbrance is: " + a.printEncumbrance());

    }
}
