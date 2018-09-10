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

    public int peek() {
        if (this.size == 0) throw new IllegalStateException();
        return this.array[0];
    }

    public int pool() {
        if (this.size == 0) throw new IllegalStateException();
        int elementToRemove = this.array[0];
        this.array[0] = this.array[size - 1];
        this.size--;
        heapifyDown();
        return elementToRemove;
    }

    public void add(int element) {
        doubleCapacity();
        this.array[size] = element;
        this.size++;
        heapifyUp();
    }

    public void heapifyUp() {
        int index = this.size -1;
        while (hasParent(index) && getParent(index) > this.array[index]) {
            swap(getParentIndex(index), index);
            index = getParentIndex(index);
        }
    }

    public void heapifyDown() {
        int index = 0;
        while (hasLeftChild(index)) {
            int smallerChildIndex = getLeftChildIndex(index);
            if(hasRightChild(index) && getRightChild(index) < getLeftChild(index)) {
                smallerChildIndex = getRightChildIndex(index);
            }
            if (this.array[index] < this.array[smallerChildIndex]) break;
            else {
                swap(index, smallerChildIndex);
            }
            index = smallerChildIndex;
        }
    }

    public int[] getArray() {
        return array;
    }
}
