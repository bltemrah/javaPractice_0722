package day4;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car();

        car1.setColor("Red");
        car1.setDoor(4);
        car1.setEngine(1.6);

        System.out.println("Car model is " + car1.getColor());

        System.out.println("Number of door is " + car1.getDoor());

        System.out.println("Number of engine is " + car1.getEngine());

        car1.start();
        car1.stop();

    }
}
