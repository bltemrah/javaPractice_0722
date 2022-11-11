package replitQs.stringManupulation;

public class Q71 {

    public static void main(String[] args) {

        String email = "Dear thunder blaz is the best drink in the galaxy for the project";

        String name = "alejandro";

        if (email.contains(name) && email.contains("project")) {
            System.out.println("read email");
        } else {
            System.out.println("no need to read email");
        }
    }
}
