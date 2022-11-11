package replitQs.stringManupulation;

import java.util.Scanner;

public class Q63 {

    public static void main(String[] args) {

        /*
         * You have 2 words
         * Print the first word, second word, second word, first word
         */

        String w1 = "door";
        String w2 = "room";

        String result = "";

        System.out.println(w1.concat(w2).concat(w2).concat(w1));

        Scanner sc = new Scanner(System.in);
        String w = sc.nextLine();

        if(w.length() >= 4 && w.length() %2 == 0) {
            System.out.println(w.substring(w.length()/2-1, w.length()/2+1));
        } else if (w.length() %2 == 0 && w.length()==2 ) {
            System.out.println(w.concat(w));
        } else if (w.length() >= 3 && w.length() %2 != 0) {
            System.out.println(w.substring(w.length()/2, w.length()/2+1));;
        } else if (w.length() %2 != 0 && w.length()==1 ) {
            System.out.println(w.concat(w).concat(w));
        }


    }
}
