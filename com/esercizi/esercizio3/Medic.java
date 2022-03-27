package com.esercizi.esercizio3;

public class Medic {

    private String name;

    /**
     * Costruttore vuoto
     */
    public Medic() {
    }

    /**
     *
     * @param name - nome del medico
     */
    public Medic(String name) {
        this.name = name;
    }

    /**
     * Il testo richiede soltanto il metodo di accesso Getter
     * @return - nome del medico
     */
    public String getName() {
        return name;
    }
}
