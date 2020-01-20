package items;

import behaviours.ISell;

public class Item implements ISell {
    private String type;
    private int sellPrice;
    private int buyPrice;

    public Item(String type, int sellPrice, int buyPrice) {
        this.type = type;
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
    }

    public String getType() {
        return type;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int calculateMarkup() {
        return this.sellPrice - this.buyPrice;
    }
}
