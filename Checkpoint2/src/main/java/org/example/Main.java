//traccia checkpoint 2
//
//        Scrivi una semplice applicazione Java che gestisce una lista di compiti (To-Do List). La tua applicazione dovrebbe essere composta da due classi: Task e ToDoList.
//
//        La classe Task dovrebbe rappresentare un singolo compito. Ogni compito ha una descrizione una scadenza e uno stato che indica se è stato completato o meno.
//        La classe dovrebbe avere i seguenti attributi privati:
//        description: la descrizione del compito.
//        completed: uno stato che indica se il compito è stato completato o meno.
//        expiration: rappresenta la scadenza prefissata per quel compito.
//        La classe dovrebbe avere un costruttore che accetta la descrizione del compito, la scadenza e il valore di completato.
//        Deve fornire metodi pubblici (getter e setter) per tutti i parametri definiti.
//        La classe TodoList dovrebbe gestire una lista di compiti. Deve fornire le seguenti funzionalità:
//        Aggiungere un nuovo compito alla lista.
//        Rimuovere un compito dalla lista.
//        Visualizzare l'elenco completo dei compiti.
//        Contrassegnare un compito specifico come completato.
//        Utilizzare il main per testare che tutte le funzionalità eseguano i propri compiti.
//        Traccia Bonus:
//        Visualizzare il dettaglio di un compito identificato attraverso un parametro specifico.
//        Visualizzare i compiti in scadenza nei prossimi 2 giorni formattando la data in un formato comprensibile all’utente.
//        Partendo dall’ultimo punto bonus “Visualizzare i compiti in scadenza nei prossimi 2 giorni formattando la data in un formato comprensibile all’utente” aggiungere almeno 2 test che provino il funzionamento del metodo.

package org.example;

import java.time.OffsetDateTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Task t1 = new Task("Fai checkpoint", OffsetDateTime.now().plusDays(2), false);
        ToDoList tdl = new ToDoList(new ArrayList<>());
        tdl.aggiungiALista(t1);
        System.out.println(tdl.scadenzaGiorni(OffsetDateTime.now().minusDays(1), OffsetDateTime.now().plusDays(3)));
    }
}