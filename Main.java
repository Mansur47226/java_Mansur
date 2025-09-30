import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> classes = new HashSet<>();
        classes.add("1 класс");
        classes.add("2 класс");
        classes.add("3 класс");
        classes.add("4 класс");
        classes.add("5 класс");

        boolean isAdded = classes.add("11 класс");

        System.out.println("Хашсет " + classes);
        System.out.println("Добавлен ли дублкат " + isAdded);
    }
}
