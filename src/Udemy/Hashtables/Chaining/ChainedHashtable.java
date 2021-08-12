package Udemy.Hashtables.Chaining;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashtable {

    private LinkedList<StoredEmployee>[] hashtable;

    public ChainedHashtable() {
        hashtable = new LinkedList[10];
        for (int i = 0; i < hashtable.length; i++) {
            hashtable[i] = new LinkedList<StoredEmployee>();
        }
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        hashtable[hashedKey].add(new StoredEmployee(key, employee));
    }

    public Employee get(String key) {
        int hashedkey = hashKey(key);
        ListIterator<StoredEmployee> iterator = hashtable[hashedkey].listIterator();
        StoredEmployee employee = null;

        // iterating through table
        while (iterator.hasNext()) {
            employee = iterator.next();
            if (employee.key.equals(key)) {
                return employee.employee;
            }
        }
        //if we drop out of while loop, then we iterated through entire table and key is not there
        return null;

    }

    public Employee remove(String key) {
        int hashedkey = hashKey(key);
        ListIterator<StoredEmployee> iterator = hashtable[hashedkey].listIterator();
        StoredEmployee employee = null;
        int index = -1;

        // iterating through table
        while (iterator.hasNext()) {
            employee = iterator.next();
            index++;
            if (employee.key.equals(key)) {
                break;
            }
        }

        if (employee == null || !employee.key.equals(key)) {
            return null;
        } else {
            hashtable[hashedkey].remove(index);
            return employee.employee;
        }
    }

    private int hashKey(String key) {
        //return key.length() % hashtable.length;

        //hashCode function can return negative numbers so take the absolute value
        //always mod by the length so the values your returning are within the plausible indices
        return Math.abs(key.hashCode() % hashtable.length);
    }

    public void printHashtable() {
        for (int i = 0; i < hashtable.length; i++) {
            if (hashtable[i].isEmpty()) {
                System.out.println("Position " + i + ": empty");
            } else {
                System.out.print("Position " + i + ": ");
                ListIterator<StoredEmployee> iterator = hashtable[i].listIterator();
                while (iterator.hasNext()) {
                    System.out.print(iterator.next().employee);
                    System.out.print("->");
                }
                System.out.println("null");
            }
        }

    }

}
