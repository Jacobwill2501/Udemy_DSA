package Udemy.SearchAlgorithms.LinearSearch;
/*
Basic Search Algorithm in Linear time
- O(n)
- Compare each index to the value you are looking for
 */


public class Main {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        System.out.println("Searching for " + -15 + ": " + linearSearch(intArray, -15));
        System.out.println("Searching for " + 1 + ": " + linearSearch(intArray, 1));
        System.out.println("Searching for " + 8 + ": " + linearSearch(intArray, 8));
    }

    public static int linearSearch(int[] input, int value) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
