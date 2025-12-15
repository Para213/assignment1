package main.java.com.assignment.documents;

public class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening PDF Viewer...");
    }

    @Override
    public void save(String content) {
        System.out.println("Compressing and saving content as PDF: " + content);
    }

    @Override
    public String getExtension() {
        return ".pdf";
    }
}