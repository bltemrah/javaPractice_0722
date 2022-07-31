package day1;

import java.util.Scanner;

public class breakContinue {

    public static void main(String[] args) {

        while (true) {
            Scanner scan = new Scanner(System.in);
            String letter;

            System.out.println("Please enter a letter");
            letter = scan.nextLine();

            if (letter.equals("q")) {
                System.out.println("Congratulation, your letter match the default one");
                System.out.println("Default letter is " + letter);
                break;
            }

            int i = 0;
            while (i<10) {
                if (i ==4 || i==7) {
                    i++;
                    continue;
                }

                System.out.println("i : " + i);
                i++;
            }
        }
    }
}
