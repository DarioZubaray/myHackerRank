package io.github.dariozubaray.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Result {

    /*
     * Complete the 'findMedian' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    public static int findMedian(List<Integer> arr) {
        // Write your code here
        // check length
        if(Objects.isNull(arr) || arr.size() < 0) return -1;

        // sort if needed
        Collections.sort(arr);
        // find the middlest element
        return arr.get(arr.size() / 2);
    }

    public static void main(String[] args) {
        var arr = new ArrayList<>(List.of(1, 3, 5, 2, 4));
        var result = findMedian(arr);
        System.out.println("result: " + result);
    }
}
