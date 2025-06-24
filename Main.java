public class Main {
    public static void main(String[] args) {
        Yeger y = new Yeger("Йегер в форме титана", 150);
        Mikasa m = new Mikasa("Микаса", 100);
        Levi l = new Levi("капитан Леви", 120);

        y.attack();
        y.NewForm();

        m.attack();
        m.Defence();

        l.attack();
        l.shootUPM();
    }
}

class Hero {
    String name;
    int health;

    public Hero(String heroName, int heroHealth) {
        name = heroName;
        health = heroHealth;
    }

    public void attack() {
        System.out.println(name + " атакует");
    }
}

class Yeger extends Hero {
    public Yeger(String n, int h) {
        super(n, h);
    }

    public void NewForm() {
        System.out.println(name + " обрел 2 форму");
    }
}

class Mikasa extends Hero {
    public Mikasa(String n, int h) {
        super(n, h);
    }

    public void Defence() {
        System.out.println(name + " страхует Йегера чтобы его не съел титан");
    }
}
class Levi extends Hero {
    public Levi(String n, int h) {
        super(n, h);
    }

    public void shootUPM() {
        System.out.println(name + " зацепился с помощью УПМ на шею титана");
    }
}
