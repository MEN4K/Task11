import java.util.HashMap;
import java.util.Map;

    public class MapBuff {
        public static void main(String[] args) {
            Map<String, Integer> map = new HashMap<>();
            Map<Integer, String> reversMap = new HashMap<>();

            map.put("Bruce Wayne", 1);
            map.put("Gandalf", 2);
            map.put("Jon Snow", 3);
            map.put("Dart Weider", 4);
            map.put("Captain Jack Sparrow", 5);
            map.put("Peter Parker", 6);
            map.put("Uzumaki Naruto", 7);
            map.put("John McClane", 8);
            map.put("Emmett Brown", 9);
            map.put("Lightning Mcqueen", 10);

            for(Map.Entry<String, Integer> item: map.entrySet()) {
                reversMap.put(item.getValue(), item.getKey());
            }

            for(Map.Entry<Integer, String> item: reversMap.entrySet()) {
                System.out.println(item.getKey() + ", " + item.getValue());
            }
        }
    }

