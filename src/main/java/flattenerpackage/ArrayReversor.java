package flattenerpackage;

import flattenerpackage.service.ArrayFlattenerService;

public class ArrayReversor {
    private ArrayFlattenerService arrayFlattenerService;

    public ArrayReversor(ArrayFlattenerService arrayFlattenerService) {
        this.arrayFlattenerService = arrayFlattenerService;
    }

    public int[] reverseArray(int[][] inputArray){
       int[] flattenedArray = arrayFlattenerService.flattenArray(inputArray); //  ideally:
//        int[] flattenedArray =  new int[]{2,4,5,7,9}; //if we by-pass
        if(flattenedArray == null) return null;
        int i = 0;
        int j = flattenedArray.length - 1;
        while(i < j) {
            int temp = flattenedArray[i];
            flattenedArray[i] = flattenedArray[j];
            flattenedArray[j] = temp;
            i++;
            j--;
        }
        return flattenedArray;
    }
}
