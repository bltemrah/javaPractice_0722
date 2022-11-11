package replitQs.stringManupulation;

import day1.Input;

import java.util.Scanner;

public class Q61 {

    public static void main(String[] args) {

//        print the longest word

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter first word");
        String word1 = scan.next();

        System.out.println("Please enter second word");
        String word2 = scan.next();

        int w1= word1.length();
        int w2 = word2.length();

        String result = (w1>w2) ? (word1 + " is longest") : (word2 + " is longest");

    }
}
