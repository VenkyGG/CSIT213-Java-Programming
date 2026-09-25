package ExamPrac.ChatGPT.Prac2;

public class Motorcycle extends Vehicle {
    public double dailyRate;

    public Motorcycle(String vehicleId, String brand, double dailyRate) {
        super(vehicleId, brand);
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateRentalCost(int days) throws InvalidRentalDaysException {
        if (days <= 0 || days > 30)
            throw new InvalidRentalDaysException("Rental days must be between 1 and 30.");

        return dailyRate * days;
    }

    @Override
    public String getVehicleType() {
        return "Motorcycle";
    }
}
