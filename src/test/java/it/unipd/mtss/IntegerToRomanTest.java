package it.unipd.mtss;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntegerToRomanTest {
    @Test
    public void testTooSmallNumber() {
        try
        {
            IntegerToRoman.convert(0);
        }
        catch(IllegalArgumentException e)
        {
            assertEquals("Invalid number", e.getMessage());
        }
    }
    @Test
    public void testTooBigNumber() {
        try
        {
            IntegerToRoman.convert(1000);
        }
        catch(IllegalArgumentException e)
        {
            assertEquals("Invalid number", e.getMessage());
        }
    }
}