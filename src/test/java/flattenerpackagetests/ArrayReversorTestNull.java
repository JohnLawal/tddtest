package flattenerpackagetests;

import flattenerpackage.ArrayReversor;
import flattenerpackage.service.ArrayFlattenerService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ArrayReversorTestNull {
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
        int[][] inputArray = null;
        when(arrayFlattenerService.flattenArray(inputArray)).thenReturn(null);
        int[] actual = arrayReversor.reverseArray(inputArray);
        int[] expected = null;
        assertArrayEquals(expected, actual);
        verify(arrayFlattenerService).flattenArray(inputArray);
    }
}