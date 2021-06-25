package Udemy.List.ArrayList;

import Udemy.List.LinkedList.Single.Employee;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jacob", "Williams", 1));
        employeeList.add(new Employee("Ashley", "Aguilera", 2));
        employeeList.add(new Employee("Alyssa", "Aguilera", 3));

        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println("\n" + employeeList.get(1));

        System.out.println("\n" + employeeList.isEmpty());

        employeeList.set(2, new Employee("Jerry", "Williams", 3));
        System.out.println();
        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println();
        System.out.println(employeeList.size());

        employeeList.add(3, new Employee("Alyssa", "Aguilera", 4));
        System.out.println();
        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println();
//        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
//        for (Employee employee : employeeArray) {
//            System.out.println(employee);
//        }
        System.out.println(employeeList.contains(new Employee("Alyssa", "Aguilera", 4)));
        System.out.println(employeeList.indexOf(new Employee("Alyssa", "Aguilera", 4)));

        employeeList.remove(2);
        employeeList.forEach(employee -> System.out.println(employee));


        System.out.println();
    }
}
