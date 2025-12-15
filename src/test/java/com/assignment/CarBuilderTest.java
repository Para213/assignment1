package test.java.com.assignment;

import main.java.com.assignment.cars.Car;
import main.java.com.assignment.cars.CarBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarBuilderTest {

    @Test
    public void testCarBuilderRequiredFields() {
        Car car = new CarBuilder("V6", "Manual").build();
        assertEquals("V6", car.getEngine());
        assertFalse(car.hasGPS()); // Should be false by default
    }

    @Test
    public void testCarBuilderFullConfiguration() {
        Car car = new CarBuilder("V8", "Automatic")
                .setColor("Black")
                .setGPS(true)
                .setLeatherSeats(true)
                .build();

        assertTrue(car.hasGPS());
        assertTrue(car.toString().contains("Color=Black"));
    }

    @Test
    public void testBuilderChaining() {
        CarBuilder builder = new CarBuilder("Electric", "Auto");
        // Verify method chaining returns the builder instance
        assertTrue(builder.setColor("Blue") instanceof CarBuilder);
    }
}