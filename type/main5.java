package type;

public class main5 {
    public static void main(String[] args) {
        double cena = 19.99;
        int kolicestvo = 3;

        double total = cena * kolicestvo;
        System.out.println("стоимость =" + total);

        int totalInt = (int) total;
        System.out.println("стоимость без копеек = " + totalInt);
    }
}


