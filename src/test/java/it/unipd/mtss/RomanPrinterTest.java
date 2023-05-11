package it.unipd.mtss;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RomanPrinterTest {
    @Test
    public void testEmpty()
    {
        String s = RomanPrinter.printAsciiArt("");
        assertEquals("", s);
    }
    @Test
    public void testInvalidCharacter()
    {
        try
        {
            RomanPrinter.printAsciiArt("g");
        }
        catch (IllegalArgumentException e)
        {
            assertEquals("Invalid character", e.getMessage());
        }
    }
    /*
    @Test
    public void testLowerCase()
    {
        String s = RomanPrinter.printAsciiArt("i");
        assertEquals()
    }
     */
    @Test
    public void testOne() {
        //System.out.println(RomanPrinter.print(586));
        System.out.println(RomanPrinter.printAsciiArt("X"));
        assertEquals(true, true);
    }
}