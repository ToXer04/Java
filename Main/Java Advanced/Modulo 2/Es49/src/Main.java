import java.util.Arrays;
import java.util.LinkedList;

public  class Main {
    public static void main(String[] args) {
        Frutto fr1 = new Frutto("Mela");
        Frutto fr2 = new Frutto("Pera");
        LinkedList<Frutto> frutti = new LinkedList<>(Arrays.asList(fr1, fr2));
        System.out.println(frutti);
        frutti.addFirst(new Frutto("Arancia"));
        System.out.println(frutti);
        frutti.addLast(new Frutto("Zucca"));
        System.out.println(frutti);
    }
}