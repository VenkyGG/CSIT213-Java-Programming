package Lectures.Lec6;

/**
 * Instance variables: name, hours, hourlyFee
 * One additional factor to consider: EquipFee per hours
 * TeachingFee - same calculation
 * FacilityFee - must include EquipFee * hour
 */
public class LabLesson extends Lesson {
    private double equipFee;

    public LabLesson(String name, int hours, double hourlyFee, double equipFee) {
        super(name, hours, hourlyFee);
        this.equipFee = equipFee;
    }

    @Override
    public double getFacilityFee() {
        System.out.println("LabLesson.getFacilityFee");
        return  getHours() * equipFee + super.getFacilityFee();
    }
}
