package open_closed_principle;

public class InvoicePrinter implements InvoicePersistence{
    private Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    @Override
    public void saveToFile(String filename) {

    }

    @Override
    public void print() {
        System.out.println(invoice.quantity + "x " + invoice.book.name + " " + invoice.book.bookPrice + " $");
        System.out.println("Discount Rate: " + invoice.discountRate);
        System.out.println("Tax Rate: " + invoice.taxRate);
        System.out.println("Total: " + invoice.total + " $");
    }
}
