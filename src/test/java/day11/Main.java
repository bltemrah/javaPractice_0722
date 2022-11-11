package day11;

public class Main {

    public static void main(String[] args) {

        DatabaseManager manager = new DatabaseManager();

        manager.AddDatabase(new MySqlDatabase());

        manager.GetDatabase(new MongoDB());
    }
}
