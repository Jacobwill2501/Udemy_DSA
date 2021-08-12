package Udemy.Hashtables.JDK;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        Map<String, Employee> hashMap = new HashMap<String, Employee>();
        hashMap.put(janeJones.getLastName(), janeJones);
        hashMap.put(johnDoe.getLastName(), johnDoe);
        hashMap.put(marySmith.getLastName(), marySmith);

        //putting another value with same key will replace what is at the key and return the value
        Employee employee = hashMap.put("Doe", mikeWilson);
        System.out.println(employee);
        //if you dont like this, you can use the putifabsent method
        Employee employee2 = hashMap.putIfAbsent("Doe", billEnd);
        System.out.println(employee2); //returns what object is currently there

        //if key isnt there when using get, will return null
        System.out.println(hashMap.get("Williams"));
        //if want to return not null, will return mikeWilson by default
        System.out.println(hashMap.getOrDefault("Williams", mikeWilson));

        System.out.println(hashMap.remove("Jones"));

        //can check with contains method
//        System.out.println(hashMap.containsKey("Doe"));
//        System.out.println(hashMap.containsValue(janeJones));

        //iterator way to print out
//        Iterator<Employee> iterator = hashMap.values().iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        //printing out with lambda expression Java 8 and beyond
        hashMap.forEach((k, v) -> System.out.println("Key = " + k + ", Employee = " + v));

    }
}
