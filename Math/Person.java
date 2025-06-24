package Math;
public class Person {
    String name;
    int age;


    public Person(String n, int a) {
        name = n;
        age = a;
    }

    public void greet() {
        System.out.println("привет меня зовут " + name + " и мне " + age + " лет");
    }
}
