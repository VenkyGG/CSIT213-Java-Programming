package Tutorials.Tut4.T01F;

import java.time.LocalDate;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //test1();
        //test2();
        test3();
    }

    public static void test3() {
        PaymentManager mgr = new PaymentManager();
        mgr.load("data/lab_4_data.txt");
        System.out.println(mgr);
        System.out.println(mgr.getTotalAmount());
        System.out.println(mgr.getTotalSubscription());
    }

    public static void test2() {
        ArrayList<Payable> items = new ArrayList<>();

        EquipRental r = new EquipRental("r1",
                                        "desc 1",
                                              LocalDate.of(2025, 11, 25),
                                          50,
                                         50);
        Subscription s = new Subscription("s1",
                                          "name 1",
                                                LocalDate.of(2025, 11, 25),
                                                LocalDate.of(2026, 11, 25), 100);
        PremiumSubscription ps = new PremiumSubscription("ps1",
                                                         "name 1",
                                                               LocalDate.of(2025, 11, 25),
                                                               LocalDate.of(2026, 11, 25),
                                                           100,
                                                         0.1);

        items.add(r);
        items.add(s);
        items.add(ps);

        for (Payable item : items) {
            System.out.println(item.getAmount());
            System.out.println(item);
        }
    }

    public static void test1() {
        EquipRental r = new EquipRental("r1", "desc 1", LocalDate.of(2025, 11, 25), 50, 50);
        System.out.println(r);

        Subscription s = new Subscription("s1", "name 1",
                                            LocalDate.of(2025, 11, 25),
                                            LocalDate.of(2026, 11, 25), 100);

        System.out.println(s);

        PremiumSubscription ps = new PremiumSubscription("ps1", "name 1",
                                            LocalDate.of(2025, 11, 25),
                                            LocalDate.of(2026, 11, 25),
                                            100,
                                            0.1);

        System.out.println(ps);
    }
}
