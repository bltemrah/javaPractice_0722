package day12;

public abstract class AbstractDatabase {

    public static void add() {
        System.out.println("Added a new database");
    }

    public void delete() {
        System.out.println("Deleted database");
    }

    abstract void get();
    abstract void update();
}
