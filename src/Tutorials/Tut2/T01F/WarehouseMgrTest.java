package Tutorials.Tut2.T01F;

import java.util.ArrayList;
import java.util.HashMap;

public class WarehouseMgrTest {
    public static void main(String[] args) {
        //testItem();
        //testArrayList();
        //testHashMap();
        testMgr();
    }

    public static void testMgr() {
        WarehouseMgr mgr = new WarehouseMgr("Changi");
        System.out.println(mgr);

        ArrayList<ShipmentItem> sItems = new ArrayList<>();
        sItems.add(new ShipmentItem("p1", 100));
        sItems.add(new ShipmentItem("p2", 200));
        sItems.add(new ShipmentItem("p3", 300));

        // Topup

        mgr.topUp(sItems);

        System.out.println(mgr);

        ArrayList<ShipmentItem> sItems2 = new ArrayList<>();
        sItems2.add(new ShipmentItem("p2", 200));

        mgr.topUp(sItems2);

        System.out.println(mgr);

        // Dispatch

        ArrayList<RequestItem> rItems = new ArrayList<>();
        rItems.add(new RequestItem("p1", 90));
        rItems.add(new RequestItem("p2", 500));
        mgr.dispatch(rItems);

        System.out.println(mgr);

        for (RequestItem i : rItems) {
            System.out.println(i);
        }
    }

    public static void testHashMap() {
        HashMap<String, Integer> inventory = new HashMap<>();
        inventory.put("p1", 100);
        inventory.put("p2", 200);
        inventory.put("p3", 300);
        inventory.put("p1", -100);

        for (String code : inventory.keySet()) {
            System.out.println(code + " " + inventory.get(code));
        }
    }

    public static void testArrayList() {
        ArrayList<ShipmentItem> sItems = new ArrayList<>();
        System.out.println(sItems.size());
        sItems.add(new ShipmentItem("p1", 100));
        sItems.add(new ShipmentItem("p2", 200));
        sItems.add(new ShipmentItem("p3", 300));
        System.out.println(sItems.size());

        for (ShipmentItem item : sItems) {
            System.out.println(item);
        }

        for (int i = 0; i < sItems.size(); i++) {
            System.out.println(sItems.get(i));
        }
    }

    public static void testItem() {
        // ShipmentItem
        ShipmentItem sItem1 = new ShipmentItem("p1", 100);
        ShipmentItem sItem2 = new ShipmentItem("p2", 200);
        ShipmentItem sItem3 = new ShipmentItem("p3", 300);
        ShipmentItem sItem4 = new ShipmentItem("p3", 300);

        System.out.println(sItem1);
        System.out.println(sItem2);
        System.out.println(sItem3);
        System.out.println(sItem3.equals(sItem4));

        // RequestItem
        RequestItem rItem1 = new RequestItem("p1", 90);
        RequestItem rItem2 = new RequestItem("p2", 500);
        RequestItem rItem3 = new RequestItem("p2", 500);

        System.out.println(rItem1);
        System.out.println(rItem2);
        System.out.println(rItem2.equals(rItem3));
    }
}