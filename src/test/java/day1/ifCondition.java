package day1;

import java.util.Scanner;

public class ifCondition {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your score");

        int score = scan.nextInt();

        if (score>90) {
            System.out.println("Your grade is A++");
        } else if (score>80) {
            System.out.println("Your grade is A");
        } else if (score>70) {
        System.out.println("Your grade is A");
        } else {
            System.out.println("You FAILED");
        }


    }
}
