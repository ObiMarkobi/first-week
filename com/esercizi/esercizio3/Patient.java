package com.esercizi.esercizio3;

public class Patient {

    private int healthCard;
    private Medic medic;

    /**
     * Costruttore vuoto
     */
    public Patient() {
    }

    /**
     * @param healthCard - numero tessera sanitaria del paziente
     * @param medic      - medico curante del paziente
     */
    public Patient(int healthCard, Medic medic) {
        this.healthCard = healthCard;
        this.medic = medic;
    }

    /**
     * @return - numero tessera sanitaria del paziente
     */
    public int getHealthCard() {
        return healthCard;
    }

    /**
     * @return - medico curante del paziente
     */
    public Medic getMedic() {
        return medic;
    }

    public void setMedic(Medic medic) {
        this.medic = medic;
    }
}
