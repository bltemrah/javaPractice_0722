package interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class breakContinue {

    public static void main(String[] args) {

//        remove the last character of the String based on condition

        String str = "finspire";

        String lastCh = str.substring(str.length() - 1, str.length());

        String updatedStr = "";

        if (lastCh.equals(lastCh)) {
            updatedStr = str.replace("e", "");
        }

        System.out.println("str = " + updatedStr);

        removeCharacter(str);
    }

//    solution with Array

    public static void removeCharacter (String str) {

        List<String> myList = new ArrayList<String>(Arrays.asList(str.split("")));

        String lastChar = myList.get(myList.size()-1);

        if (myList.get(myList.size()-1).equals(lastChar)) {

            myList.remove(myList.size()-1);
        }

        System.out.println(myList);

    }

}
