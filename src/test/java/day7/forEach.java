package day7;

import java.util.ArrayList;

public class forEach {

    public static void main(String[] args) {

        ArrayList<String> groups = new ArrayList<String>();

        groups.add("Metallica");
        groups.add("Iron Maiden");
        groups.add("'Guns' n Roses");
        groups.add("Black Sabbath");

        int [] arr = {10,20,30};

        for(String s:groups) {
            System.out.println("Element is " + s);
        };

        for(int i:arr) {
            System.out.println("Element is " + i);
        }



    }
}