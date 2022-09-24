package day9;

import day8.Employee;
import day8.Manager;

public class Object_ToString {

    public static void main(String[] args) {

        Manager manager = new Manager("David", "IT", 3500, 250);

        /*need to override toString in Manager class;
        @Override
            public String toString() {
                return "Manager Object";
            }
        * */
        System.out.println(manager);
    }
}
