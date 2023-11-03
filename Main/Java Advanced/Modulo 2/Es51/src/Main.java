import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("Simone", 18, "Giovanni", 21, "Paolo", 15);
        for(Map.Entry<String, Integer> element : map.entrySet()) {
            System.out.println("Element: " + element);
        }
    }
}