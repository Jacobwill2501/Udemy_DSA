package Udemy.Hashtables.Chaining;

public class Main {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        SimpleHashtable ht = new SimpleHashtable();

        ht.put(janeJones.getLastName(), janeJones);
        ht.put(johnDoe.getLastName(), johnDoe);
        ht.put(mikeWilson.getLastName(), mikeWilson);
        ht.put(marySmith.getLastName(), marySmith);

        ht.printHashtable();

        System.out.println("Retrieve key Wilson: " + ht.get("Wilson"));
        System.out.println("Retrieve key Smith: " + ht.get("Smith"));

        ht.remove("Jones");
        ht.remove("Wilson");

        ht.printHashtable();

        System.out.println("Retrieve key Smith: " + ht.get("Smith"));
    }
}
