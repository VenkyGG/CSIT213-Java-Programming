package Tutorials.Tut1.T04F;

public class TestStoreInventory {
    public static void main(String[] args) {
        // Create a store inventory for a branch
        StoreInventory inventory = new StoreInventory("Bukit Timah");

        // Create some store items
        StoreItem item1 = new StoreItem("A001", "Apple", 0.50, 100);
        StoreItem item2 = new StoreItem("B002", "Banana", 0.30, 150);
        StoreItem item3 = new StoreItem("C003", "Carrot", 0.20, 200);

        // Add items to inventory
        inventory.addItem(item1);
        inventory.addItem(item2);
        inventory.addItem(item3);

        // Display inventory
        System.out.println("Initial Inventory:");
        System.out.println(inventory);

        // Delete an item
        boolean deleted = inventory.delItem("B002");
        System.out.println("Deleted item B002: " + deleted);

        // Display inventory after deletion
        System.out.println("Inventory After Deletion:");
        System.out.println(inventory);
    }
}
