package Tutorials.Tut2.T04F;

import java.util.ArrayList;
import java.util.HashMap;

public class WarehouseMgr {
    private String name;
    private HashMap<String, Integer> inventory;

    public WarehouseMgr(String name) {
        this.name = name;
        this.inventory = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void topUp(ArrayList<ShipmentItem> items) {
        for (ShipmentItem item : items) {
            String code = item.getCode();
            int currentStock = inventory.getOrDefault(code, 0);
            int newStock = currentStock + item.getQty();
            inventory.put(code, newStock);
        }
    }

    public void dispatch(ArrayList<RequestItem> items) {
        for (RequestItem item : items) {
            int available = inventory.getOrDefault(item.getCode(), 0);
            int toSupply = Math.min(available, item.getQtyRequested());
            item.setQtySupplied(toSupply);
            inventory.put(item.getCode(), available - toSupply);
        }
    }

    public HashMap<String, Integer> getReplenishList() {
        HashMap<String, Integer> replenishList = new HashMap<>();
        for (String code : inventory.keySet()) {
            if (inventory.get(code) <= 0) {
                replenishList.put(code, 0);
            }
        }
        return replenishList;
    }

    @Override
    public String toString() {
        return "WarehouseMgr{" + "name='" + name + '\''
                               + ", inventory=" + inventory + '}';
    }
}
