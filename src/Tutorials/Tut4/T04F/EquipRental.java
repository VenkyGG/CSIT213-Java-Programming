package Tutorials.Tut4.T04F;

import java.time.LocalDate;

public class EquipRental implements Payable {
    private String code;
    private String desc;

    private LocalDate dateRented;

    private int qty;
    private double cost;

    public EquipRental(String code, String desc, LocalDate dateRented, int qty, double cost) {
        this.code = code;
        this.desc = desc;
        this.dateRented = dateRented;
        this.qty = qty;
        this.cost = cost;
    }

    @Override
    public double getAmount() {
        return qty * cost;
    }
}
