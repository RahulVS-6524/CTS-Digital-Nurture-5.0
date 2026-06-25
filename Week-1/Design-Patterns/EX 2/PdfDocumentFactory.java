<<<<<<< HEAD
package Solution;

public class PdfDocumentFactory extends DocumentFactory {
 
    @Override
    public Document createDocument() {
        System.out.println("[Factory] Creating a PDF Document...");
        return new PdfDocument();
    }
}
=======
package Solution;

public class PdfDocumentFactory extends DocumentFactory {
 
    @Override
    public Document createDocument() {
        System.out.println("[Factory] Creating a PDF Document...");
        return new PdfDocument();
    }
}
>>>>>>> 7ded000950ec23bc4e3cc8a2de4589221d493b27
 