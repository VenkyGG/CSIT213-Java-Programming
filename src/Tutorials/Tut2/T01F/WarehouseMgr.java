package Tutorials.Tut2.T01F;

import java.util.ArrayList;
import java.util.HashMap;

public class WarehouseMgr {
    private String name;
    private HashMap<String, Integer> inventory;

    public WarehouseMgr(String name) {
        this.name = name;
        this.inventory = new HashMap<String, Integer>();
    }

    public String getName() { return this.name; }

    public void topUp(ArrayList<ShipmentItem> items) {
        for (ShipmentItem item : items) {
            if (item != null) {
                String code = item.getCode();
                int qty = item.getQty();

                if (inventory.containsKey(code)) {
                    int qtyOnHand = inventory.get(code);
                    inventory.put(code, qtyOnHand + qty);
                }
                else {
                    inventory.put(code, qty);
                }
            }
        }
    }

    public void dispatch(ArrayList<RequestItem> items) {
        for (RequestItem item : items) {
            if (item != null) {
                String code = item.getCode();

                if (inventory.containsKey(code)) {
                    int qtyOnHand = inventory.get(code);

                    if (item.getQtyRequested() > qtyOnHand) {
                        item.setQtySupplied(qtyOnHand);
                        inventory.put(code, 0);
                    }
                    else {
                        int newRemainingQty = qtyOnHand - item.getQtyRequested();
                        item.setQtySupplied(item.getQtyRequested());
                        inventory.put(code, newRemainingQty);
                    }
                }
            }
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
        StringBuilder result = new StringBuilder();
        result.append(name + "\t");
        for (String code : inventory.keySet()) {
            int qty = inventory.get(code);
            String codeQty = code + ": " + qty + "\t";
            result.append(codeQty);
        }
        return result.toString();
    }
}
