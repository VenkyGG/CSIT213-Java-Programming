package Tutorials.Tut2.T04F;

public class ShipmentItem extends Item {
    private int qty;

    public ShipmentItem(String code, String description, String category, int qty) {
        super(code, description, category);
        this.qty = qty;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public boolean equals(Object item) {
        if (item == null || getClass() != item.getClass()) {
            return false;
        }

        ShipmentItem that = (ShipmentItem) item;
        return super.getCode().equals(that.getCode());
    }

    @Override
    public String toString() {
        String s1 = super.toString() + "\n";
        String s2 = "ShipmentItem{" + "code='" + super.getCode() + '\'' + ", qty=" + qty + '}';
        return s1 + s2;
    }
}
