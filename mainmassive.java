public class mainmassive {
    public static void main(String[] args) {
        Mathunits mathunits = new Mathunits();

        double my_number = mathunits.add(5, 10, 15);
        double my_number2 = mathunits.add(2, 100, 30);
        double sum_myNums = my_number + my_number2;

        mathunits.deleniye(10, 5, -4);

        System.out.println(my_number);
        System.out.println(my_number2);
        System.out.println(sum_myNums);


    }
}
class  Mathunits{
    double add(double a,double b, double c){
        double vichitanie = a - b - c ;
        return vichitanie;
    }

    void deleniye(double x, double y, double z){
        double product = x / y / z;
        System.out.println(product);


    }
}
