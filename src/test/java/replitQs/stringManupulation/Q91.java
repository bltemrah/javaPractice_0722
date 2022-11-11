package replitQs.stringManupulation;

import javax.swing.*;

public class Q91 {

    public static void main(String[] args) {

        //Print out the number of times that the string "hi" appears
        //anywhere in the given string.

        String w = "hiabc hi how hi";

        int count = 0;

        for (int i = 0; i <= w.length()-2; i++) {

            if (w.substring(i, (i + 2)).equalsIgnoreCase("hi")) {
                count++;
            }
        }

        System.out.println("The number of hi in the sentence is " + count);
    }
}
