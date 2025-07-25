public class StringMethod {
    public static void main(String[] args) {

        Integer a = 1552; // int a = 123;
        String s = Integer.toString(a);
        System.out.println(s);

        String str3 = "information";
        System.out.println(str3.startsWith("a")); // true
        System.out.println(str3.endsWith("n")); // false

        String text3 = "java";
        String text4 = "java";
        System.out.println(text4.compareTo(text3));

        String c = "Mansur";
        System.out.println(c.indexOf("n"));
        System.out.println(c.lastIndexOf("n"));

    }
}