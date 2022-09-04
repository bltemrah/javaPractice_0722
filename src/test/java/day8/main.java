package day8;

public class main {

    public static void main(String[] args) {

        employee employee = new employee("Jack", "IT", 4500);
        employee.showInfos();

        manager manager = new manager("David", "IT", 3500);
        manager.showInfos();
    }
}
