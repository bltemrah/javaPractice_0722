package day8;

public class Employee {

//        private String name;
//        private String department;
//        private int salary;

    public String name;
    public String department;
    public int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void showInfos() {
        System.out.println("Staff information: ");
        System.out.println("Name " + name);
        System.out.println("Department " + department);
        System.out.println("Salary " + salary);
    }

}

