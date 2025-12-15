package test.java.com.assignment;

import main.java.com.assignment.documents.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DocumentTest {

    @Test
    public void testPdfCreation() {
        Document doc = DocumentFactory.createDocument("pdf");
        assertTrue(doc instanceof PdfDocument);
        assertEquals(".pdf", doc.getExtension());
    }

    @Test
    public void testWordCreation() {
        Document doc = DocumentFactory.createDocument("word");
        assertTrue(doc instanceof WordDocument);
        assertEquals(".docx", doc.getExtension());
    }

    @Test
    public void testInvalidDocumentType() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            DocumentFactory.createDocument("txt");
        });
        assertTrue(exception.getMessage().contains("Unknown document type"));
    }
}