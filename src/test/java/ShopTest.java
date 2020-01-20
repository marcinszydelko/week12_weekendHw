import behaviours.ISell;
import instruments.Guitar;
import instruments.InstrumentType;
import instruments.Trumpet;
import items.Item;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;
    private Guitar guitar;
    private Trumpet trumpet;
    private Item drumSticks;

    @Before
    public void before() {
        guitar = new Guitar("wood", "black", InstrumentType.STRING, 300, 250, 6);
        drumSticks = new Item("Drum sticks", 20, 15);
        trumpet = new Trumpet("metal", "gold", InstrumentType.BRASS, 180, 130, 3);
        shop = new Shop();
    }

    @Test
    public void shopShouldHaveEmptyStock() {
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void shouldAddItemToStock() {
        shop.addToStock(guitar);
        assertEquals(guitar, shop.getStock().get(0));
    }

    @Test
    public void shouldRemoveItemFromStock() {
        shop.addToStock(guitar);
        shop.addToStock(trumpet);
        shop.removeFromStock(guitar);
        assertEquals(trumpet, shop.getStock().get(0));
    }

//    @Test
//    public void shouldCalculateTotalPotentialProfit() {
//        shop.addToStock(guitar);
//        shop.addToStock(trumpet);
//        assertEquals(100, shop.potentialProfit());
//    }

}
