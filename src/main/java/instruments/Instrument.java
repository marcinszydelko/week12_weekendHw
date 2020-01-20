package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instrument implements ISell, IPlay {
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

    public int calculateMarkup() {
        return this.sellPrice - this.buyPrice;
    }


}
