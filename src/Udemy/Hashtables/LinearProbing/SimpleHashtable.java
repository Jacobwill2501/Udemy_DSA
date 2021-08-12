package Udemy.Hashtables.LinearProbing;


public class SimpleHashtable {

    private StoredEmployee[] hashtable;

    public SimpleHashtable() {
        hashtable = new StoredEmployee[10];
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
            hashtable[hashedKey] = new StoredEmployee(key, employee);
        }
    }

    public Employee get(String key) {
        int hashedKey = findKey(key);
        if (hashedKey == -1) {
            return null;
        }
        return hashtable[hashedKey].employee;
    }

    public Employee remove(String key) {
        int hashedKey = findKey(key);
        if (hashedKey == -1) {
            return null;
        }

        Employee employee = hashtable[hashedKey].employee;
        hashtable[hashedKey] = null;
        return employee;
    }

    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    //used to find the employee with givenkey
    private int findKey(String key) {
        int hashedKey = hashKey(key);
        if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)) {
            return hashedKey;
        }

        int stopIndex = hashedKey;
        if (hashedKey == hashtable.length - 1) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }

        while (hashedKey != stopIndex &&
                hashtable[hashedKey] != null &&
                !hashtable[hashedKey].key.equals(key)) {
            hashedKey = (hashedKey + 1) % hashtable.length;
        }

        if (hashtable[hashedKey] != null &&
                hashtable[hashedKey].key.equals(key)) {
            return hashedKey;
        } else {
            return -1;
        }

    }

    //Will check if the index is occupied for use in linear probing method of avoiding collisions
    private boolean occupied(int index) {
        return hashtable[index] != null;
    }

    public void printHashtable() {
        for (int i = 0; i < hashtable.length; i++) {
            if (hashtable[i] == null) {
                System.out.println("empty");
            } else {
                System.out.println("Position " + i + ": " + hashtable[i].employee);
            }

        }
    }

}
