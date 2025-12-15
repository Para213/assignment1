package main.java.com.assignment.cars;

public class CarBuilder {
    protected String engine;
    protected String transmission;
    protected boolean hasLeatherSeats = false;
    protected boolean hasGPS = false;
    protected boolean hasSunroof = false;
    protected String color = "White"; // Default color

    // Constructor with required parameters forces validity
    public CarBuilder(String engine, String transmission) {
        this.engine = engine;
        this.transmission = transmission;
    }

    public CarBuilder setLeatherSeats(boolean hasLeatherSeats) {
        this.hasLeatherSeats = hasLeatherSeats;
        return this;
    }

    public CarBuilder setGPS(boolean hasGPS) {
        this.hasGPS = hasGPS;
        return this;
    }

    public CarBuilder setSunroof(boolean hasSunroof) {
        this.hasSunroof = hasSunroof;
        return this;
    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public Car build() {
        // Validation logic can go here
        if (engine == null || transmission == null) {
            throw new IllegalStateException("Cannot build car without engine and transmission");
        }
        return new Car(this);
    }
}