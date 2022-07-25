package day1;

import java.util.Locale;
import java.util.Scanner;

public class scanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your favorite software");
        String name = scan.next();
        System.out.println("Your favorite software is " + name);

    }
}
