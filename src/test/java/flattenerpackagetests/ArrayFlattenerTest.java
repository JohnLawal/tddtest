package flattenerpackagetests;

import flattenerpackage.ArrayFlattener;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayFlattenerTest {

    private ArrayFlattener arrayFlattener;

    @Before
    public void setUp(){
        this.arrayFlattener = new ArrayFlattener();
    }

    @After
    public void tearDown(){
        this.arrayFlattener = null;
    }

    @Test
    public void testFlattenArray() {
        int[][] input = new int[][]{{1, 3}, null, {4, 8, 9}};
        int[] actual = arrayFlattener.flattenArray(input);
        int[] expected = new int[]{1, 3, 4, 8, 9};

        assertArrayEquals(actual,expected);
    }
}