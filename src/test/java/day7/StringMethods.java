package day7;

public class StringMethods {

    public static void main(String[] args) {
        String s1 = "Adam";
        String s2 = new String("Courtenay");

        System.out.println(s2.length());
        System.out.println(s1.length());
        System.out.println("0 index: " + s2.charAt(3));
        System.out.println("0 index: " + s2.charAt(s2.length()-1));
        System.out.println("0 index: " + s2.startsWith("Co"));
        System.out.println("0 index: " + s2.endsWith("ay"));


    }
}
