package day12;

import day11.DatabaseManager;
import day11.MongoDB;
import day11.MySqlDatabase;

public class Main {

    public static void main(String[] args) {

        DatabaseManager manager = new DatabaseManager();

        manager.AddDatabase(new MySqlDatabase());

        manager.GetDatabase(new MongoDB());
    }
}
