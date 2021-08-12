package Udemy.Hashtables.LinearProbing;


public class SimpleHashtable {

    private Employee[] hashtable;

    public SimpleHashtable() {
        hashtable = new Employee[10];
    }

    public void put(String key, Employee employee) {
        //hashedKey will give the index in the array
        int hashedKey = hashKey(key);

        //check if position is already occupied
        if (occupied(hashedKey)) {//if occupied we need to do linear probing
            //first set a stop index, need to know when to stop looking
            int stopIndex = hashedKey;
            //will increment or probe if not at end, if at end of array, loop back to index 0
            // this is only for first probe
            if (hashedKey == hashtable.length - 1) {
                hashedKey = 0;
            } else {
                hashedKey++;
            }

            //our looping for linear probing
            while (occupied(hashedKey) && hashedKey != stopIndex) {
                hashedKey = (hashedKey + 1) % hashtable.length;
            }
        }

        //collision handling
        if (occupied(hashedKey)) {
            System.out.println("Sorry there is already an employee at position " + hashedKey);
        } else {
            hashtable[hashedKey] = employee;
        }
    }

    public Employee get(String key) {
        int hashedKey = hashKey(key);
        return hashtable[hashedKey];
    }

    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    //Will check if the index is occupied for use in linear probing method of avoiding collisions
    private boolean occupied(int index) {
        return hashtable[index] != null;
    }

    public void printHashtable() {
        for (Employee employee : hashtable) {
            System.out.println(employee);
        }
    }

}
