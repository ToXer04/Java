import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Studente st1 = new Studente("Simone", 18);
        Studente st2 = new Studente("Paolo", 21);
        Studente st3 = new Studente("Giovanni", 25);
        Studente st4 = new Studente("Maria", 17);
        Studente st5 = new Studente("Sandro", 27);
        Studente st6 = new Studente("Carolina", 31);
        Studente st7 = new Studente("Matteo", 35);
        Studente st8 = new Studente("Marco", 22);
        Studente st9 = new Studente("Gabriele", 30);
        Studente st10 = new Studente("Francesca", 23);
        Studente st11 = new Studente("Alessandro", 19);
        Studente st12 = new Studente("Giuseppe", 20);
        ArrayList<Studente> studenti = new ArrayList<>(Arrays.asList(st1, st2, st3, st4, st5, st6, st7, st8, st9, st10, st11, st12));
        System.out.println(studenti);
        studenti.sort(Comparator.comparing(Studente::getNome));
        System.out.println(studenti);
    }
}