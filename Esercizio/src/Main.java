// Immagina di dover creare un sistema di prenotazione di alloggi per una piattaforma di viaggi.
// Il sistema deve gestire proprietà, utenti, prenotazioni. Ogni proprietà ha un nome, un indirizzo
// e un numero di stanze disponibili. Ogni utente ha un nome, un'email e può effettuare prenotazioni.
// Le prenotazioni collegano un utente a una proprietà per un periodo specifico.
//
//        Definire un metodo di ricerca di prenotazione per una data.
//        Definire un metodo che visualizzi tutte le prenotazioni.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Prenotazione> prenotazioni = new ArrayList<>();
        Proprietà prop1 = new Proprietà(3, "Test 1", "Via al test 1", prenotazioni);
        Utente u1 = new Utente("Simone", "Farina", "simonefarina2004@gmail.com");
        try {
            prop1.creaPrenotazione(prop1, u1, 2, 1);
        } catch(Exception e) {
            System.out.println(e);
        }
        System.out.println(prenotazioni);
    }
}