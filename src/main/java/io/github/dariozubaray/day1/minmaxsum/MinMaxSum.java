package io.github.dariozubaray.day1.minmaxsum;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class MinMaxSum {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        arr.sort(Integer::compareTo);
        int sumaSinPrimero = 0;
        for (int i = 1; i < arr.size(); i++) {
            sumaSinPrimero += arr.get(i);
        }
        int sumaSinUltimo = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            sumaSinUltimo += arr.get(i);
        }
        System.out.println(sumaSinUltimo + " " + sumaSinPrimero);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        miniMaxSum(arr);

        bufferedReader.close();
    }
}
