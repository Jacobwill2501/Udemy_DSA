package Udemy.Heaps.Implementation.MaxHeap;

public class Heap {

    private int[] heap;
    private int size;

    public Heap(int capacity) {
        heap = new int[capacity];
    }

    //always put the inserted node at the end of the array
    public void insert(int value) {
        if (isFull()) {
            throw new IndexOutOfBoundsException("Heap is full");
        }

        //put the new item at the first available spot
        heap[size] = value;

        //now to potentially heapify, check if value is > than parent, if so switch, then repeat
        fixHeapAbove(size);
        size++;

    }

    //travelling up the tree to heapfiy
    private void fixHeapAbove(int index) {
        int newValue = heap[index];

        //if not at root and newValue is greater than its parent
        while (index > 0 && newValue > heap[getParent(index)]) {
            heap[index] = heap[getParent(index)];
            index = getParent(index);
        }

        heap[index] = newValue;
    }

    //check if the heap is full
    public boolean isFull() {
        return size == heap.length;
    }

    //utility method for getting the parent for an element in the array
    public int getParent(int index) {
        return (index - 1) / 2;
    }

}
