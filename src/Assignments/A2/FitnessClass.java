package Assignments.A2;

import java.util.ArrayList;

// =====================================
// FitnessClass.java
// =====================================
public class FitnessClass {
   	// Variables Declaration
    private String className;
    private String activityType;
    private int durationMinutes;
    private ArrayList<Member> participants;
    public static int maxParticipants = 2;
   	
    // Constructor: initialises a class with its name, activity type, and duration
    public FitnessClass(String className, String activityType, int durationMinutes) {
        this.className = className;
        this.activityType = activityType;
        this.durationMinutes = durationMinutes;
        participants = new ArrayList<Member>();
    }

    // Enrols a member into the class, rejecting nulls, duplicate NRICs, and enrolment past capacity
    public boolean enrolMember(Member m) {
        if (m == null || participants.size() >= maxParticipants)
            return false;

        for (Member participant : participants) {
            if (participant.getNRIC().equalsIgnoreCase(m.getNRIC()))
                return false;
        }

        return participants.add(m);
    }

    // Removes a member from the class by NRIC (case-insensitive match)
    public boolean removeMember(String nric) {
        if (nric == null || nric.isEmpty())
            return false;

        for (Member m : participants) {
            if (m.getNRIC().equalsIgnoreCase(nric)) {
                return participants.remove(m);
            }
        }

        return false;
    }

    // Returns the class name
    public String getClassName() { return this.className; }

    // Returns the activity type of the class
    public String getActivityType() { return this.activityType; }

    // Returns the list of enrolled participants
    public ArrayList<Member> getParticipants() {
        return participants;
        // never null; empty list when no one is enrolled
    }

    // Builds a summary string with name, activity, duration, and enrolment count
    @Override
    public String toString() {
        return className + " | " + activityType + " | " + durationMinutes + " mins | "
                + participants.size() + "/" + maxParticipants + " enrolled";
    }
}
