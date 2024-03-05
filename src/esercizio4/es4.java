package esercizio4;
import java.util.Scanner;

public class es4 {

    public static void esercizioFor(Scanner scannerUsato){
            int param;
            System.out.println("Inserisci un intero per l'esercizio sul ciclo for:");

            while (!scannerUsato.hasNextInt()) {
                System.out.println("Errore: l'input deve essere un intero. Per favore, riprova:");
                scannerUsato.next(); // Consume il non-intero in modo che possiamo chiedere di nuovo
            }

            param = scannerUsato.nextInt();

            for (int i = param; i >= 0; i--){
                System.out.println(i);
            }
        }

}
