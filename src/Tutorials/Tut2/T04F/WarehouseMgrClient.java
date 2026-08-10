package Tutorials.Tut2.T04F;

import java.util.ArrayList;

public class WarehouseMgrClient {
    public static void main(String[] args) {
        WarehouseMgr warehouse = new WarehouseMgr("Central Warehouse");

        ArrayList<ShipmentItem> shipments = new ArrayList<>();
        shipments.add(new ShipmentItem("A101", "Table", "Furniture", 50));
        shipments.add(new ShipmentItem("B202", "Rice Cooker", "Appliances", 30));
        warehouse.topUp(shipments);

        System.out.println("After Top-Up:");
        System.out.println(warehouse);

        ArrayList<RequestItem> requests = new ArrayList<>();
        requests.add(new RequestItem("A101", "Table", "Furniture", 20));
        requests.add(new RequestItem("B202", "Rice Cooker", "Appliances", 40));
        warehouse.dispatch(requests);

        System.out.println("\nAfter Dispatch:");
        for (RequestItem item : requests) {
            System.out.println(item);
        }

        System.out.println("\nReplenish List:");
        System.out.println(warehouse.getReplenishList());
    }
}
