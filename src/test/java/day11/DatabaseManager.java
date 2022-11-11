package day11;

public class DatabaseManager {

    public void AddDatabase (IDatabase database) {
        database.add();

    }

    public void UpdateDatabase (IDatabase database) {
        database.update();

    }

    public void GetDatabase (IDatabase database) {
        database.get();

    }

    public void DeleteDatabase (IDatabase database) {
        database.delete();

    }
}
