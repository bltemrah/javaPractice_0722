package replitQs.stringManupulation;

import java.util.Scanner;

public class Q92 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int i = 1;
        long factorial = 1;

        while(i <= n)
        {
            factorial *= i;
            i++;
        }
        System.out.printf("Factorial of %d = %d", n, factorial);
    }
}
