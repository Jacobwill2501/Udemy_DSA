package Udemy.Hashtables.ArrayBacked;

public class SimpleHashtable {

    private Employee[] hashtable;

    public SimpleHashtable() {
        hashtable = new Employee[10];
    }

    public void put(String key, Employee employee) {
        
    }

    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }

}
