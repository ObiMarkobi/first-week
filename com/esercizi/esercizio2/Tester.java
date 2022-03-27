package com.esercizi.esercizio2;

public class Tester {

    public static void main(String[] args) {


        ArtWork square = new Square("Gioconda", "Leonardo Da Vinci", 0.77, 0.53);
        ArtWork square2 = new Square("Nascita di Venere", "Sandro Botticelli", 1.72, 2.78);
        ArtWork sculpture = new Sculpture("Il Pensatore", "Auguste Rodin", 1.89, 0.98, 1.4);
        ArtWork square3 = new Square("La notte stellata", "Van Gogh", 1, 1);
        ArtWork square4 = new Square("L'ultima cena", "Leonardo Da Vinci", 4.6, 8.8);

        Collections c = new Collections("Louvre", "Paris");

        c.addArtWork(square);
        c.addArtWork(sculpture);
        c.addArtWork(square3);
        c.addArtWork(square4);


        /**
         * Stampa della collezione intera; stamperà la collezione dell'oggetto "c", che include, al momento, due opere:
         * "square" & "sculputre"
         */
        c.printCollection();


        /**
         * Stampa dell'ingombro di un'opera appartenente alla collezione. Due metodi.
         */
        System.out.println("\nStampa ingombro dell'opera " + square.getTitle() + " di " + square.getArtist() + ": " + square.printEncumbrance());
        c.printEncumbrance(square2); // l'opera "square2", non essendo stata aggiunta alla lista della collezione, non farà parte della collection.
        c.printEncumbrance(sculpture);// l'opera "square1" fa parte della collezione, per cui in return avremo il valore dell'ingombro;


        /**
         * Confronto tra due opere, analizziamo se "ArtWork opera1" sia uguale ad "ArtWork opera2".
         * Vedere metodo equals nella classe ArtWork, in quanto come parametro entra un oggetto di tipo "Object".
         */
        System.out.println("");
        System.out.println(square.equals(square)); //true
        System.out.println(square.equals(square2)); //false
        System.out.println(square.equals(sculpture)); //false

        /**
         * Filtra la collezione e stampa soltanto le opere dell'artista messo nel parametro.
         */
        c.artistCollection("Leonardo Da Vinci");
        c.artistCollection("Van Gogh");
    }
}
