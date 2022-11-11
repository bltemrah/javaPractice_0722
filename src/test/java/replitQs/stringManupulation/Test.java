package replitQs.stringManupulation;

public class Test {

    public static void main(String[] args) {

        String w = "Ahmet okula gidiyor";

        int o = w.indexOf("okula");

        System.out.println(w.indexOf("okula"));
        String sub = w.substring(o+3, w.length());

        System.out.println(sub);

    }
}
