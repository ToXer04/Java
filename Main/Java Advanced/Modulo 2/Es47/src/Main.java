import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Studente st1 = new Studente("Simone", 18);
        Studente st2 = new Studente("Paolo", 21);
        ArrayList<Studente> studenti = new ArrayList<>(Arrays.asList(st1, st2));
        System.out.println(studenti);
        Studente st3 = new Studente("Giovanni", 25);
        Studente st4 = new Studente("Alessandro", 17);
        Studente st5 = new Studente("Sandro", 27);
        Studente st6 = new Studente("Giuseppe", 31);
        studenti.add(st3);
        studenti.add(st4);
        studenti.add(st5);
        studenti.add(st6);
        System.out.println(studenti);
    }
}