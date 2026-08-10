package Tutorials.Tut2.T04F;

public class RequestItem extends Item {
    private int qtyRequested;
    private int qtySupplied;

    public RequestItem(String code, String description, String category, int qtyRequested) {
        super(code, description, category);
        this.qtyRequested = qtyRequested;
        this.qtySupplied = 0;
    }

    public int getQtyRequested() {
        return qtyRequested;
    }

    public void setQtySupplied(int qty) {
        this.qtySupplied = qty;
    }

    @Override
    public boolean equals(Object item) {
        if (item == null || getClass() != item.getClass())
            return false;

        RequestItem that = (RequestItem) item;
        return super.getCode().equals(that.getCode());
    }

    @Override
    public String toString() {
        String s1 = super.toString() + "\n";
        String s2 = "RequestItem{" + "code='" + super.getCode() + '\''
                                   + ", qtyRequested=" + qtyRequested
                                   + ", qtySupplied=" + qtySupplied + '}';
        return s1 + s2;
    }
}
