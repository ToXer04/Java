//Modellare l'area del parcheggio: Creare una classe "ParkingArea" che contenga gli elementi chiave del parcheggio,
// come numero di posti disponibili.
//Creare una classe "ParkingSpot" che rappresenti un singolo posto di parcheggio, con un codice univoco e un booleano che indichi se è occupato o meno.
//Definire un metodo "findSpot()" nella classe "ParkingArea" che cerca un posto di parcheggio disponibile.
//Implementare la logica di prenotazione di un posto di parcheggio, con la possibilità di prorogare la prenotazione o di annullarla se necessario.
//La classe "Customer" rappresenterà il cliente che usa il servizio di parcheggio, con informazioni come numero di targa, tipo di veicolo, numero di telefono, etc.
//Implementare la logica di pagamento e la calcolazione del costo del parcheggio (in base al tipo di parcheggio e alla durata della prenotazione).


import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Parking p = new Parking(new ArrayList<ParkingSpot>(Arrays.asList()));
        Cliente c = new Cliente("Simone", "GM668AT", "3478837443", TipoVeicolo.MACCHINA);
        p.fillParking(120);
        System.out.println(p);
        try {
            System.out.println(p.findSpot());
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
        try {
            System.out.println(p.checkBuySpot(3));
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}