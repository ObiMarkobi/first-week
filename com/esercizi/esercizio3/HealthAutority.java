package com.esercizi.esercizio3;

import java.util.ArrayList;

public class HealthAutority {

    ArrayList<Medic> medics = new ArrayList<>();
    ArrayList<Patient> patients = new ArrayList<>();

    /**
     *
     */
    public HealthAutority() {
        this.medics = medics;
        this.patients = patients;
    }

    /**
     *
     * @param p - il paziente da aggiungere all'archivio
     *
     */
    public void addPatient(Patient p){

        if(!this.patients.contains(p)){
            this.patients.add(p);
            this.medics.add(p.getMedic());
        }
        else{
            System.out.println("The patient is already existent.");
        }

    }

    /**
     *
     * @param name
     * @return
     */
    public Medic findMedic(String name){
        for(Medic m : medics){
            if(name == m.getName()){
                return m;
            }
        }
        return null;
    }

    public void addPatient2(Patient p, String medicName){

    }
    /**
     *
     */
    public ArrayList<Patient> listMedic(Medic m){

        ArrayList<Patient> p = new ArrayList<>();

        for (Patient pat : this.patients){
            if(pat.getMedic() == m){
                p.add(pat);
            }
        }

        return p;
    }

    /**
     * Creato appositamente per stampare il risultato del metodo listMedic().
     * @param m - medico di cui si vogliono stampare i pazienti
     */
    public void printPatients(Medic m){
        ArrayList<Patient> temp = new ArrayList<>();
        temp = listMedic(m);
        System.out.println("\nI pazienti del medico " + m.getName() + " sono i seguenti: ");
        for (Patient pat : temp){
            System.out.println(pat.getHealthCard());
        }
    }

    /**
     * Metodo che restituisce un riferimento al medico avente il maggior numero di pazienti.
     *
     * Funzionamento:
     * Con il for-each scannerizzo l'ArrayList "medics", variabile di istanza di questa classe; per ogni medico dell'arraylist,
     * vado a ricercare i pazienti nell'ArrayList "patients", in cui si trovano, appunto, tutti i pazienti. Siccome ogni paziente ha il proprio medico referenziato,
     * posso estrapolare la variabile di tipo "Medico" presente all'interno della classe "Patient" e prendere, con il metodo getName() della classe "Medico", il nome del medico
     * per poi confrontarlo con il nome di ogni medico dell'ArrayList.
     * Quindi, ad esempio, per il medico m1, scannerizzo tutti i pazienti presenti nell'archivio e, se il medico del paziente ha lo stesso nome di m1, incremento una variabile
     * denominata numPat, cioè il numero di pazienti di m1.
     * Successivamente, prima di passare al prossimo medico m2, con l'if faccio un confronto tra il numero di pazienti di m1 ed il numero massimo di pazienti riscontrato fino a quel punto.
     * Ovviamente, all'inizio, il massimo sarà zero; ma verrà aggiornato per ogni medico, solo se il suo numero di pazienti sarà maggiore.
     * Alla fine di questo ciclo, il metodo mi ritornerà il medico con il maggior numero di pazienti.
     *
     * @return - medico con maggior numero di pazienti (oggetto della classe Medic)
     */
    public Medic statMedic(){

        int maxPat = 0;
        Medic finalMed = null;

        for(Medic m : this.medics){
            int numPat = 0;
            for(Patient p : this.patients){
                if(p.getMedic().getName().equals(m.getName())){
                    numPat++;
                }
            }
            if(numPat > maxPat){
                maxPat = numPat;
                finalMed = m;
            }
        }

        return finalMed;

    }

    /**
     * Metodo private, utilizzabile al momento solo in questa classe. Si può quindi utilizzare, ad esempio, in metodi qui presenti.
     * @return - posizione del paziente con tessera sanitaria pari a "id"
     */
    private int findPatient(int id){

        int position = 0;

        for(int i=0; i < this.patients.size(); i++){
                if(patients.get(i).getHealthCard() == id){
                    position = i;
                }
        }

        return position;
    }


}
