package day1;

import static java.lang.Math.round;

public class operator {

    public static void main(String[] args) {

        int x = 5;
        int y = 3;

        System.out.println(x+y);
        System.out.println((double)x/y);
        System.out.println((double)(x/y));
        System.out.println(round((double)x/y));
        System.out.println((double)x%y);

        x+=3;
        System.out.println("new x value= " + x);

        x++;
        System.out.println("new x value= " + x);

        x--;
        System.out.println("new x value= " + x);

        System.out.println("new x value= " + x--);
        System.out.println("new x value= " + x);

        System.out.println("new x value= " + --x);

    }
}
