package io.github.dariozubaray.day1.timeconversion;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TimeConversionTest {

    @Test
    public void timeConversionTest() {
        String time = "2:01:00PM";

        String result = TimeConversion.timeConversion(time);
        System.out.println(result);
        assertEquals(result, "14:01:00");
    }

}