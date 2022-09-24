package day7;

public class ArrayList {

    public static void main(String[] args) {

        java.util.ArrayList<String> groups = new java.util.ArrayList<String>();

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
        java.util.ArrayList metalicaGroups = new java.util.ArrayList<String>();
        metalicaGroups = (java.util.ArrayList)groups.clone();

        for (int i=0; i< metalicaGroups.size(); i++) {
            System.out.println(i + " Element is " + metalicaGroups.get(i));
        }
    }
}
