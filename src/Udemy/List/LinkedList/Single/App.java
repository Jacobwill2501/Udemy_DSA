package Udemy.List.LinkedList.Single;

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
        Employeee jacobWilliams = new Employeee("Jacob", "Williams", 1);
        Employeee ashleyAguilera = new Employeee("Ashley", "Aguilera", 2);
        Employeee alyssaAguilera = new Employeee("Alyssa", "Aguilera", 3);

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
