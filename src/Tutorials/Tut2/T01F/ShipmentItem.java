package Tutorials.Tut2.T01F;

public class ShipmentItem {
    private String code;
    private int qty;

    public ShipmentItem(String code, int qty) {
        this.code = code;
        this.qty = qty;
    }

    public String getCode() { return this.code; }

    public int getQty() { return this.qty; }

    public void setQty(int newQty) { this.qty = newQty; }

    @Override
    public boolean equals(Object other) {
        if (other == null)
            return false;

        if (other instanceof ShipmentItem)
        {
            // Casting
            ShipmentItem temp = (ShipmentItem) other;

            return this.code.equalsIgnoreCase(temp.code);
        }

        return false;
    }

    @Override
    public String toString()
    {
        return String.format("ShipmentItem: %s\nQty: %d\n------------------------------------------", code, qty);
    }
}