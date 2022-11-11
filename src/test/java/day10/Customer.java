package day10;

public class Customer implements IDatabase{

    @Override
    public void log() {
        System.out.println("Added a new customer");
    }
}
