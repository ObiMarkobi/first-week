package com.esercizi.esercizio2;

public abstract class ArtWork {

    protected String title;
    protected String artist;

    /**
     * Costruttore vuoto
     */
    public ArtWork() {
    }

    /**
     * @param title  - titolo dell'opera d'arte
     * @param artist - nome dell'artista
     */
    public ArtWork(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    /**
     * @return - titolo dell'artista
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title - titolo dell'artista
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return - nome dell'artista
     */
    public String getArtist() {
        return artist;
    }

    /**
     * @param artist - nome dell'artista
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * Metodo astratto della superclasse
     *
     * @return - l'ingombro dell'opera
     */
    public abstract double printEncumbrance();


    /**
     * Metodo boolean, il quale inizialmente confronta la classe del parametro (oggetto "o" di tipo Object) con la classe dell'oggetto che lo invoca (ovviamente di tipo ArtWork);
     * se le due classi non sono equivalenti, il metodo returna false;
     * nel momento in cui le due classi sono equivalenti, confronterà il titolo e l'artista dell'oggetto parametrato con il titolo e l'artista dell'oggetto che invoca il metodo;
     * per permettere questo confronto, si è scelto di utilizzare il casting dell'elemento Object in ArtWork, in modo da permettere il confronto delle caratteristiche.
     *
     * @param o - oggetto di tipo Object
     * @return - true or false
     */
    public boolean equals(Object o) {

        if (o.getClass() == this.getClass()) {
            if ((((ArtWork) o).getTitle() == this.title) && (((ArtWork) o).getArtist() == this.artist)) {
                return true;
            }
        }
        return false;
    }

}
