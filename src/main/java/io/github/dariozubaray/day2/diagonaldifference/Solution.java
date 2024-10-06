package io.github.dariozubaray.day2.diagonaldifference;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import static java.util.stream.Collectors.toList;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int dimensions = arr.get(0).get(0);
        int acumuladorDerecha = 0, acumuladorIzquierda = 0;
        int aproximacionDerecha = 0, aproximacionIzquierda = dimensions -1;
        for (int i = 1; i-1 < dimensions; i++) {
            List<Integer> fila = arr.get(i);

            int diagonalDerecha = fila.get(aproximacionDerecha);
            acumuladorDerecha += diagonalDerecha;
            int diagonalIzquierda = fila.get(aproximacionIzquierda);
            acumuladorIzquierda += diagonalIzquierda;

            aproximacionDerecha++;
            aproximacionIzquierda--;
        }
        int resultado = acumuladorDerecha - acumuladorIzquierda;
        return resultado < 0 ? resultado * -1 : resultado;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
