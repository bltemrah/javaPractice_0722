package replitQs.stringManupulation;

public class Q82 {
    public static void main(String[] args) {

        //Write for and while loops so that they print those numbers
        //between 1 and 20 and divisible by 3.

        int i= 0;

        while(i<=20) {

            if (i%3==0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
