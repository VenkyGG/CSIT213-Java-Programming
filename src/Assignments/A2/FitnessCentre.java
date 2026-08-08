package Assignments.A2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

// =====================================
// FitnessCentre.java
// =====================================
public class FitnessCentre {
    //Variables declaration
    private String centreName;
    private String registrationNumber;
    private HashMap<String, ArrayList<FitnessClass>> classes;
    
    // Constructor: initialises the centre with its name and registration number
    public FitnessCentre(String centreName, String registrationNumber) {
        this.centreName = centreName;
        this.registrationNumber = registrationNumber;
        classes = new HashMap<String, ArrayList<FitnessClass>>();
    }

    // Adds a class to the centre, rejecting nulls and duplicate class names (case-insensitive)
    public boolean addClass(FitnessClass c) {
        if (c == null)
            return false;

        // If there is currently no matching existing activityType
        if (classes.get(c.getActivityType()) == null) {
            // Create new arrayList and activityType
            classes.put(c.getActivityType(), new ArrayList<FitnessClass>());
            return classes.get(c.getActivityType()).add(c);
        }

        // If there is matching, dont need to create new one
        // Get the list
        for (FitnessClass lesson : classes.get(c.getActivityType())) {
            // If duplicated class name
            if (c.getClassName().equalsIgnoreCase(lesson.getClassName())) {
                return false;
            }
        }

        // No duplicated found, adding to list
        return classes.get(c.getActivityType()).add(c);
    }

    // Removes a class by name (case-insensitive), searching across all activity types
    public boolean removeClass(String className) {
        if (className == null || className.isEmpty())
            return false;

        Set<String> activities = classes.keySet();

        for (String activity : activities) {
            for (int i = 0; i < classes.get(activity).size(); i++) {
                if (classes.get(activity).get(i).getClassName().equalsIgnoreCase(className)) {
                    classes.get(activity).remove(i);

                    // Remove activity key
                    if (classes.get(activity).isEmpty()) {
                        classes.remove(activity);
                    }

                    return true;
                }
            }
        }

        return false;
    }

    // Returns the full map of classes, grouped by activity type
    public HashMap<String, ArrayList<FitnessClass>> getClasses() {
        // never null; empty map when there are no classes
        return classes;
    }

    // Returns the classes for a given activity type
    public ArrayList<FitnessClass> getClassesByActivity(String activityType) {
        if (classes.get(activityType) == null)
            return new ArrayList<FitnessClass>();
        else
            return classes.get(activityType);
    }

    // Returns the centre's name
    public String getCentreName() { return this.centreName; }

    // Builds a summary string with the centre name and registration number
    @Override
    public String toString() {
        return centreName + " (Reg: " + registrationNumber + ")";
    }
}
