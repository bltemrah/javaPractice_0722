package day8;

public class Manager extends Employee {

    String name = "Eric";

    @Override
    public String toString() {
        return "Manager Object";
    }

    private int numOfEmployees;

    public Manager(String name, String department, int salary, int numOfEmployees) {
        super(name, department, salary);
        this.numOfEmployees = numOfEmployees;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDepartment() {
        return name;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getSalary() {
        return name;
    }
    public void setSalaary(int salary) {
        this.salary = salary;
    }

    @Override
    public void showInfos() {
        super.showInfos();
        //        No need to write below again, if you do not define a new value. It automatically calls the value in main class
        System.out.println("Staff information: ");
        System.out.println("Name " + this.name);
        System.out.println("Name " + name);
        System.out.println("Name " + super.name);
        System.out.println("Name " + getName());
        System.out.println("Name " + getDepartment());
        System.out.println("Name " + getSalary());
//        No need to write below again, if you do not define a new value. It automatically calls the value in main class
        System.out.println("Department " + department); //
//        No need to write below again, if you do not define a new value. It automatically calls the value in main class
        System.out.println("Salary " + salary);
        System.out.println("Number of employees is " + numOfEmployees);
    }

    public void displayInfos() {
        super.displayInfos();
        System.out.println("Number of employees is " + numOfEmployees);
    }

    public void raiseSalary(int amount) {
        System.out.println("Salary increase is around " + amount);
    }

}
