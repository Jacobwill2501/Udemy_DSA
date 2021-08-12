package Udemy.Hashtables.BucketSort;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] intArray = {54, 46, 83, 66, 95, 92, 43};

        bucketSort(intArray);
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }

    public static void bucketSort(int[] input) {
        //first create each bucket as an ArrayList
        List<Integer>[] buckets = new List[10];

        for (int i = 0; i < buckets.length; i++) {
            //using linked list for buckets
            //buckets[i] = new LinkedList<Integer>();

            //using array list for buckets
            buckets[i] = new ArrayList<Integer>();
        }

        //scattering phase
        for (int i = 0; i < input.length; i++) {
            buckets[hash(input[i])].add(input[i]);
        }

        //sort each bucket
        for (List bucket : buckets) {
            Collections.sort(bucket);
        }

        //copy the buckets back into the orginial array
        int j = 0;
        for (int i = 0; i < buckets.length; i++) {
            for (int value : buckets[i]) {
                input[j++] = value;
            }
        }

    }

    private static int hash(int value) {
        return value / (int) 10;
    }

}
