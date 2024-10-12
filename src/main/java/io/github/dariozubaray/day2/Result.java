package io.github.dariozubaray.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Result {

    public static int flippingMatrix(List<List<Integer>> matrix) {
        int dimensions = matrix.get(0).size();
        int totalLength = dimensions - 1;
        int middle = dimensions / 2;
        int maxSum = 0;

        for (int i = 0; i < middle; i++) {
            for (int j = 0; j < middle; j++) {
                var listaTemporal = new ArrayList<Integer>();
                listaTemporal.add(matrix.get(i).get(j));
                listaTemporal.add(matrix.get(i).get(totalLength - j));
                listaTemporal.add(matrix.get(totalLength - i).get(j));
                listaTemporal.add(matrix.get(totalLength - i).get(totalLength - j));
                listaTemporal.forEach(num -> System.out.print(" " + num + " "));

                int maxValue = Collections.max(listaTemporal);
                System.out.println("maxvalue: " + maxValue);
                maxSum += maxValue;
            }
        }

        return maxSum;
    }

    public static void main(String[] arg) {
        System.out.println("Mock test init...");
        List<Integer> row1 = new ArrayList<>(List.of(112, 42, 83, 119));
        List<Integer> row2 = new ArrayList<>(List.of(56, 125, 56, 49));
        List<Integer> row3 = new ArrayList<>(List.of(15, 78, 101, 43));
        List<Integer> row4 = new ArrayList<>(List.of(62, 98, 114, 108));
        List<List<Integer>> matrix = new ArrayList<>(List.of(row1, row2, row3, row4));

        int result = flippingMatrix(matrix);
        System.out.println("Result: " + result);
    }
}
