<<<<<<< HEAD
package Solution;

public class ExcelDocumentFactory extends DocumentFactory {
 
    @Override
    public Document createDocument() {
        System.out.println("[Factory] Creating an Excel Document...");
        return new ExcelDocument();
    }
=======
package Solution;

public class ExcelDocumentFactory extends DocumentFactory {
 
    @Override
    public Document createDocument() {
        System.out.println("[Factory] Creating an Excel Document...");
        return new ExcelDocument();
    }
>>>>>>> 7ded000950ec23bc4e3cc8a2de4589221d493b27
}