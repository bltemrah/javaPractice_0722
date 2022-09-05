package day8;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee("Jack", "IT", 4500);
        employee.showInfos();

        Manager manager = new Manager("David", "IT", 3500, 250);
        manager.showInfos();
        manager.raiseSalary(100);
    }
}
