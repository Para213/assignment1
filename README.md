# Assignment 1: Document Editor & Car Configuration System

This project is a software solution designed to demonstrate flexible object creation and configuration using Design Patterns. It combines a **Document Editor (Factory Pattern)** and a **Car Configuration App (Builder Pattern)** into a single **Car Management System**.

---

## 📋 Project Overview

The application allows a user to:

- **Configure a Car**  
  Select engines, transmissions, and optional features (GPS, Sunroof, etc.) step-by-step.

- **Export Data**  
  Save the configured car details into various document formats (PDF, Word, HTML) dynamically.

---

## 🏗 Design Patterns Used

### 1. Factory Method Pattern (Document Editor)

**Problem**  
The editor needs to handle multiple file formats (PDF, Word, HTML) and should be open to future formats without modifying existing code.

**Solution**  
A `DocumentFactory` allows the client code to request a document by string type (e.g., `"pdf"`). The factory handles the instantiation logic, keeping the main application decoupled from specific document classes.

**Files**
- `Document.java`
- `DocumentFactory.java`
- `PdfDocument.java`, `WordDocument.java`, `HtmlDocument.java`

---

### 2. Builder Pattern (Car Configuration)

**Problem**  
Creating a `Car` object involves many parameters (Engine, Color, Rims), some of which are optional. Using a constructor with 10+ arguments is messy and error-prone.

**Solution**  
A `CarBuilder` class allows the car to be constructed step-by-step. It provides a fluent interface (method chaining) and ensures the `Car` object is only instantiated when it is in a valid state.

**Files**
- `Car.java`
- `CarBuilder.java`

---

## 📂 Project Structure

src/
├── main/
│ └── java/
│ ├── com/
│ │ └── assignment/
│ │ ├── documents/ # Factory Pattern implementation
│ │ │ ├── Document.java
│ │ │ ├── DocumentFactory.java
│ │ │ └── [Pdf/Word/Html]Document.java
│ │ ├── cars/ # Builder Pattern implementation
│ │ │ ├── Car.java
│ │ │ └── CarBuilder.java
│ │ └── MainApp.java # Combined Logic (Entry Point)
└── test/
└── java/
└── com/
└── assignment/
├── DocumentTest.java # Unit Tests
└── CarBuilderTest.java


---

## 🚀 How It Works

1. **Initialization**  
   The `MainApp` starts.

2. **Building**  
   The `CarBuilder` is invoked. It mandates an `Engine` and `Transmission`, then allows optional chaining for features like `setGPS(true)`.

3. **Creation**  
   The `.build()` method creates an immutable `Car` instance.

4. **Selection**  
   The user (simulated in `MainApp`) selects a file format (e.g., `"pdf"`).

5. **Factory Execution**  
   `DocumentFactory.createDocument("pdf")` returns a specific `PdfDocument` object without the Main App knowing the implementation details.

6. **Saving**  
   The car’s `toString()` data is passed to the document’s `save()` method.

---

## 🛠 How to Run

Prerequisites
Java Development Kit (JDK) 8 or higher.
(Optional) Maven or Gradle if you prefer build tools, though standard javac works fine.

Compile the Code

Navigate to the project root directory in your terminal:

mkdir bin
javac -d bin src/main/java/com/assignment/**/.java src/main/java/com/assignment/.java

Run the Application

java -cp bin com.assignment.MainApp

Expected Output

=== Car Management System ===

Step 1: Configuring Car...
Car Built: Car Configuration: [Engine=V8, Transmission=Automatic, Color=Red, LeatherSeats=false, GPS=true, Sunroof=true]

Step 2: Selecting Document Format...
Opening PDF Viewer...
Compressing and saving content as PDF: Car Configuration: [...]
Success! File saved with extension: .pdf

Running Unit Tests

This project includes JUnit 5 tests to ensure 85%+ code coverage.

Using IDE (IntelliJ/Eclipse)
Right-click the src/test/java folder.
Select "Run 'All Tests'".

Using Command Line (requires JUnit JARs in classpath)
If you are using Maven, run:

mvn test

Test Coverage Highlights
