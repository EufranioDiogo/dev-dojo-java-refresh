package org.eufranio.javaoneforall.javacore.Ycollections.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();

        array.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

        int index1 = binarySearch(0, 7, array, 8);

        System.out.println(index1);

        int index2 = Collections.binarySearch(array, 8);

        System.out.println(index2);
    }

    public static int binarySearch(int start, int end, List<Integer> array, int searchedValue) {
        if (start > end) return -1;
        int middle = (start + end) / 2;

        if (array.get(middle) > searchedValue) {
            return binarySearch(start, middle - 1, array, searchedValue);
        } else if (array.get(middle) < searchedValue) {
            return binarySearch(middle + 1, end, array, searchedValue);
        }
        return middle;
    }
}
