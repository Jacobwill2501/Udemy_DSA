package Udemy.List.LinkedList.Double;

/*
Notes from Udemy:
Doubly Linked List -
    List will have a head and a tail
    Each node in the list has a "next" and a "previous" field

    Can work with beginning and ending nodes in constant time

    Insert at head-
        1. Create new node "Bill"
        2. Assign "Jane" to Bill's next field
        3. Assign whatever jane is pointing to as previous to Bill's previous field
        4. Assign "Bill" to Jane's previous field
        5. Assign head to "Bill"
        O(1) time complexity
    Insert at tail-
        1. Create new node "Bill"
        2. Assign tail's next field to Bill's next field
        3. Assign tail to Bill's previous field
        4. Assign tail's next field to "Bill"
        5. Assign tail to "Bill"
        O(1) time complexity
    Delete from head -
        1. Assign "Jane" to "removedNode"
        2. Assign John's previous field to Jane's previous field
        3. Assign head to Jane's next field
        4. Return "removedNode" from the method
        O(1) time complexity
    Delete from head -
        1. Assign "Bill" to "removedNode"
        2. Assign Mike's next field to Bill's previous field
        3. Assign tail to Bill's previous field
        4. Return "removedNode" from the method
        O(1) time complexity
 */


public class App {
    public static void main(String[] args) throws Exception {
        Employee janeJones = new Employee("Jane","Jones",123);
        Employee johnDoe = new Employee("John","Doe",4567);
        Employee marySmith = new Employee("Mary","Smith",22);
        Employee mikeWilson = new Employee("Mike","Wilson",3245);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        list.printList();
        System.out.println(list.getSize());

        Employee billEnd = new Employee("Bill","End", 78);
        list.addToEnd(billEnd);

        list.printList();
        System.out.println(list.getSize());

    }
}
