package Udemy.Stacks.LinkedList;

/*
- if you want to use stack, dont use the java.util.stack class
- use the deque?
- or just use the linkedlist class
 */
// gonna use linkedlist class

public class Main {
    public static void main(String[] args) {

        Employee jacobWilliams = new Employee("Jacob","Williams",1);
        Employee ashleyAguilera = new Employee("Ashley","Aguilera",2);
        Employee alyssaAguilera = new Employee("Alyssa","Aguilera",3);

        LinkedStack stack = new LinkedStack();

        stack.push(jacobWilliams);
        stack.push(ashleyAguilera);
        stack.push(alyssaAguilera);

    }
}
