package day5;

public class car {

    private String color;
    private String model;
    private double engine;
    private int door;

    public car(String color, String model, double engine, int door) {
        this.color = color;
        this.model = model;
        this.engine = engine;
        this.door = door;

    }
    public car() {
//        this.color = "No information";
//        this.model = "No information";
//        this.engine = 0;
//        this.door = 0;
        this("No information","No information", 0, 0 );
    }
    public car(String color, String model) {
        this(color, model, 0, 0);
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor () {
        return this.color;
    }

    public String getModel() {
        return model;
    }

    public double getEngine() {
        return engine;
    }

    public int getDoor() {
        return door;
    }

    public void showInfo() {
        System.out.println("Car model is " + this.color);
        System.out.println("Number of engine is " + this.model);
        System.out.println("Number of door is " + this.door);
        System.out.println("Number of engine is " + this.engine);
    }

}
