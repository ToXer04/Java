import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Simone", 18);
        map1.put("Giovanni", 21);
        map1.put("Paolo", 15);
        System.out.println(map1);

        Map<String, Integer> map2 = Map.of("Simone", 18, "Giovanni", 21, "Paolo", 15);
        System.out.println(map2);

        Map<String, Integer> map3 = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("Simone", 18),
                new AbstractMap.SimpleEntry<>("Giovanni", 21),
                new AbstractMap.SimpleEntry<>("Paolo", 15)
        );
        System.out.println(map3);
    }
}