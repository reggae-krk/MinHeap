public class MinHeap {

    private int capacity;
    private int size = 0;
    private int[] array;

    public MinHeap(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
    }
}
