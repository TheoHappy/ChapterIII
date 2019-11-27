package InvoiceClass;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int itemQuantity;
    private double price;

    public Invoice(String partNumber, String partDescription, int itemQuantity, double price) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.itemQuantity = itemQuantity;
        this.price = price;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getInvoiceAmount() {
        if (getItemQuantity() < 0) {
            setItemQuantity(0);
        }
        else if (getPrice() < 0) {
            setPrice(0.0);
        }
        return getItemQuantity() * getPrice();
    }
}
