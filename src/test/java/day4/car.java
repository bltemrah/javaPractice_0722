package day4;

public class car {

    private String color;
    private String model;
    private double engine;
    private int door;

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

    public void start() {
        System.out.println("Car is good");
    }

    public void stop() {
        System.out.println("Car is stopping");
    }
}
