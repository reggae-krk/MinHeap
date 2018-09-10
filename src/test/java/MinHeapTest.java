import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinHeapTest {

    @Test
    void testPeek() {
        MinHeap minHeap = new MinHeap(10);

        minHeap.add(6);
        int[] array = minHeap.getArray();

        assertEquals(6, array[0]);
    }
}