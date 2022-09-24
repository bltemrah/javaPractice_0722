package day3;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car();

        car1.color = "Black";
        car1.model = "Audi";
        car1.engine = 1.6;
        car1.door = 4;

        System.out.println("Car model is " + car1.model);
        System.out.println("Car color is " + car1.color);
        System.out.println("Car has " + car1.door + " doors");

    }
}
