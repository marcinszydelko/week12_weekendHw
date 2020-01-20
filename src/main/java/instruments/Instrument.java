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


}
