package day9;

import day8.Employee;
import day8.Manager;

public class Polymorphism {

    public static void main(String[] args) {

        Employee employee = new Manager("Rich", "Banking", 5000, 23);
//        employee.showInfos();
        employee.displayInfos();

    }
}
