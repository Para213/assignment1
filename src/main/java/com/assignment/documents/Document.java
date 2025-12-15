package main.java.com.assignment.documents;

public interface Document {
    void open();
    void save(String content);
    String getExtension();
}