import java.util.NavigableSet;
import java.util.TreeSet;

public class main4 {
    public static void main(String[] args) {
        NavigableSet<Integer> numbers = new TreeSet<>();

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);

        System.out.println(numbers.higher(300));

        System.out.println(numbers.floor(350));

        System.out.println(numbers.descendingSet());
    }
}
