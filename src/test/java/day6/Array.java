package day6;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50};

        int[] arr2 = new int[5];
        arr2[0] = 1;
        arr2[1] = 2;
        arr2[2] = 3;
        arr2[3] = 4;
        arr2[4] = 5;

        System.out.println("arr2 2nd element is " + arr[1]);

        for (int i=0; i<arr.length; i++) {

           System.out.print(arr[i] + " ");

        }


        int[] arr3 = new int[5];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter each element");

        for (int i=0; i<arr3.length; i++) {
            arr3[i]= scan.nextInt();
        }

        for (int i=0; i<arr3.length; i++) {

            System.out.print(arr3[i] + " ");
        }

    }
}
