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
}
