package ExamPrac.ChatGPT.Prac2;

import java.util.ArrayList;

public abstract class Vehicle {
    public String vehicleId;
    public String brand;

    public Vehicle(String vehicleId, String brand) {
        this.vehicleId = vehicleId;
        this.brand = brand;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getBrand() {
        return brand;
    }

    public abstract double calculateRentalCost(int days) throws InvalidRentalDaysException;

    public abstract String getVehicleType();

    public static void main(String[] args) {
        Car c1 = new Car("V001", "BMW", 120);
        Motorcycle m1 = new Motorcycle("V002", "Yamaha", 50);

        ArrayList<Vehicle> vList = new ArrayList<>();
        vList.add(c1);
        vList.add(m1);

        try {
            for (Vehicle v : vList) {
                StringBuilder sb = new StringBuilder();
                sb.append(v.getBrand() + " (" + v.getClass().getSimpleName() + "): $");
                sb.append(v.calculateRentalCost(3) + "\n");

                if (v instanceof Car) {
                    Car c = (Car) v;
                    sb.append("Insurance: $" + c.calculateInsurance(3));
                }

                System.out.println(sb.toString());
                System.out.println();
            }
        }
        catch(InvalidRentalDaysException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
