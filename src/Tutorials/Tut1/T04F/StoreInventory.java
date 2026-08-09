package Tutorials.Tut1.T04F;

public class StoreInventory {
    private static final int MAX_ITEM = 100;
    private String branch;
    private StoreItem[] items;
    private int itemIndex;

    public StoreInventory(String bName) {
        this.branch = bName;
        this.items = new StoreItem[MAX_ITEM];
        this.itemIndex = 0;
    }

    public String getBranch() {
        return branch;
    }

    public boolean addItem(StoreItem anItem) {
        // Check if there is anymore space in items array
        if (itemIndex < MAX_ITEM) {
            // Insert new item to the last available space
            // At the same time increment itemIndex for the next add operation
            items[itemIndex++] = anItem;
            return true;
        }

        return false;
    }

    public boolean delItem(String itemId) {
        for (int i = 0; i < itemIndex; i++) {
            if (items[i].equals(itemId)) {
                // Replace with last item
                items[i] = items[itemIndex - 1];
                // Set the last item to null
                items[itemIndex - 1] = null;
                // Reduce the item index so that we know there are one more space
                // in item array
                itemIndex--;

                return true;
            }
        }

        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Branch: " + branch + "\nItems:\n");
        for (int i = 0; i < itemIndex; i++) {
            sb.append(items[i].toString()).append("\n");
        }

        return sb.toString();
    }
}
