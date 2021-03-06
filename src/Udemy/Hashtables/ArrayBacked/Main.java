package Udemy.Hashtables.ArrayBacked;

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

        //ht.printHashtable();

        System.out.println("Retrieve key Wilson: " + ht.get("Wilson"));

    }
}

//Essentials of a hashtable
/*
- Put employee, you hash the key
- then using the key, you put the employee at the appropriate place
- When you Get employee, you have to use the same key and same hash function, then use the result
of the hash function to retrieve the employee from hashtable
 */