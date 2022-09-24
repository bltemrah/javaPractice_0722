package day1;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scan.nextInt();

        switch (number) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Gecersiz sayi");
                break;
        }

//        Balance

        int balance = 1000;
        System.out.println("1: Display balance");
        System.out.println("2: Deposit");
        System.out.println("3: Withdraw");
        System.out.println("4: Exit");

        int select = scan.nextInt();

        switch (select) {
            case 1:
                System.out.println("Your balance is: " + balance);
                break;
            case 2:
                System.out.println("How much deposit");
                int dAmount = scan.nextInt();
                balance+=dAmount;
                System.out.println("Your balance is: " + balance);
                break;
            case 3:
                System.out.println("Withdraw amount");
                int wAmount = scan.nextInt();
                balance-=wAmount;
                System.out.println("Your balance is: " + balance);
                break;
            case 4:
                System.out.println("Have a nice day");
                break;
            default:
                System.out.println("Not Applicaple");
        }
    }
}
