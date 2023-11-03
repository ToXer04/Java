import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map1 = createMap1("Simone", 18, "Giovanni", 21, "Paolo", 15);
        System.out.println(map1);

        Map<String, Integer> map2 = createMap2("Simone", 18, "Giovanni", 21, "Paolo", 15);
        System.out.println(map2);

        Map<String, Integer> map3 = createMap3("Simone", 18, "Giovanni", 21, "Paolo", 15);
        System.out.println(map3);
    }
    public static Map<String, Integer> createMap1(String k1, Integer v1, String k2, Integer v2, String k3, Integer v3) {
        Map<String, Integer> map = new HashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        return map;
    }
    public static Map<String, Integer> createMap2(String k1, Integer v1, String k2, Integer v2, String k3, Integer v3) {
        return Map.of(k1, v1, k2, v2, k3, v3);
    }
    public static Map<String, Integer> createMap3(String k1, Integer v1, String k2, Integer v2, String k3, Integer v3) {
        return Map.ofEntries(
                new AbstractMap.SimpleEntry<>(k1, v1),
                new AbstractMap.SimpleEntry<>(k2, v2),
                new AbstractMap.SimpleEntry<>(k3, v3)
        );
    }
}