package Udemy.List.LinkedList.Single;

public class EmployeeNode {

    //field for employee
    private Employeee employee;
    //field for reference to next node
    private EmployeeNode next;

    public EmployeeNode(Employeee employee) {
        this.employee = employee;
    }

    public Employeee getEmployee() {
        return employee;
    }

    public void setEmployee(Employeee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return employee.toString();
    }
}
