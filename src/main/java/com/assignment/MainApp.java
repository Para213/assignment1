package main.java.com.assignment;

import main.java.com.assignment.cars.Car;
import main.java.com.assignment.cars.CarBuilder;
import main.java.com.assignment.documents.Document;
import main.java.com.assignment.documents.DocumentFactory;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("=== Car Management System ===\n");

        // 1. Configure a Car using the Builder
        System.out.println("Step 1: Configuring Car...");
        Car sportCar = new CarBuilder("V8", "Automatic")
                .setColor("Red")
                .setGPS(true)
                .setSunroof(true)
                .build();

        System.out.println("Car Built: " + sportCar.toString());

        // 2. Create a Document to save this spec using the Factory
        System.out.println("\nStep 2: Selecting Document Format...");
        String userSelection = "pdf"; // Imagine this came from a UI

        try {
            Document doc = DocumentFactory.createDocument(userSelection);

            doc.open();
            // Saving the Car's string representation into the document
            doc.save(sportCar.toString());

            System.out.println("Success! File saved with extension: " + doc.getExtension());

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}