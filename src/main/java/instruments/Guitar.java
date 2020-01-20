package instruments;

public class Guitar extends Instrument {
    private int numberOfStrings;

    public Guitar(String material, String colour, InstrumentType instrumentType, int sellPrice, int buyPrice, int numberOfStrings) {
        super(material, colour, instrumentType, sellPrice, buyPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
