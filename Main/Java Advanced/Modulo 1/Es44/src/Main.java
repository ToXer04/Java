import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> insieme = new HashSet<Integer>();
        insieme = fillSet(insieme);
        System.out.println(insieme);
        System.out.println(insieme.size());
        for(int element : insieme) {
            System.out.println(element);
        }
    }
    public static Set<Integer> fillSet(Set<Integer> insieme) {
        Random r = new Random();
        for(int i = 0; i<r.nextInt(0,10); i++) {
            insieme.add(r.nextInt(1,1000));
        }
        return insieme;
    }
}