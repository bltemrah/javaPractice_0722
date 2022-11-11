package replitQs.stringManupulation;

public class Q72 {

    public static void main(String[] args) {

        String email = "mike_tyson@gmail.com";

        int name = email.indexOf("_");
        int sname = email.indexOf("@");


        String name1 = email.substring(0, name);
        String sname2 = email.substring(name+1, sname);

        System.out.println(sname2 + "_" + name1 + "@" + "gmail" + ".com") ;

    }
}
