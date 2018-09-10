import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MinHeapTest {

    private MinHeap createMinHeap() {
        MinHeap minHeap = new MinHeap(2);
        minHeap.add(6);
        minHeap.add(13);
        minHeap.add(5);
        minHeap.add(11);

        return minHeap;
    }

    @Test
    void testPeek() {
        MinHeap minHeap = createMinHeap();
        int[] array = minHeap.getArray();

        assertEquals(5, array[0]);
    }

    @Test
    void testAdd() {
        MinHeap minHeap = createMinHeap();
        int[] expectedArray = {5, 11, 6, 13};

        assertTrue(Arrays.equals(expectedArray, minHeap.getArray()));
    }

    @Test
    void testPool() {
        MinHeap minHeap = createMinHeap();

        assertEquals(5, minHeap.pool());
    }

    @Test
    void testIfAddIntsGoesInRightOrder() {
        MinHeap minHeap = createMinHeap();
        int[] expectedArray = {5, 11, 6, 13};

        assertTrue(Arrays.equals(expectedArray, minHeap.getArray()));
    }
}