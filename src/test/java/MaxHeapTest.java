import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MaxHeapTest {

    private MaxHeap createMaxHeap() {
        MaxHeap maxHeap = new MaxHeap(2);
        maxHeap.add(6);
        maxHeap.add(13);
        maxHeap.add(5);
        maxHeap.add(11);

        return maxHeap;
    }

    @Test
    void testPeek() {
        MaxHeap maxHeap = createMaxHeap();
        int[] array = maxHeap.getArray();

        assertEquals(13, array[0]);
    }

    @Test
    void testAdd() {
        MaxHeap maxHeap = createMaxHeap();
        int[] expectedArray = {13, 11, 5, 6};

        assertTrue(Arrays.equals(expectedArray, maxHeap.getArray()));
    }

    @Test
    void testPool() {
        MaxHeap maxHeap = createMaxHeap();

        assertEquals(13, maxHeap.pool());
    }

    @Test
    void testIfAddIntsGoesInRightOrder() {
        MaxHeap maxHeap = createMaxHeap();
        int[] expectedArray = {13, 11, 5, 6};

        assertTrue(Arrays.equals(expectedArray, maxHeap.getArray()));
    }
}