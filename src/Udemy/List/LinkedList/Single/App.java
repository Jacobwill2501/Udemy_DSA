package Udemy.List.LinkedList.Single;

import java.util.List;

/*
Notes from Udemy:
Singly Linked List -
    Each item within the list is called a node.
    The first item in the list is the head of the list.
    Each item contains a reference to the next item in the list.
    Last item in the list always point to null.

Steps to insert in linked list -
note: always insert to first position
    1. Create a new node
    2. Assign the "next" node in field
    3. Assign head to new node
    O(1) Time complexity

Steps to delete in linked list -
note: from first position
    1. Assign node to a temp variable
    2. Assign head to second node
    3. Return temp variable
    O(1) Time complexity

Note:
Does not need to be resized
Storing extra field with every node
 */


public class App {
    public static void main(String[] args) throws Exception {
        Employee jacobWilliams = new Employee("Jacob", "Williams", 1);
        Employee ashleyAguilera = new Employee("Ashley", "Aguilera", 2);
        Employee alyssaAguilera = new Employee("Alyssa", "Aguilera", 3);

        EmployeeLinkedList list = new EmployeeLinkedList();

        System.out.println(list.isEmpty());

        list.addToFront(jacobWilliams);
        list.addToFront(ashleyAguilera);
        list.addToFront(alyssaAguilera);

        System.out.println(list.getSize());

        list.printList();

        list.removeFromFront();
        list.printList();
        System.out.println(list.getSize());

    }
}
