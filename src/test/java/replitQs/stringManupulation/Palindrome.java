package replitQs.stringManupulation;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome("aba"));
        System.out.println(palindrome("aba"));
    }

    private static boolean isPalindrome(String str) {
        if (str == null)
            return false;
        StringBuilder strBuilder = new StringBuilder(str);
        strBuilder.reverse();
        return strBuilder.toString().equals(str);
    }

    public static boolean palindrome(String str) {
        if (str == null) {
            return false;
        }
        int l = str.length();
        for (int i = 0; i < l / 2; i++) {
            if (str.charAt(i) != str.charAt(l - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
