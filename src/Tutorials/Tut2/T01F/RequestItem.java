package Tutorials.Tut2.T01F;

public class RequestItem {
    private String code;
    private int qtyRequested;
    private int qtySupplied;

    public RequestItem(String code, int qty) {
        this.code = code;
        this.qtyRequested = qty;
    }

    public String getCode() { return this.code; }

    public int getQtyRequested() { return this.qtyRequested; }

    public void setQtySupplied(int qty) {
        if (qty >= 0)
            this.qtySupplied = qty;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null)
            return false;

        if (other instanceof RequestItem) {
            RequestItem temp = (RequestItem) other;

            return code.equalsIgnoreCase(temp.code);
        }

        return false;
    }

    @Override
    public String toString() {
        return String.format("RequestedItem: %s\nQty Requested: %d\nQty Supplied: %d\n------------------------------------------", code, qtyRequested, qtySupplied);
    }
}
