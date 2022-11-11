package day11;

public class MySqlDatabase implements IDatabase{

    @Override
    public void add() {
        System.out.println("MySql addition");
    }

    @Override
    public void delete() {
        System.out.println("MySql delete");
    }

    @Override
    public void get() {
        System.out.println("MySql get");
    }

    @Override
    public void update() {
        System.out.println("MySql update");
    }
}
