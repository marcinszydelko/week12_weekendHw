package instruments;

public abstract class Instrument {
    private String material;
    private String colour;
    private InstrumentType instrumentType;
    private int sellPrice;
    private int buyPrice;

    public Instrument(String material, String colour, InstrumentType instrumentType, int sellPrice, int buyPrice) {
        this.material = material;
        this.colour = colour;
        this.instrumentType = instrumentType;
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public int getBuyPrice() {
        return buyPrice;
    }
}
