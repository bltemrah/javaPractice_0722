package day1;

import java.util.Locale;
import java.util.Scanner;

public class comparisonOperators {

    public static void main(String[] args) {

        String accountName = "Meltem";
        String password = "2015";

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your account name");
        String actName = scan.nextLine();
        System.out.println("Please enter your password");
        String psw = scan.nextLine();

        if (!accountName.equals(actName) && !password.equals(psw)) {
            System.out.println("Name and password not correct");
        }
        else if (!accountName.equals(actName) && (password.equals(psw))) {
            System.out.println("Name not correct");
        }
        else if ((accountName.equals(actName) && !password.equals(psw))) {
            System.out.println("Wrong password");
        } else {
            System.out.println("You can log in");
        }

    }
}
