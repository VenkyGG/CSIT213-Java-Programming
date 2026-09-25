package ExamPrac.Q1;

public class Parcel {
    private static final double FIRST_KG = 3.0;
    private static final double SUB_KG = 0.85;
    private static double WEIGHT_FACTOR = 6000;

    private String id;
    private double length, width, height;
    private double weight;

    private String address;
    private String status;

    public Parcel(String id, String address, double length, double width, double height, double weight, String status) {
        this.id = id;
        this.address = address;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getCalculatedWeight() {
        double volume = length * width * height;
        double volumetricWeight = volume / WEIGHT_FACTOR;

        return volumetricWeight;
    }

    public double getFee() {
        double volumetricWeight = getCalculatedWeight();

        if (volumetricWeight > 0) {
            if (volumetricWeight - 1.0 > 0) {
                // Has subsequent weight
                return FIRST_KG + (Math.ceil(volumetricWeight - 1.0) * SUB_KG);
            }
            else {
                return FIRST_KG;
            }
        }

        return FIRST_KG;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Parcel))
            return false;

        Parcel tmp = (Parcel) other;

        return tmp.id.equalsIgnoreCase(id);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(  "[" + getClass().getSimpleName().toUpperCase() + " " +
                        "ID: " + id +
                        ", Address: " + address +
                        ", Weight: " + weight + "kg" +
                        ", Volumetric Weight: " + getCalculatedWeight() + "kg" +
                        ", Fee: $" + getFee() + "]");

        return result.toString();
    }
}
