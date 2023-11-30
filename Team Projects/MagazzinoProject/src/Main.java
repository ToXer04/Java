import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = "";
        ArrayList<Dispositivo> listaMagazzino = new ArrayList<>();
        ArrayList<Dispositivo> listaCarrello = new ArrayList<>();
        Magazzino magazzino;
        Carrello carrello;
        ArrayList<ArrayList<Dispositivo>> listaCompleta = new ArrayList<>();
        Dispositivo disp1 = new Dispositivo("Apple", "Air 2", "Ottime condizioni", "1920*1080", "512Gb", "99.69", "124.99", calcId(listaMagazzino, listaCarrello), TipoDispositivo.Tablet);
        listaCarrello.add(disp1);
        Dispositivo disp2 = new Dispositivo("Apple", "Air 3", "Buone condizioni", "1920*1080", "256Gb", "116.99", "144.49", calcId(listaMagazzino, listaCarrello), TipoDispositivo.Smartphone);
        listaCarrello.add(disp2);
        magazzino = new Magazzino(listaMagazzino);
        carrello = new Carrello(listaCarrello);
        while(!input.equals("0")) {
            System.out.println("Seleziona cosa vuoi fare:");
            System.out.println("0 = esci dal programma");
            System.out.println("1 = aggiungi articolo al magazzino");
            System.out.println("2 = ricerca dispositivo nel magazzino");
            System.out.println("3 = aggiungi elemento al carrello tramite id");
            System.out.println("4 = rimuovi elemento dal carrello tramite id");
            System.out.println("5 = visualizza magazzino");
            System.out.println("6 = visualizza carrello");
            System.out.println("7 = visualizza il costo totale del carrello");
            System.out.println("8 = visualizza il costo medio degli articoli nel carrello");
            System.out.println("9 = completa l'acquisto e svuota il carrello");
            System.out.println();
            input = in.nextLine();
            System.out.println();
            switch (input) {
                case "0" :
                    System.out.println("Grazie per aver usato il nostro software!");
                    break;
                case "1" :
                    System.out.println("Perfetto, segui le indicazioni per aggiungere il dispositivo al magazzino.");
                    System.out.println();
                    Dispositivo dispositivo = constructorDispositivo(in, listaMagazzino, listaCarrello);
                    listaMagazzino.add(dispositivo);
                    magazzino = new Magazzino(listaMagazzino);
                    break;
                case "2" :
                    ricercaDispositivo(in, listaMagazzino);
                    break;
                case "3" :
                    System.out.println("Perfetto, segui le indicazioni per aggiungere il dispositivo al carrello.");
                    System.out.println();
                    aggiungiCarrello(in, listaMagazzino, listaCarrello, listaCompleta);
                    listaCarrello = listaCompleta.get(0);
                    carrello = new Carrello(listaCarrello);
                    listaMagazzino = listaCompleta.get(1);
                    magazzino = new Magazzino(listaMagazzino);
                    System.out.println("Ecco il carrello aggiornato: ");
                    System.out.println();
                    carrello.printCarrello(listaCarrello);
                    break;
                case "4" :
                    System.out.println("Perfetto, segui le indicazioni per rimuovere il dispositivo dal carrello.");
                    System.out.println();
                    rimuoviCarrello(in, listaMagazzino, listaCarrello, listaCompleta);
                    listaCarrello = listaCompleta.get(0);
                    carrello = new Carrello(listaCarrello);
                    listaMagazzino = listaCompleta.get(1);
                    magazzino = new Magazzino(listaMagazzino);
                    System.out.println("Ecco il carrello aggiornato: ");
                    System.out.println();
                    carrello.printCarrello(listaCarrello);
                    break;
                case "5" :
                    System.out.println("Ecco gli articoli presenti dentro il magazzino:");
                    System.out.println();
                    magazzino.printMagazzino(listaMagazzino);
                    break;
                case "6" :
                    System.out.println("Ecco gli articoli presenti dentro il carrello:");
                    System.out.println();
                    carrello.printCarrello(listaCarrello);
                    break;
                case "7" :
                    System.out.println("Ecco il costo totale del tuo carrello:");
                    System.out.println();
                    costoTotale(listaCarrello);
                    break;
                case "8" :
                    System.out.println("Ecco il costo medio degli articolo nel tuo carrello:");
                    System.out.println();
                    calcoloMedia(listaCarrello);
                    break;
                case "9" :
                    System.out.println("Acquisto effettuato!");
                    System.out.println();
                    finalizzaAcquisto(listaCarrello);
                    break;
                default:
                    System.out.println("Valore non supportato: " + input);
                    System.out.println();
            }
        }

    }
    public static Dispositivo constructorDispositivo(Scanner in, ArrayList<Dispositivo> listaMagazzino, ArrayList<Dispositivo> listaCarrello) {
        System.out.println("Produttore:");
        String produttore = in.nextLine();
        while(produttore.isEmpty()) {
            System.out.println("Questo è un campo obbligatorio.");
            System.out.println("Produttore:");
            produttore = in.nextLine();
        }
        System.out.println("Modello:");
        String modello = in.nextLine();
        while(modello.isEmpty()) {
            System.out.println("Questo è un campo obbligatorio.");
            System.out.println("Modello:");
            modello = in.nextLine();
        }
        System.out.println("Descrizione:");
        String descrizione = in.nextLine();
        System.out.println("Dimensione display:");
        String dimensioneDisplay = in.nextLine();
        while(dimensioneDisplay.isEmpty()) {
            System.out.println("Questo è un campo obbligatorio.");
            System.out.println("Dimensione display:");
            dimensioneDisplay = in.nextLine();
        }
        System.out.println("Dimensione spazio:");
        String dimensioneSpazio = in.nextLine();
        while(dimensioneSpazio.isEmpty()) {
            System.out.println("Questo è un campo obbligatorio.");
            System.out.println("Dimensione spazio:");
            dimensioneSpazio = in.nextLine();
        }
        System.out.println("Prezzo di acquisto:");
        String prezzoAcquisto = in.nextLine();
        while(true) {
            try {
                Double.parseDouble(prezzoAcquisto);
                break;
            } catch (NumberFormatException nfe) {
                System.out.println();
                System.out.println("Valore non supportato: " + prezzoAcquisto);
                System.out.println();
                System.out.println("Prezzo di acquisto:");
                prezzoAcquisto = in.nextLine();
            }
        }
        System.out.println("Prezzo di vendita:");
        String prezzoVendita = in.nextLine();
        while(true) {
            try {
                Double.parseDouble(prezzoVendita);
                break;
            } catch (NumberFormatException nfe) {
                System.out.println();
                System.out.println("Valore non supportato: " + prezzoVendita);
                System.out.println();
                System.out.println("Prezzo di vendita:");
                prezzoVendita = in.nextLine();
            }
        }
        System.out.println("Tipo (Tablet | Smartphone | Notebook):");
        String tipoDispositivo = in.nextLine();
        while(!tipoDispositivo.equalsIgnoreCase("tablet") && !tipoDispositivo.equalsIgnoreCase("smartphone") && !tipoDispositivo.equalsIgnoreCase("notebook")) {
            System.out.println("Seleziona una delle opzioni valide");
            System.out.println("Tipo (Tablet | Smartphone | Notebook):");
            tipoDispositivo = in.nextLine();
        }
        Dispositivo disp = new Dispositivo(produttore, modello, descrizione, dimensioneDisplay, dimensioneSpazio, prezzoAcquisto, prezzoVendita, calcId(listaMagazzino, listaCarrello), calcTipoDispositivo(tipoDispositivo));
        System.out.println();
        System.out.println("Il seguente articolo è stato aggiunto al magazzino con successo!");
        System.out.println();
        System.out.println(disp);
        System.out.println();
        return disp;
    }
    public static String calcId(ArrayList<Dispositivo> listaMagazzino, ArrayList<Dispositivo> listaCarrello) {
        if (listaMagazzino.isEmpty() && listaCarrello.isEmpty()) {
            return "0";
        } else if(listaMagazzino.isEmpty()) {
            return Integer.toString(Integer.parseInt(listaCarrello.get(listaCarrello.size()-1).getId())+1);
        } else if(listaCarrello.isEmpty()) {
            return Integer.toString(Integer.parseInt(listaMagazzino.get(listaMagazzino.size()-1).getId())+1);
        } else {
            if(Integer.parseInt(listaMagazzino.get(listaMagazzino.size()-1).getId()) > Integer.parseInt(listaCarrello.get(listaCarrello.size()-1).getId())) {
                return Integer.toString(Integer.parseInt(listaMagazzino.get(listaMagazzino.size()-1).getId())+1);
            } else {
                return Integer.toString(Integer.parseInt(listaCarrello.get(listaCarrello.size()-1).getId())+1);
            }
        }
    }
    public static TipoDispositivo calcTipoDispositivo(String tipoDispositivo) {
        return switch (tipoDispositivo.toLowerCase()) {
            case "tablet" -> TipoDispositivo.Tablet;
            case "smartphone" -> TipoDispositivo.Smartphone;
            case "notebook" -> TipoDispositivo.Notebook;
            default -> throw new IllegalStateException("Valore non riconosciuto: " + tipoDispositivo);
        };
    }
    public static void ricercaDispositivo(Scanner in, ArrayList<Dispositivo> listaMagazzino) {
        System.out.println("Seleziona in che modo vuoi ricercare:");
        System.out.println("0 = esci dalla funzione di ricerca");
        System.out.println("1 = per tipo");
        System.out.println("2 = per produttore");
        System.out.println("3 = per modello");
        System.out.println("4 = per prezzo di vendita");
        System.out.println("5 = per prezzo di acquisto");
        System.out.println("6 = ricerca specifica per range di prezzo");
        System.out.println();
        String input = in.nextLine();
        while(true) {
            try {
                int inputInt = Integer.parseInt(input);
                if(inputInt >= 0 && inputInt <= 6) {
                    break;
                }
                System.out.println();
                System.out.println("Valore non supportato: " + input);
                System.out.println();
                System.out.println("Seleziona in che modo vuoi ricercare:");
                System.out.println("0 = esci dalla funzione di ricerca");
                System.out.println("1 = per tipo");
                System.out.println("2 = per produttore");
                System.out.println("3 = per modello");
                System.out.println("4 = per prezzo di vendita");
                System.out.println("5 = per prezzo di acquisto");
                System.out.println("6 = ricerca specifica per range di prezzo");
                System.out.println();
                input = in.nextLine();
            } catch (NumberFormatException nfe) {
                System.out.println();
                System.out.println("Valore non supportato: " + input);
                System.out.println();
                System.out.println("Seleziona in che modo vuoi ricercare:");
                System.out.println("0 = esci dalla funzione di ricerca");
                System.out.println("1 = per tipo");
                System.out.println("2 = per produttore");
                System.out.println("3 = per modello");
                System.out.println("4 = per prezzo di vendita");
                System.out.println("5 = per prezzo di acquisto");
                System.out.println("6 = ricerca specifica per range di prezzo");
                System.out.println();
                input = in.nextLine();
            }
        }
        System.out.println();
        switch (input) {
            case "0" :
                break;
            case "1" :
                ricercaTipo(in, listaMagazzino);
                break;
            case "2" :
                ricercaProduttore(in, listaMagazzino);
                break;
            case "3" :
                ricercaModello(in, listaMagazzino);
                break;
            case "4" :
                ricercaPrezzoVendita(in, listaMagazzino);
                break;
            case "5" :
                ricercaPrezzoAcquisto(in, listaMagazzino);
                break;
            case "6" :
                ricercaRangePrezzo(in, listaMagazzino);
                break;
            default:
                System.out.println("Valore non supportato: " + input);
                System.out.println();
        }
    }
    public static void ricercaTipo(Scanner in, ArrayList<Dispositivo> listaMagazzino) {
        boolean bool = true;
        System.out.println("Seleziona il tipo di dispositivo che vuoi ricercare:");
        System.out.println("1 = tablet");
        System.out.println("2 = smartphone");
        System.out.println("3 = notebook");
        System.out.println();
        String input = in.nextLine();
        while(true) {
            try {
                int inputInt = Integer.parseInt(input);
                if(inputInt >= 1 && inputInt <= 3) {
                    break;
                }
                System.out.println();
                System.out.println("Valore non supportato: " + input);
                System.out.println();
                System.out.println("Seleziona il tipo di dispositivo che vuoi ricercare:");
                System.out.println("1 = tablet");
                System.out.println("2 = smartphone");
                System.out.println("3 = notebook");
                System.out.println();
                input = in.nextLine();
            } catch (NumberFormatException nfe) {
                System.out.println();
                System.out.println("Valore non supportato: " + input);
                System.out.println();
                System.out.println("Seleziona il tipo di dispositivo che vuoi ricercare:");
                System.out.println("1 = tablet");
                System.out.println("2 = smartphone");
                System.out.println("3 = notebook");
                System.out.println();
                input = in.nextLine();
            }
        }
        System.out.println();
        System.out.println("Ecco gli elementi trovati nel magazzino corrispondenti ai tuoi parametri di ricerca:");
        System.out.println();
        for (Dispositivo dispositivo : listaMagazzino) {
            switch (input) {
                case "1":
                    if (dispositivo.getTipo().toString().equals("Tablet")) {
                        System.out.println(dispositivo);
                        bool = false;
                    }
                    break;
                case "2":
                    if (dispositivo.getTipo().toString().equals("Smartphone")) {
                        System.out.println(dispositivo);
                        bool = false;
                    }
                    break;
                case "3":
                    if (dispositivo.getTipo().toString().equals("Notebook")) {
                        System.out.println(dispositivo);
                        bool = false;
                    }
                    break;
                default:
                    System.out.println("Valore non supportato: " + input);
                    System.out.println();
            }
        }
        if(bool) {
            System.out.println("Non sono stati trovati risultati.");
        }
        System.out.println();
    }
    public static void ricercaProduttore(Scanner in, ArrayList<Dispositivo> listaMagazzino) {
        boolean bool = true;
        System.out.println("Scrivi il nome del produttore che vuoi ricercare:");
        System.out.println();
        String input = in.nextLine();
        System.out.println();
        System.out.println("Ecco gli elementi trovati nel magazzino corrispondenti ai tuoi parametri di ricerca:");
        System.out.println();
        for (Dispositivo dispositivo : listaMagazzino) {
            if (dispositivo.getProduttore().equals(input)) {
                bool = false;
                System.out.println(dispositivo);
            }
        }
        if(bool) {
            System.out.println("Non sono stati trovati risultati.");
        }
        System.out.println();
    }
    public static void ricercaModello(Scanner in, ArrayList<Dispositivo> listaMagazzino) {
        boolean bool = true;
        System.out.println("Scrivi il nome del modello che vuoi ricercare:");
        System.out.println();
        String input = in.nextLine();
        System.out.println();
        System.out.println("Ecco gli elementi trovati nel magazzino corrispondenti ai tuoi parametri di ricerca:");
        System.out.println();
        for (Dispositivo dispositivo : listaMagazzino) {
            if (dispositivo.getModello().equals(input)) {
                bool = false;
                System.out.println(dispositivo);
            }
        }
        if(bool) {
            System.out.println("Non sono stati trovati risultati.");
        }
        System.out.println();
    }
    public static void ricercaPrezzoVendita(Scanner in, ArrayList<Dispositivo> listaMagazzino) {
        boolean bool = true;
        System.out.println("Scrivi il prezzo di vendita che vuoi ricercare:");
        System.out.println();
        String input = in.nextLine();
        while(true) {
            try {
                Integer.parseInt(input);
                break;
            } catch (NumberFormatException nfe) {
                System.out.println();
                System.out.println("Valore non supportato: " + input);
                System.out.println();
                System.out.println("Scrivi il prezzo di vendita che vuoi ricercare:");
                System.out.println();
                input = in.nextLine();
            }
        }
        System.out.println();
        System.out.println("Ecco gli elementi trovati nel magazzino corrispondenti ai tuoi parametri di ricerca:");
        System.out.println();
        for (Dispositivo dispositivo : listaMagazzino) {
            if (dispositivo.getPrezzoVendita().equals(input)) {
                bool = false;
                System.out.println(dispositivo);
            }
        }
        if(bool) {
            System.out.println("Non sono stati trovati risultati.");
        }
        System.out.println();
    }
    public static void ricercaPrezzoAcquisto(Scanner in, ArrayList<Dispositivo> listaMagazzino) {
        boolean bool = true;
        System.out.println("Scrivi il prezzo di acquisto che vuoi ricercare:");
        System.out.println();
        String input = in.nextLine();
        while(true) {
            try {
                Integer.parseInt(input);
                break;
            } catch (NumberFormatException nfe) {
                System.out.println();
                System.out.println("Valore non supportato: " + input);
                System.out.println();
                System.out.println("Scrivi il prezzo di acquisto che vuoi ricercare:");
                System.out.println();
                input = in.nextLine();
            }
        }
        System.out.println();
        System.out.println("Ecco gli elementi trovati nel magazzino corrispondenti ai tuoi parametri di ricerca:");
        System.out.println();
        for (Dispositivo dispositivo : listaMagazzino) {
            if (dispositivo.getPrezzoAcquisto().equals(input)) {
                bool = false;
                System.out.println(dispositivo);
            }
        }
        if(bool) {
            System.out.println("Non sono stati trovati risultati.");
        }
        System.out.println();
    }
    public static void ricercaRangePrezzo(Scanner in, ArrayList<Dispositivo> listaMagazzino) {
        boolean bool = true;
        System.out.println("Scrivi il costo minimo che il prodotto possa avere:");
        System.out.println();
        String inputMin = in.nextLine();
        while(true) {
            try {
                Integer.parseInt(inputMin);
                break;
            } catch (NumberFormatException nfe) {
                System.out.println();
                System.out.println("Valore non supportato: " + inputMin);
                System.out.println();
                System.out.println("Scrivi il costo minimo che il prodotto possa avere:");
                System.out.println();
                inputMin = in.nextLine();
            }
        }
        System.out.println();
        System.out.println("Scrivi il costo massimo che il prodotto possa avere:");
        System.out.println();
        String inputMax = in.nextLine();
        while(true) {
            try {
                Integer.parseInt(inputMax);
                break;
            } catch (NumberFormatException nfe) {
                System.out.println();
                System.out.println("Valore non supportato: " + inputMax);
                System.out.println();
                System.out.println("Scrivi il costo massimo che il prodotto possa avere:");
                System.out.println();
                inputMax = in.nextLine();
            }
        }
        System.out.println();
        System.out.println("Ecco gli elementi trovati nel magazzino corrispondenti ai tuoi parametri di ricerca:");
        System.out.println();
        for (Dispositivo dispositivo : listaMagazzino) {
            if (Double.parseDouble(inputMin) <= Double.parseDouble(dispositivo.getPrezzoVendita()) && Double.parseDouble(inputMax) >= Double.parseDouble(dispositivo.getPrezzoVendita())) {
                bool = false;
                System.out.println(dispositivo);
            }
        }
        if(bool) {
            System.out.println("Non sono stati trovati risultati.");
        }
        System.out.println();
    }
    private static void aggiungiCarrello(Scanner in, ArrayList<Dispositivo> listaMagazzino, ArrayList<Dispositivo> listaCarrello, ArrayList<ArrayList<Dispositivo>> listaCompleta) {
        boolean bool = true;
        System.out.println("Scrivi l'ID del prodotto che vuoi aggiungere al carrello:");
        System.out.println();
        String input = in.nextLine();
        System.out.println();
        for (Dispositivo dispositivo : listaMagazzino) {
            if(Objects.equals(dispositivo.getId(), input)) {
                listaCarrello.add(dispositivo);
                listaMagazzino.remove(dispositivo);
                bool = false;
                break;
            }
        }
        listaCompleta.add(listaCarrello);
        listaCompleta.add(listaMagazzino);
        if(bool) {
            System.out.println("Non è presente un dispositivo con l'ID " + input + " all'interno del magazzino");
            System.out.println();
        }
    }
    private static void rimuoviCarrello(Scanner in, ArrayList<Dispositivo> listaMagazzino, ArrayList<Dispositivo> listaCarrello, ArrayList<ArrayList<Dispositivo>> listaCompleta) {
        boolean bool = true;
        System.out.println("Scrivi l'ID del prodotto che vuoi rimuovere dal carrello:");
        System.out.println();
        String input = in.nextLine();
        System.out.println();
        for (Dispositivo dispositivo : listaCarrello) {
            if(Objects.equals(dispositivo.getId(), input)) {
                listaCarrello.remove(dispositivo);
                listaMagazzino.add(dispositivo);
                bool = false;
                break;
            }
        }
        listaCompleta.add(listaCarrello);
        listaCompleta.add(listaMagazzino);
        if(bool) {
            System.out.println("Non è presente un dispositivo con l'ID " + input + " all'interno del carrello");
            System.out.println();
        }
    }
    private static void costoTotale(ArrayList<Dispositivo> listaCarrello) {
        double costoTotale = 0;
        if(!listaCarrello.isEmpty()) {
            for(Dispositivo dispositivo : listaCarrello) {
                costoTotale += Double.parseDouble(dispositivo.getPrezzoVendita());
            }
            System.out.println(costoTotale);
        } else {
            System.out.println("Il tuo carrello è vuoto");
        }
        System.out.println();
    }
    private static void calcoloMedia(ArrayList<Dispositivo> listaCarrello) {
        double costoTotale = 0;
        if(!listaCarrello.isEmpty()) {
            for(Dispositivo dispositivo : listaCarrello) {
                costoTotale += Double.parseDouble(dispositivo.getPrezzoVendita());
            }
            System.out.println(costoTotale/ listaCarrello.size());
        } else {
            System.out.println("Il tuo carrello è vuoto");
        }
         System.out.println();
    }
    private static void finalizzaAcquisto(ArrayList<Dispositivo> listaCarrello) {
        if(!listaCarrello.isEmpty()) {
            listaCarrello.clear();
        } else {
            System.out.println("Il tuo carrello è vuoto");
            System.out.println();
        }
    }
}