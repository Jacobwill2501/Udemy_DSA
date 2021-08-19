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

    public int peek() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("heap is empty");
        }

        return heap[0];
    }

    public int delete(int index) {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("heap is empty");
        }

        int parent = getParent(index);
        int deletedValue = heap[index];

        heap[index] = heap[size - 1];

        if (index == 0 || heap[index] < heap[parent]) {
            fixHeapBelow(index, size - 1);
        } else {
            fixHeapAbove(index);
        }

        size--;

        return deletedValue;

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

    private void fixHeapBelow(int index, int lastHeapIndex) {
        int childToSwap;

        while (index <= lastHeapIndex) {
            int leftChild = getChild(index, true);
            int rightChild = getChild(index, false);
            if (leftChild <= lastHeapIndex) {
                if (rightChild > lastHeapIndex) {
                    childToSwap = leftChild;
                } else {
                    childToSwap = (heap[leftChild] > heap[rightChild] ? leftChild : rightChild);
                }

                if (heap[index] < heap[childToSwap]) {
                    int tmp = heap[index];
                    heap[index] = heap[childToSwap];
                    heap[childToSwap] = tmp;
                } else {
                    break;
                }
                index = childToSwap;
            } else {
                break;
            }

        }
    }

    //check if the heap is full
    public boolean isFull() {
        return size == heap.length;
    }

    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i]);
            System.out.print(", ");
        }
        System.out.println();
    }

    //utility method for getting the parent for an element in the array
    public int getParent(int index) {
        return (index - 1) / 2;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getChild(int index, boolean left) {
        return 2 * index + (left ? 1 : 2);
    }

}
