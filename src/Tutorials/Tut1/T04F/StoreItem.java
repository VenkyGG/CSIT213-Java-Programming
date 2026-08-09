package Tutorials.Tut1.T04F;

public class StoreItem {
    private String id;
    private String name;
    private double price;
    private int qty;

    public StoreItem(String prodId, String name, double unitPrice, int qtyOnHand) {
        this.id = prodId;
        this.name = name;
        this.price = unitPrice;
        this.qty = qtyOnHand;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQty() {
        return this.qty;
    }

    public void setQty(int qtyOnHand) {
        this.qty = qtyOnHand;
    }

    // Method overload
    // Method with the same name but different input parameters
    public boolean equals(String id) {
        return this.id.equals(id);
    }

    // Method overload
    // Method with the same name but different input parameters
    public boolean equals(Object item) {
        if (item instanceof StoreItem) {
            StoreItem other = (StoreItem) item;
            return this.id.equals(other.id);
        }

        return false;
    }

    public String toString() {
        return String.format("ID: %s, Name: %s, Price: $%.2f, Quantity: %d", id, name, price, qty);
    }
}
