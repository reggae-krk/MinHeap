import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MinHeapTest {

    @Test
    void testPeek() {
        MinHeap minHeap = new MinHeap(10);

        minHeap.add(6);
        int[] array = minHeap.getArray();

        assertEquals(6, array[0]);
    }

    @Test
    void testAdd() {
        MinHeap minHeap = new MinHeap(2);
        int[] expectedArray = {6, 12};

        minHeap.add(6);
        minHeap.add(12);

        assertTrue(Arrays.equals(expectedArray, minHeap.getArray()));
    }

    @Test
    void testPool() {
        MinHeap minHeap = new MinHeap(2);

        minHeap.add(6);
        minHeap.add(12);

        assertEquals(6, minHeap.pool());
    }

    @Test
    void testIfAddIntsGoesInRightOrder() {
        MinHeap minHeap = new MinHeap(2);
        int[] expectedArray = {5, 11, 6, 13};

        minHeap.add(6);
        minHeap.add(13);
        minHeap.add(5);
        minHeap.add(11);

        assertTrue(Arrays.equals(expectedArray, minHeap.getArray()));
    }
}