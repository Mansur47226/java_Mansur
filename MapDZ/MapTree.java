package MapDZ;

import java.util.TreeMap;
import java.util.Map;

public class MapTree {
    public static void main(String[] args) {
        TreeMap<Integer, String> phoneBook = new TreeMap<>();

        phoneBook.put(5551234, "ELgun");
        phoneBook.put(5556789, "Svetlana");
        phoneBook.put(5551111, "Secinc");
        phoneBook.put(5552222, "Banu");
        phoneBook.put(5559999, "Muhammad");

        System.out.println("Номера");
        for (Map.Entry<Integer, String> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println();

        System.out.println("firstEntry:" + phoneBook.firstEntry());
        System.out.println("lastEntry:" + phoneBook.lastEntry());
    }
}
