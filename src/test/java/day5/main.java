package day5;

public class main {

    public static void main(String[] args) {

        car car1 = new car("Blue", "Renault", 2.0, 3);
        car car2 = new car ();
        car car3 = new car("Orange", "Mercedes");

        System.out.println("Car 1");
        car1.showInfo();

        System.out.println("Car 2");
        car2.showInfo();

        System.out.println("Car 3");
        car3.showInfo();
    }
}
