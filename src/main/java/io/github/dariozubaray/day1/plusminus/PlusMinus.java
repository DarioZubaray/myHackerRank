package io.github.dariozubaray.day1.plusminus;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class PlusMinus {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    public static void plusMinus(List<Integer> arr) {
        float positive = 0, negative = 0, zero = 0;
        for(Integer num : arr) {
            if(num < 0) positive++;
            else if(num > 0) negative++;
            else zero++;
        }
        int total = arr.size();
        System.out.println(String.format("%.6f", negative / total));
        System.out.println(String.format("%.6f", positive / total));
        System.out.println(String.format("%.6f", zero / total));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        plusMinus(arr);

        bufferedReader.close();
    }
}
