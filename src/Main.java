import esercizio1.es1;
import esercizio2.es2;
import esercizio3.es3;
import esercizio4.es4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(es1.stringaPariDispari("Cia"));
        System.out.println(es1.stringaPariDispari("Ciao"));

        System.out.println(es1.annoBisestile(2023));
        System.out.println(es1.annoBisestile(2024));
        System.out.println(es1.annoBisestile(2025));

        Scanner scannerUnico = new Scanner(System.in);

        System.out.println(es2.esercizioSwitch(scannerUnico));
        es3.esercizioWhile(scannerUnico);
        es4.esercizioFor(scannerUnico);

        scannerUnico.close();
    }


}