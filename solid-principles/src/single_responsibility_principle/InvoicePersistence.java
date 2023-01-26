package single_responsibility_principle;

public class InvoicePersistence {

    private Invoice invoice;

    public InvoicePersistence(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToFile(String filename) {
        // Creates a file with given name and writes the invoice
        System.out.println("File");
    }
}
