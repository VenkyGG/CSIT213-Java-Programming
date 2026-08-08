package Assignments.A2;

import java.util.ArrayList;
import java.util.HashMap;

// =====================================
// FitnessCouncil.java
// =====================================
public class FitnessCouncil {
    // Variables Declaration
    private ArrayList<FitnessCentre> centres = new ArrayList<FitnessCentre>();

    // =========================
    // Register Centre
    // =========================
    // Registers a new centre, rejecting nulls and duplicate centre names (case-insensitive)
    public boolean registerCentre(FitnessCentre c) {
        if (c == null)
            return false;

        for (FitnessCentre fc : centres) {
            if (fc.getCentreName().equalsIgnoreCase(c.getCentreName())) {
                return false;
            }
        }

        return centres.add(c);
    }

    // =========================
    // Get All Centres
    // =========================
    // Returns all registered centres
    public ArrayList<FitnessCentre> getCentres() {
        // empty list if none registered
        return this.centres;
    }

    // =========================
    // Get All Class Names (across all centres; duplicates kept)
    // =========================
    // Collects every class name across all centres, keeping duplicates
    public ArrayList<String> getAllClassNames() {
        ArrayList<String> className = new ArrayList<String >();

        for (FitnessCentre fc : centres) {
            for (String classes : fc.getClasses().keySet()) {
                for (int i = 0; i < fc.getClasses().get(classes).size(); i++) {
                    className.add(fc.getClasses().get(classes).get(i).getClassName());
                }
            }
        }

        return className;
    }

    // =========================
    // Get Class Names by Centre (case-insensitive lookup)
    // =========================
    // Returns all class names for the centre matching the given name (case-insensitive)
    public ArrayList<String> getClassesByCentre(String centreName) {
        ArrayList<String> result = new ArrayList<String>();

        for (FitnessCentre c : centres) {
            if (c.getCentreName().equalsIgnoreCase(centreName)) {
                for (String activityType : c.getClasses().keySet()) {
                    for (FitnessClass fc : c.getClasses().get(activityType)) {
                        result.add(fc.getClassName());
                    }
                }
            }
        }

        // centre not found -> empty list
        return result;
    }

    // =========================
    // Get Activity Map by Centre
    // =========================
    // Returns the activity-to-classes map for the centre matching the given name
    public HashMap<String, ArrayList<FitnessClass>> getActivitiesByCentre(String centreName) {
        HashMap<String, ArrayList<FitnessClass>> result = new HashMap<String, ArrayList<FitnessClass>>();

        for (FitnessCentre centre : centres) {
            if (centre.getCentreName().equalsIgnoreCase(centreName)) {
                result = centre.getClasses();
            }
        }

        // centre not found -> empty list
        return result;
    }

    // =========================
    // Get Class Names by Activity (across all centres; NO duplicates)
    // =========================
    // Collects unique class names for a given activity type across all centres
    public ArrayList<String> getClassesByActivity(String activityType) {
        ArrayList<String> result = new ArrayList<String>();

        for (FitnessCentre centre : centres) {
            for (FitnessClass fc : centre.getClassesByActivity(activityType)) {
                if (!result.contains(fc.getClassName()))
                    result.add(fc.getClassName());
            }
        }

        return result;
    }
}
