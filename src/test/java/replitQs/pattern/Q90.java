package replitQs.pattern;


public class Q90 {

    public static void main(String[] args) {

        //Return the number of times that the string "java" appears
        //anywhere in the given string word.

        String w = "javaxjavaapplepearjavaegg";

        int count = 0;

        for (int i=0; i<w.length()-1; i++ ) {

            if (w.substring(i, i+4).equalsIgnoreCase("java")) {

                count++;
            }
        }
    }
}