public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}

class Outer {
    int outer_x = 100;
    int outer_x_2 = 200;
    int outer_x_3 = 3;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        void display() {
            System.out.println((outer_x + outer_x_2) / outer_x_3);
        }
    }
}
