package day2;

public class MethodOverloading {

    public static void main(String[] args) {

        System.out.println(sum( 3, 5));
        System.out.println(sum( 3, 5, 9));
        word("word");
    }

    public static int sum(int a, int b) {

        return (a + b);
    }

    public static int sum(int a, int b, int c) {

        return (a + b + c);
    }

    public static void word(String str) {

        System.out.println(str);
    }
}
