package Tutorials.Tut4.T01F;

import java.time.LocalDate;

public class EquipRental implements Payable {
    private String code;
    private String description;
    private LocalDate dateRented;
    private int qty;
    private double cost;

    public EquipRental(String code, String desc, LocalDate date, int qty, double cost) {
        this.code = code;
        this.description = desc;
        this.dateRented = date;
        this.qty = qty;
        this.cost = cost;
    }
    @Override
    public double getAmount() {
        return qty * cost;
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof EquipRental))
            return false;

        EquipRental tmp = (EquipRental) other;

        return tmp.code.equals(this.code);
    }

    public String toString() {
        return String.format("%s %s $%.2f", code, dateRented, getAmount());
    }
}
