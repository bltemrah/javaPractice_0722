package day8;

public class Manager extends Employee {

    String name = "Eyup";

    private int numOfEmployees;

    public Manager(String name, String department, int salary, int numOfEmployees) {
        super(name, department, salary);
        this.numOfEmployees = numOfEmployees;
    }

    public void showInfos() {
        System.out.println("Staff information: ");
        System.out.println("Name " + this.name);
        System.out.println("Name " + name);
        System.out.println("Name " + super.name);
        System.out.println("Department " + department);
        System.out.println("Salary " + salary);
        System.out.println("Number of employees is " + numOfEmployees);
    }

    public void raiseSalary(int amount) {
        System.out.println("Salary increase is around " + amount);
    }

}
