class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println("животное звучит");
    }

    void move() {
        System.out.println("животное двигается");
    }

    void eat() {
        System.out.println("животное ест");
    }

    void info() {
        System.out.println("имя: " + name);
    }

    String getType() {
        return "Животное";
    }
}

class Lion extends Animal {
    Lion(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("р-р-р");
    }

    @Override
    void move() {
        System.out.println("бежит");
    }

    @Override
    void eat() {
        System.out.println("кушает мясо");
    }

    @Override
    String getType() {
        return "лев";
    }
}

class Parrot extends Animal {
    Parrot(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("привет");
    }

    @Override
    void move() {
        System.out.println("летит");
    }

    @Override
    void eat() {
        System.out.println("ест семена");
    }

    @Override
    String getType() {
        return "попугай";
    }
}

class Fish extends Animal {
    Fish(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("буль буль");
    }

    @Override
    void move() {
        System.out.println("плывёт");
    }

    @Override
    void eat() {
        System.out.println("ест водоросли");
    }

    @Override
    String getType() {
        return "рыба";
    }
}

public class Zoo {
    public static void main(String[] args) {
        Lion lion = new Lion("Симба");
        Parrot parrot = new Parrot("Кеша");
        Fish fish = new Fish("Немо");

        System.out.println("Тип: " + lion.getType());
        lion.info();
        lion.makeSound();
        lion.move();
        lion.eat();
        System.out.println();

        System.out.println("Тип: " + parrot.getType());
        parrot.info();
        parrot.makeSound();
        parrot.move();
        parrot.eat();
        System.out.println();

        System.out.println("Тип: " + fish.getType());
        fish.info();
        fish.makeSound();
        fish.move();
        fish.eat();
        System.out.println();
    }
}
