package Udemy.List.ArrayList;

import Udemy.List.LinkedList.Single.Employeee;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Employeee> employeeList = new ArrayList<>();
        employeeList.add(new Employeee("Jacob", "Williams", 1));
        employeeList.add(new Employeee("Ashley", "Aguilera", 2));
        employeeList.add(new Employeee("Alyssa", "Aguilera", 3));

        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println("\n" + employeeList.get(1));

        System.out.println("\n" + employeeList.isEmpty());

        employeeList.set(2, new Employeee("Jerry", "Williams", 3));
        System.out.println();
        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println();
        System.out.println(employeeList.size());

        employeeList.add(3, new Employeee("Alyssa", "Aguilera", 4));
        System.out.println();
        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println();
//        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
//        for (Employee employee : employeeArray) {
//            System.out.println(employee);
//        }
        System.out.println(employeeList.contains(new Employeee("Alyssa", "Aguilera", 4)));
        System.out.println(employeeList.indexOf(new Employeee("Alyssa", "Aguilera", 4)));

        employeeList.remove(2);
        employeeList.forEach(employee -> System.out.println(employee));


        System.out.println();
    }
}
