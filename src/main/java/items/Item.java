package items;

public class Item {
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
}
