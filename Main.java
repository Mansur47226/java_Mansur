package Math;

public class Main {
    public static void main(String[] args) {
        int a = 25;
        double b = -4.7;
        double c = 2.5;

        System.out.println(Math.sqrt(a));
        System.out.println(Math.abs(b));
        System.out.println(Math.pow(c, 3));
        System.out.println(Math.min(a, c));
        System.out.println(Math.max(a, c));
        System.out.println(Math.floor(b));
        System.out.println(Math.ceil(b));
        System.out.println(Math.round(b));
        System.out.println(Math.random());

        System.out.println();

        Person p1 = new Person("Алиса", 21);
        Person p2 = new Person("Боб", 30);

        p1.greet();
        p2.greet();
    }
}
