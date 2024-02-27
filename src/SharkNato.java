public class SharkNato extends ThunderStorm{

    private int numSharks;

    public SharkNato(double latitude, double longitude, double speed, Direction direction, boolean isTornadoPresent, int numSharks) {
        super(latitude, longitude, speed, direction, isTornadoPresent);
        this.numSharks = numSharks;
    }

    public int getNumSharks() {
        return numSharks;
    }

    public void setNumSharks(int numSharks) {
        this.numSharks = numSharks;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("There are this many sharks "+numSharks);
    }
}
