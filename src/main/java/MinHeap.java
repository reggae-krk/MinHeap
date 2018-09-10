import java.util.Arrays;

public class MinHeap {

    private int capacity;
    private int size = 0;
    private int[] array;

    public MinHeap(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
    }

    private int getLeftChildIndex(int parentIndex) {
        return 2 * parentIndex + 1;
    }

    private int getRightChildIndex(int parentIndex) {
        return 2 * parentIndex + 2;
    }

    private int getParentIndex(int childIndex) {
        if (childIndex == 0) return 0;
        return (childIndex - 1) / 2;
    }

    private boolean hasLeftChild(int index) {
        return getLeftChildIndex(index) < size;
    }

    private boolean hasRightChild(int index) {
        return getRightChildIndex(index) < size;
    }

    private boolean hasParent(int index) {
        return getParentIndex(index) >= 0;
    }

    private int getLeftChild(int index) {
        return this.array[getLeftChildIndex(index)];
    }

    private int getRightChild(int index) {
        return this.array[getRightChildIndex(index)];
    }

    private int getParent(int index) {
        return this.array[getParentIndex(index)];
    }

    private void swap(int indexOne, int indexTwo) {
        int temp = this.array[indexOne];
        this.array[indexOne] = this.array[indexTwo];
        this.array[indexTwo] = temp;
    }

    private void doubleCapacity() {
        if (this.size == this.capacity) {
            this.array = Arrays.copyOf(this.array, this.capacity * 2);
            this.capacity *= 2;
        }
    }
}
