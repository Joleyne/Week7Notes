enum Direction{NORTH, SOUTH, EAST, WEST}


class Storm {

    private double latitude;
    private double longitude;
    private double speed;
    private Direction direction;
    public static int numOfStorms;

    public Storm(double latitude, double longitude, double speed, Direction direction) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.speed = speed;
        this.direction = direction;
        numOfStorms++;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void display(){
        System.out.println("The storm is located at (" +latitude+ ", "+ longitude +") at "+ speed+" MPH "+direction+".");
    }


    @Override
    public String toString() {
        return "Storm{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                ", speed=" + speed +
                ", direction=" + direction +
                '}';
    }
}
