public class ThunderStorm extends Storm{
    private boolean isTornadoPresent;

    public ThunderStorm(double latitude, double longitude, double speed, Direction direction, boolean isTornadoPresent) {
        super(latitude, longitude, speed, direction);
        this.isTornadoPresent = isTornadoPresent;
    }

    public boolean isTornadoPresent() {
        return isTornadoPresent;
    }

    public void setTornadoPresent(boolean tornadoPresent) {
        isTornadoPresent = tornadoPresent;
    }

    @Override
    public void display() {
        System.out.println("This is the new display method.......Tornado = "+isTornadoPresent);
    }
}
