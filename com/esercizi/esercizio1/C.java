package com.esercizi.esercizio1;

public class C extends B {

    public String f(A x, A[] arr) {
        return "C1";
    }

    public String f(B x, Object y) {
        return "C2";
    }

    public String f(C x, B y) {
        return "C3";
    }

}
