package Udemy.List.Vector;

import Udemy.List.LinkedList.Single.Employeee;

import java.util.List;
import java.util.Vector;

/*
Notes from Udemy:
ArrayList vs Vector -
    Both are Lists backed by Arrays.

    Vectors came first in JDK v1.0
    Vector is synchronized ArrayList is not.

    This means vector is thread-safe, but if that is not needed use ArrayList
    Don't use ArrayList on multiple threads, will lead to thread conflicts.

    Synchronization has overhead involved, so before ArrayList came along, you were forced to have the overhead
    involved with Vector. That's why ArrayList was added, so eliminate the overhead when synchronization is not needed.

    What does synchronization mean:
    It means that multiple threads can modify the Vector in parallel without risk of data corruption.
    If you want to do this with an ArrayList, you need to use the synchronized keyword.

    TLDR: Use Vector if thread-safety is required, otherwise, use ArrayList.

 */


public class App {
    public static void main(String[] args) throws Exception {
        List<Employeee> employeeList = new Vector<>();
        employeeList.add(new Employeee("Jacob", "Williams", 1));
        employeeList.add(new Employeee("Ashley", "Aguilera", 2));
        employeeList.add(new Employeee("Alyssa", "Aguilera", 3));


        System.out.println();
    }
}
