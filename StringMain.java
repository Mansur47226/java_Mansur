public class StringMain {
    public static void main(String[] args) {


        String str1 = "programming";
        System.out.println(str1.length());


        String str2 = "hello";
        System.out.println(str2.charAt(2));

        String str3 = "i love Java";
        String word = str3.substring(2, 6);
        System.out.println(word);

        String str4 = "i love cookies";
        int index = str4.indexOf('c');
        System.out.println(index);

        String str5 = "Java";
        System.out.println(str5.toUpperCase());
        System.out.println(str5.toLowerCase());

        String str6 = "banana";
        String replaced = str6.replace('a', '*');
        System.out.println(replaced);

        String a = "hello";
        String b = new String("Hello");

        System.out.println((a == b));
        System.out.println(a.equals(b));
    }
}
