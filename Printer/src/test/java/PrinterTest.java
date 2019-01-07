import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before() {printer = new Printer(100, 100); }

    @Test
    public void hasNumberOfSheets() {
        assertEquals(100, printer.getSheetsRemaining() );
    }

    @Test
    public void canPrintIfHasEnoughPaper() {
        printer.print(10, 5);
        assertEquals(50, printer.getSheetsRemaining() );
    }

    @Test
    public void cantPrintIfDoesntHaveEnoughPaper() {
        printer.print(50, 50);
        assertEquals(100, printer.getSheetsRemaining() );
    }

    @Test
    public void canRefillPaper() {
        printer.print(10, 5);
        printer.refill();
        assertEquals(100, printer.getSheetsRemaining() );
    }

    @Test
    public void tonerDecreasesAfterPrinting() {
        printer.print(10, 5);
        assertEquals(90, printer.getTonerRemaining() );
    }


}
