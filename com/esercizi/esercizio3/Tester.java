package com.esercizi.esercizio3;

import com.esercizi.esercizio1.A;

import java.util.ArrayList;

public class Tester {

    public static void main(String[] args) {

        Medic medic_1 = new Medic("Giovanni Rossi");
        Medic medic_2 = new Medic("Federico Zeoli");
        Medic medic_3 = new Medic("Antonio Lepri");
        Patient patient_1 = new Patient(863000963, medic_1);
        Patient patient_2 = new Patient(763000963, medic_2);
        Patient patient_3 = new Patient(463000963, medic_3);
        Patient patient_4 = new Patient(263000963, medic_1);
        HealthAutority HA = new HealthAutority();

        //Aggiungo pazienti e medici all'archivio
        HA.addPatient(patient_1);
        HA.addPatient(patient_2);
        HA.addPatient(patient_3);
        HA.addPatient(patient_4);

        //Aggiungo paziente attraverso secondo metodo "addPatient2", con parametri Paziente e nomeMedico.
        //Nel caso in cui il paziente si trovi già nella lista, stamperà un messaggio.
        Patient patient_5 = new Patient(443000963, medic_2);
        HA.addPatient2(patient_5, "Federico Zeoli");

        //Stampa dell'archivio
        System.out.println("Stampa archivio dell'Azienda Sanitaria: ");
        for (Patient pa : HA.patients) {
            System.out.println("Tessera sanitaria del paziente: " + pa.getHealthCard() + ",\tNome del medico curante: " + pa.getMedic().getName());
        }

        //Stampa dei pazienti di un medico -> vedere procedimento in classe HealthAutority, in quanto ho utilizzato
        //il metodo listMedic()
        HA.printPatients(medic_1);

        //Stampa medico con più pazienti
        System.out.println("\nStampa del medico con più pazienti: \n" + HA.statMedic().getName());


    }
}
