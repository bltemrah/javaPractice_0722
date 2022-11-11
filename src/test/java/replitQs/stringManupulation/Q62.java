package replitQs.stringManupulation;

public class Q62 {

    public static void main(String[] args) {

//        Write a program that will print out first and last letters together.

        String w = "complex";

        String wF = w.substring(0,1);

        int nL = w.length();
        String wL = w.substring(6, (nL));

        System.out.println(wF+wL);
    }
}
