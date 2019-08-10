package flattenerpackagetests;

import flattenerpackage.ArrayReversor;
import flattenerpackage.service.ArrayFlattenerService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ArrayReversorTest {
    private ArrayFlattenerService arrayFlattenerService = mock(ArrayFlattenerService.class);
    private ArrayReversor arrayReversor;

    @Before
    public void setup() {
        this.arrayReversor = new ArrayReversor(arrayFlattenerService);
    }

    @After
    public void tearDown() {
        this.arrayReversor = null;
    }

    @Test
    public void reverseArray() {
        int[][] inputArray = new int[][]{{2,4}, {5,7}, {9}};
        when(arrayFlattenerService.flattenArray(inputArray)).thenReturn(new int[]{2,4,5,7,9});
        int[] actual = arrayReversor.reverseArray(inputArray);
        int[] expected = new int[]{9,7,5,4,2};
        assertArrayEquals(expected, actual);
        verify(arrayFlattenerService).flattenArray(inputArray);
    }
}