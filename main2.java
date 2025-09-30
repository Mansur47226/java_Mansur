import java.util.LinkedHashSet;

public class main2 {
    public static void main(String[] args) {
        LinkedHashSet<String> classes = new LinkedHashSet<>();

        classes.add("1 класс");
        classes.add("2 класс");
        classes.add("3 класс");
        classes.add("4 класс");
        classes.add("5 класс");

        boolean added = classes.add("11 класс");

        System.out.println("Линкхашсет " + classes);
        System.out.println("Добавилось? " + added);
    }
}
