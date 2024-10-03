package io.github.dariozubaray.day2.lonelyInteger;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LonelyIntegerTest {

    @Test
    public void lonelyIntegerTest() {
        List<Integer> input = new ArrayList<>(List.of(1,2,3,4,3,2,1));

        int result = LonelyInteger.lonelyinteger(input);
        System.out.println(result);
        assertEquals(4, result);
    }

}