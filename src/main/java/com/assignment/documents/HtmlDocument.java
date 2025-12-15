package main.java.com.assignment.documents;

public class HtmlDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Web Browser...");
    }

    @Override
    public void save(String content) {
        System.out.println("Wrapping content in tags and saving as HTML: " + content);
    }

    @Override
    public String getExtension() {
        return ".html";
    }
}