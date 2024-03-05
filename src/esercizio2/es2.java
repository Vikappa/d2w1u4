package esercizio2;

import java.util.Scanner;

public class es2 {

    public static String esercizioSwitch(Scanner scannerUsato){

        System.out.println("Digita il numero da controllare per l'esercizio sullo switch case (valore numerico)");

        while (!scannerUsato.hasNextInt()) {
            System.out.println("Errore: l'input deve essere un valore numerico intero. Attendo un nuovo input.");
            scannerUsato.next();
        }

        int param = scannerUsato.nextInt();

        scannerUsato.nextLine(); // Consuma e ignora il newline/carattere di nuova linea residuo
        switch (param) {
            case 0:
                return "zero";
            case 1:
                return "uno";
            case 2:
                return "due";
            case 3:
                return "tre";
            default:
                return "Il valore non è compreso tra 0 e 3.";
        }
    }

}
