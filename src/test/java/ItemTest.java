import items.Item;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    private Item drumSticks;

    @Before
    public void before() {
        drumSticks = new Item("Drum sticks", 20, 15);
    }

    @Test
    public void shouldHaveType() {
        assertEquals("Drum sticks", drumSticks.getType());
    }

    @Test
    public void shouldHaveSellPrice() {
        assertEquals(20, drumSticks.getSellPrice());
    }

    @Test
    public void shouldHaveBuyPrice() {
        assertEquals(15, drumSticks.getBuyPrice());
    }

    @Test
    public void shouldCalculateMarkup() {
        assertEquals(5, drumSticks.calculateMarkup());
    }
}
