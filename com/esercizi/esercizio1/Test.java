package com.esercizi.esercizio1;

public class Test {
    public static void main(String[] args) {

        A[] arr = new B[10];
        C gamma = new C();
        B beta = gamma;
        A alfa = gamma;


        /**
         * La riga errata era la seguente:
         *
         * System.out.println(beta. f (gamma,arr));
         *
         * per far girare il programma integro, vi sono due modi per agire, oltre ad ignorare questa istruzione:
         *
         * 1) Utilizzando il casting di (B) su gamma e il casting di (Object[]) su arr come parametri di beta.f(),
         *    si andrà a prendere il metodo contenuto nella classe B, returnando così B1.
         *
         */
        System.out.println(beta.f((B) gamma, (Object[]) arr));

        /**
         * 2) Utilizzando il casting di (Object) su arr come secondo parametro del metodo "beta.f()", si andrà a selezionare
         *    il secondo metodo di A (B estende A, ed in C non vi sono metodi combacianti), i cui parametri sono di tipo Object (includono qualsiasi tipo di dato).
         */
        System.out.println(beta.f(gamma, (Object) arr));

        /**
         * Essendo gamma un oggetto di tipo C ed essendo stato inizializzato con "new C()", con "gamma.f()" si partirà dai metodi della classe C.
         * Non essendovi però metodi ".f()" con primo parametro di tipo "Array[]", si finirà direttamente nella superclasse A (C estende B, B estende A) dove verrà selezionato
         * il metodo:
         * .f(Object o, Object o).
         */
        System.out.println(gamma.f(arr, alfa));

        /**
         * Si partirà dai metodi della classe C, dove si troverà immediatamente il metodo con parametri combacianti, ovvero .f(B x, Object y);
         * Essendo "beta" stato inizializzato come oggetto di classe "B", verrà considerato tale ed "alfa" verrà visto invece come un oggetto di tipo Object.
         * Motivo per cui uscirà C2.
         */
        System.out.println(gamma.f(beta, alfa));

        /**
         * Si tratta dell'operatore "bitwise OR"; in poche parole restituisce 1 in
         * ogni posizione di bit per cui i bit corrispondenti di uno o entrambi
         * gli operandi sono 1.
         * esempio corrente:
         * 5 -> 00000000000000000000000000000101
         * 7 -> 00000000000000000000000000000111
         *
         * quindi in uscita avremo direttamente 7!
         */
        System.out.println(5 | 7);

    }
}
