package instruments;

public class Trumpet extends Instrument{
    private int numberOfValves;

    public Trumpet(String material, String colour, InstrumentType instrumentType, int sellPrice, int buyPrice, int numberOfValves) {
        super(material, colour, instrumentType, sellPrice, buyPrice);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public String play() {
        return "Tarantara!";
    }
}
