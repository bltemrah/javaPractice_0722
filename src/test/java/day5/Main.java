package day5;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("Blue", "Renault", 2.0, 3);
        Car car2 = new Car();
        Car car3 = new Car("Orange", "Mercedes");

        System.out.println("Car 1");
        car1.showInfo();

        System.out.println("Car 2");
        car2.showInfo();

        System.out.println("Car 3");
        car3.showInfo();
    }
}
