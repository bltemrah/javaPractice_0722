package day1;

public class Scanner {

    public static void main(String[] args) {

        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Please enter your favorite software");
        String name = scan.next();
        System.out.println("Your favorite software is " + name);

    }
}
