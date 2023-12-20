package org.example;


import java.time.OffsetDateTime;
import java.util.ArrayList;

public class ToDoList {
    private ArrayList<Task> compiti;

    public ToDoList(ArrayList<Task> compiti) {
        this.compiti = compiti;
    }

    public ArrayList<Task> getCompiti() {
        return compiti;
    }

    public void setCompiti(ArrayList<Task> compiti) {
        this.compiti = compiti;
    }

    @Override
    public String toString() {
        return "ToDoList{" +
                "compiti=" + compiti +
                '}';
    }

    public Task aggiungiALista(Task task) {
        if(!this.compiti.contains(task)) {
            this.compiti.add(task);
        } else {
            System.out.println("Già presente");
        }
        return task;
    }
    public Task rimuoviDallaLista(Task task) {
        if(this.compiti.contains(task)) {
            this.compiti.remove(task);
        } else {
            System.out.println("Task non presente");
        }
        return task;
    }
    public void visualizzaElenco() {
        System.out.println(this.compiti);
    }
    public Task completaCompito(Task task) {
        if(this.compiti.contains(task)) {
            task.setCompletato(true);
        } else {
            System.out.println("Task non presente");
        }
        return task;
    }
    public ArrayList<Task> ricercaDescrizione(String descrizione) {
        ArrayList<Task> result = new ArrayList<>();
        for(Task t : this.compiti) {
            if(t.getDescrizione().equalsIgnoreCase(descrizione)) {
                result.add(t);
            }
        }
        return result;
    }
    public ArrayList<Task> scadenzaGiorni(OffsetDateTime start, OffsetDateTime end) {
        ArrayList<Task> result = new ArrayList<>();
        for(Task t : this.compiti) {
            if(t.getScadenza().isAfter(start) && t.getScadenza().isBefore(end)) {
                result.add(t);
            }
        }
        return result;
    }
}
