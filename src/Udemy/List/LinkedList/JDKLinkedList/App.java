package Udemy.List.LinkedList.JDKLinkedList;

import java.util.Iterator;
import java.util.LinkedList;

/*
    Notes:
        Version implemented is a doubly linked list.
        Not synchronized. DO not use with multiple threads unless you synchronize.
 */

public class App {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane","Jones",123);
        Employee johnDoe = new Employee("John","Doe",4567);
        Employee marySmith = new Employee("Mary","Smith",22);
        Employee mikeWilson = new Employee("Mike","Wilson",3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        LinkedList<Employee> list = new LinkedList<>();

        list.addFirst(janeJones);
        list.addFirst(johnDoe);
        list.addFirst(marySmith);
        list.addFirst(mikeWilson);

        //printing list through iterator
        Iterator iter = list.iterator();
        System.out.println("HEAD -> ");
        while(iter.hasNext()){
            System.out.println(iter.next());
            System.out.println(" <=> ");
        }
        System.out.println("null");
        System.out.println();

/*
        for(Employee employee: list){
            System.out.println(employee);
        }
*/
        //will add to end of the linked list
        list.add(billEnd);
        //list.addLast(billEnd);
        iter = list.iterator();
        System.out.println("HEAD -> ");
        while(iter.hasNext()){
            System.out.println(iter.next());
            System.out.println(" <=> ");
        }
        System.out.println("null");
        System.out.println();

        list.removeLast();
        iter = list.iterator();
        System.out.println("HEAD -> ");
        while(iter.hasNext()){
            System.out.println(iter.next());
            System.out.println(" <=> ");
        }
        System.out.println("null");
        System.out.println();
    }
}
