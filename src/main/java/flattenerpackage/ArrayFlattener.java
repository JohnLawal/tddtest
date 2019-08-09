package flattenerpackage;

import java.util.Arrays;
import java.util.Objects;

public class ArrayFlattener {

    public int[] flattenArray(int[][] inputArray){
        if(inputArray == null) return null;

        return Arrays.stream(inputArray).filter(Objects::nonNull)
                .flatMapToInt(Arrays::stream).toArray();
    }
}
