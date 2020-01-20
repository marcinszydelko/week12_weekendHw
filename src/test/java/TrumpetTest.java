import instruments.Guitar;
import instruments.InstrumentType;
import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {
    private Trumpet trumpet;

    @Before
    public void before() {
        trumpet = new Trumpet("metal", "gold", InstrumentType.BRASS, 180, 130, 3);
    }

    @Test
    public void shouldGetMaterial() {
        assertEquals("metal", trumpet.getMaterial());
    }

    @Test
    public void shouldGetColour() {
        assertEquals("gold", trumpet.getColour());
    }

    @Test
    public void shouldGetInstrumentType() {
        assertEquals(InstrumentType.BRASS, trumpet.getInstrumentType());
    }

    @Test
    public void shouldGetSellPrice() {
        assertEquals(180, trumpet.getSellPrice());
    }

    @Test
    public void shouldGetBuyPrice() {
        assertEquals(130, trumpet.getBuyPrice());
    }

    @Test
    public void shouldGetNumberOfValves() {
        assertEquals(3, trumpet.getNumberOfValves());
    }

    @Test
    public void shouldGetTrumpetsSound() {
        assertEquals("Tarantara!", trumpet.play());
    }
}
