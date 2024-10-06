package io.github.dariozubaray.day2.diagonaldifference;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void diagonalDifferenceTest() {
        List<Integer> rows1 = new ArrayList<>(List.of(3));
        List<Integer> rows2 = new ArrayList<>(List.of(11, 2, 4));
        List<Integer> rows3 = new ArrayList<>(List.of(4, 5, 6));
        List<Integer> rows4 = new ArrayList<>(List.of(10, 8, -12));
        List<List<Integer>> input = new ArrayList<>(List.of(rows1, rows2, rows3, rows4));

        int result = Result.diagonalDifference(input);

        assertEquals(15, result);
    }
}