package me.iamscray;

public class Loader {

    public static void main(String[] args) {
        EmployeeService service = new EmployeeService(EmployeeFactory.generateEmployees(5));

        service.printEmployees();

        service.sortByName();
        service.printEmployees();

        service.sortByNameAndSalary();
        service.printEmployees();
    }
}
