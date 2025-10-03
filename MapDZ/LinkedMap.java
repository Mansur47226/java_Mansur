package MapDZ;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedMap{
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> cities = new LinkedHashMap<>();

        cities.put(1, "Баку");
        cities.put(2, "Санк Питербург");
        cities.put(3, "Мадрид");
        cities.put(4, "Москва");
        cities.put(5, "Нью Уорк");

        System.out.println("города:");
        for (Map.Entry<Integer, String> entry : cities.entrySet()) {
            System.out.println(entry.getKey() + "." + entry.getValue());
        }

        System.out.println("Ключи:" + cities.keySet());

        System.out.println("Значения:" + cities.values());
    }
}
