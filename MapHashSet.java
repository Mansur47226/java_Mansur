import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapHashSet {
    public static void main(String[] args) {
        HashMap<String, Integer> Students = new HashMap<>();

        Students.put("Alik", 14);
        Students.put("Jeyhun", 65);
        Students.put("Murad", 13);
        Students.put("Darina", 5);
        Students.put("Omar", 13);

        Set<Map.Entry<String, Integer>> set = Students.entrySet();

        for (Map.Entry<String, Integer> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        if (Students.containsKey("Alice")) {
            System.out.println("Студент Alice найден, возраст: " + Students.get("Alice"));
        } else {
            System.out.println("Студент Alice не найден");
        }

        Students.remove("Jeyhun");

        System.out.println("После удаления Jeyhun:");

        for (Map.Entry<String, Integer> me : Students.entrySet()) {
            System.out.println(me.getKey() + ": " + me.getValue());
        }
    }
}
