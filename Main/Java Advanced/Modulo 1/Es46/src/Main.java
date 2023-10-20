import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> insieme = new HashSet<Integer>();
        insieme = fillSet(insieme);
        System.out.println(insieme);

        Integer val = 10000;
        insieme.add(val);
        System.out.println(insieme);

        insieme = removeElement(insieme, val);
        System.out.println(insieme);

        clearSet(insieme);
        System.out.println(insieme);
    }
    public static Set<Integer> fillSet(Set<Integer> insieme) {
        Random r = new Random();
        for(int i = 0; i<r.nextInt(0,10); i++) {
            insieme.add(r.nextInt(1,1000));
        }
        return insieme;
    }
    public static Set<Integer> removeElement(Set<Integer> insieme, Integer val) {
        Iterator<Integer> iterator = insieme.iterator();
        while(iterator.hasNext()) {
            Integer element = iterator.next();
            if(Objects.equals(element, val)) {
                iterator.remove();
            }
        }
        return insieme;
    }
    public static void clearSet(Set<Integer> insieme) {
        insieme.clear();
    }
}