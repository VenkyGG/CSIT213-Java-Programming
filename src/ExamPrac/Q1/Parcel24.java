package ExamPrac.Q1;

public class Parcel24 extends Parcel {
    private static final double RATE = 0.1;

    public Parcel24(String id, String address, double length, double width, double height, double weight, String status) {
        super(id, address, length, width, height, weight, status);
    }

    public double getSurcharge() {
        return super.getFee() * RATE;
    }

    @Override
    public double getFee() {
        return super.getFee() + getSurcharge();
    }
}
