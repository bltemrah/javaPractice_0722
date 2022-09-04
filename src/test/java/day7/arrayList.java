package day7;

import java.util.ArrayList;

public class arrayList {

    public static void main(String[] args) {

        ArrayList<String> groups = new ArrayList<String>();

        groups.add("Metallica");
        groups.add("Iron Maiden");
        groups.add("'Guns' n Roses");
        groups.add("Black Sabbath");

        System.out.println("0 index: " + groups.get(0));
        System.out.println("0 index: " + groups.get(1));

//        size
        System.out.println("Array length: " + groups.size());

        for (int i=0; i< groups.size(); i++) {
            System.out.println(i + " Element is " + groups.get(i));
        }

//        remove
        groups.remove(0);

        for (int i=0; i< groups.size(); i++) {
            System.out.println(i + " Element is " + groups.get(i));
        }

        System.out.println(groups.indexOf("Black Sabbath"));

//        add
        groups.add("Jealous");
        for (int i=0; i< groups.size(); i++) {
            System.out.println(i + " Element is " + groups.get(i));
        }

//        clone
        ArrayList metalicaGroups = new ArrayList<String>();
        metalicaGroups = (ArrayList)groups.clone();

        for (int i=0; i< metalicaGroups.size(); i++) {
            System.out.println(i + " Element is " + metalicaGroups.get(i));
        }
    }
}
