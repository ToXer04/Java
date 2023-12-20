package org.example;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;

public class Task {
    private String descrizione;
    private OffsetDateTime scadenza;
    private boolean isCompletato;

    public Task(String descrizione, OffsetDateTime scadenza, boolean isCompletato) {
        this.descrizione = descrizione;
        this.scadenza = scadenza;
        this.isCompletato = isCompletato;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public OffsetDateTime getScadenza() {
        return scadenza;
    }

    public void setScadenza(OffsetDateTime scadenza) {
        this.scadenza = scadenza;
    }

    public boolean isCompletato() {
        return isCompletato;
    }

    public void setCompletato(boolean completato) {
        isCompletato = completato;
    }

    @Override
    public String toString() {
        return "ToDoList{" +
                "descrizione='" + descrizione + '\'' +
                ", scadenza=" + formatDate(scadenza) +
                ", isCompletato=" + isCompletato +
                '}';
    }
    public String formatDate(OffsetDateTime scadenza) {
        return scadenza.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
    }
}
