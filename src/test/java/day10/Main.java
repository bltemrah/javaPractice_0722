package day10;

public class Main {

    public static void main(String[] args) {

//        we can not create an object from interface class as below
//        IDatabase database = new IDatabase();

        Customer customer = new Customer();
        Student student = new Student();

        student.log();
        customer.log();

        IDatabase databaseS = new Student();
        IDatabase databaseC = new Customer();

        databaseC.log();
        databaseS.log();




    }


}
