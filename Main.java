public class Main {
    public static void main(String[] args) {
        String str1 = new String("добро пожаловать");
        String str2 = new String("спасибо");

        System.out.println(str1.length());
        System.out.println(str2.charAt(0));
        System.out.println(str1.substring(str1.length() - 4));
        if (str1.equals(str2)) {
            System.out.println("строки одинаковые");
        } else {
            System.out.println("строки разные");
        }
    }
}
