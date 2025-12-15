package main.java.com.assignment.cars;

public class Car {
    // Required
    private String engine;
    private String transmission;

    // Optional
    private boolean hasLeatherSeats;
    private boolean hasGPS;
    private boolean hasSunroof;
    private String color;

    // Constructor is private to force use of Builder
    protected Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.transmission = builder.transmission;
        this.hasLeatherSeats = builder.hasLeatherSeats;
        this.hasGPS = builder.hasGPS;
        this.hasSunroof = builder.hasSunroof;
        this.color = builder.color;
    }

    @Override
    public String toString() {
        return "Car Configuration: [" +
                "Engine=" + engine +
                ", Transmission=" + transmission +
                ", Color=" + color +
                ", LeatherSeats=" + hasLeatherSeats +
                ", GPS=" + hasGPS +
                ", Sunroof=" + hasSunroof +
                "]";
    }

    // Getters for testing
    public String getEngine() { return engine; }
    public boolean hasGPS() { return hasGPS; }
}