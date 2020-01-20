import instruments.Guitar;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    private Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("wood", "black", InstrumentType.STRING, 300, 250, 6);
    }

    @Test
    public void shouldGetMaterial() {
        assertEquals("wood", guitar.getMaterial());
    }

    @Test
    public void shouldGetColour() {
        assertEquals("black", guitar.getColour());
    }

    @Test
    public void shouldGetInstrumentType() {
        assertEquals(InstrumentType.STRING, guitar.getInstrumentType());
    }

    @Test
    public void shouldGetSellPrice() {
        assertEquals(300, guitar.getSellPrice());
    }

    @Test
    public void shouldGetBuyPrice() {
        assertEquals(250, guitar.getBuyPrice());
    }

    @Test
    public void shouldGetNumberOfStrings() {
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void shouldGetGuitarsSound() {
        assertEquals("Dum", guitar.play());
    }
}
