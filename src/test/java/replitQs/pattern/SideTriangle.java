package replitQs.pattern;

public class SideTriangle {

    public static void main(String[] args) {

        /*
                 *
                 * *
                 * * *
                 * * * *
        */

        int row = 4;

        for (int i=0; i<row; i++) {

            for (int j=0; j<=i; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("============================");

        /*
            * * * * *
            * * * *
            * * *
            * *
            *
        */

        int n = 4;

        for (int i=0; i<=n; i++) {

            for (int j=i; j<=n; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
