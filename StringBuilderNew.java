public class StringBuilderNew {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("hello");
        sb1.append("world");
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder("java fun");
        sb2.insert(5, "is ");
        System.out.println(sb2);

        StringBuilder sb3 = new StringBuilder("i like Java");
        int start = sb3.indexOf("Java");
        sb3.replace(start, start + 4, "python");
        System.out.println(sb3);

        StringBuilder sb4 = new StringBuilder("delete this word");
        int delStart = sb4.indexOf("this");
        int delEnd = delStart + "this".length();
        sb4.delete(delStart, delEnd + 1);
        System.out.println(sb4);

        StringBuilder sb5 = new StringBuilder("12345");
        sb5.reverse();
        System.out.println(sb5);

        StringBuilder sb6 = new StringBuilder("Java Programming");
        System.out.println(sb6.length());

        StringBuilder sb7 = new StringBuilder("12345678901234567890");
        sb7.delete(sb7.length() - 5, sb7.length());
        System.out.println(sb7);

        StringBuilder sb8 = new StringBuilder("programmingInJava");
        sb8.delete(10, sb8.length());
        System.out.println(sb8);

        StringBuilder sb9 = new StringBuilder("hell0");
        sb9.setCharAt(4, 'o');
        System.out.println(sb9);


    }
}
