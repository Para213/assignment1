package main.java.com.assignment.documents;

public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Word Processor...");
    }

    @Override
    public void save(String content) {
        System.out.println("Formatting text and saving as Word doc: " + content);
    }

    @Override
    public String getExtension() {
        return ".docx";
    }
}