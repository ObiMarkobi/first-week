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
         * 1) Utilizzando il casting di (B) su gamma e il casting di (Object[]) su arr come parametri di beta.f,
         *    si andrà a prendere il metodo contenuto nella classe B, returnando così B1.
         *
         */
        System.out.println(beta.f((B) gamma, (Object[]) arr));

        /**
         * 2) Utilizzando il casting di (Object) su arr come secondo parametro del metodo "beta.f", si andrà a selezionare
         *    il secondo metodo di A, i cui parametri sono di tipo Object (includono qualsiasi tipo di dato).
         */
        System.out.println(beta.f(gamma, (Object) arr));


        System.out.println(gamma.f(arr, alfa));
        System.out.println(gamma.f(beta, alfa));
        System.out.println(5 | 7);

    }
}
