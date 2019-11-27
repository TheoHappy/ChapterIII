package InvoiceClass;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("A51124","Electricity",5,10);
        System.out.println(invoice.getInvoiceAmount());

        Invoice invoice2 = new Invoice("A51324","Electricity",-2,10);
        System.out.println(invoice2.getInvoiceAmount());

        Invoice invoice3 = new Invoice("A21324","Electricity",20,-5);
        System.out.println(invoice3.getInvoiceAmount());
    }
}
