package esercizio3;

import java.util.Scanner;

public class es3 {
    public static void esercizioWhile(Scanner scannerUsato){

        boolean exit = false; //////////  Condizione iniziale per avviare il ciclo e spegnerlo da dentro

        while(!exit){
            System.out.println("Digita una stringa per l'esercizio sul while. Siamo già dentro il ciclo. Questo log verrà stampato finchè non digiti :q");

            String input = scannerUsato.nextLine().trim(); // .trim() rimuove spazi bianchi iniziali e finali

            if (input.isEmpty()) {
                System.out.println("Errore: l'input non può essere vuoto. Riprova:");
                continue; //// Se l'input è vuoto il ciclo while torna a capo grazie a continue
            }

            if(input.equals(":q")){ //// Verificato che non ci siano errori di input faccio il controllo per verificare
                                   ///////  se viene digitato il codice di escape
                exit = true;
            } else {
                for(int i = 0; i < input.length(); i++) {
                    System.out.println(input.charAt(i));
                }
            }
        }
    }
}
