package main.java.com.assignment.documents;

public class DocumentFactory {

    // This allows new formats to be added easily by extending this method
    // or using a registration map for Open/Closed principle strictness.
    public static Document createDocument(String type) {
        if (type == null) {
            throw new IllegalArgumentException("Document type cannot be null");
        }

        switch (type.toLowerCase()) {
            case "pdf":
                return new PdfDocument();
            case "word":
                return new WordDocument();
            case "html":
                return new HtmlDocument();
            default:
                throw new IllegalArgumentException("Unknown document type: " + type);
        }
    }
}