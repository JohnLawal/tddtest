package flattenerpackagetests;

import flattenerpackage.ArrayFlattener;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayFlattenerTestNull {


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
        int[] actual = arrayFlattener.flattenArray(null);

        assertArrayEquals(actual, null);
    }
}