package replitQs.stringManupulation;

public class Q79 {

    public static void main(String[] args) {

        String txt = "Emrah";

        String result = "";

        for (int i = 0; i < txt.length() - 1; i++) {
            result = result + txt.charAt(i);
        }

        System.out.println(result);
    }

}
