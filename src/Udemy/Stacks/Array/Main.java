package Udemy.Stacks.Array;

public class Main {

    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(10);

        Employee jacobWilliams = new Employee("Jacob", "Williams", 1);
        Employee ashleyAguilera = new Employee("Ashley", "Aguilera", 2);
        Employee alyssaAguilera = new Employee("Alyssa", "Aguilera", 3);

        stack.push(jacobWilliams);
        stack.push(ashleyAguilera);
        stack.push(alyssaAguilera);

        stack.printStack();

    }

}
