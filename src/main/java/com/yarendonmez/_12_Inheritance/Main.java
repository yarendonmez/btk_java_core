package com.yarendonmez._12_Inheritance;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Employee employee1 = new Employee();
        Person person = new Person();

        employee1.firstName = "Yaren";
        employee1.lastName = "Dönmez";
        employee1.fullName = String.join(" ",employee1.firstName, employee1.lastName);
        employee1.age = 23;
        employee1.id = "21118080035";
        employee1.salary = 75000;


        PersonManager personManager = new PersonManager();
        CustomerManager customerManager = new CustomerManager();
        EmployeeManager employeeManager = new EmployeeManager();

        employeeManager.BestEmployee(employee1);

    }
}
