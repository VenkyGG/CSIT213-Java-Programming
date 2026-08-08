package Assignments.A2;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentAssertionTest2 {

    public static void main(String[] args) {

        if (!testAssertionEnabled()) {
            return;
        }

        testPerson();
        testMember();
        testFitnessClass();
        testFitnessCentre();
        testFitnessCouncil();
        stressTestFitnessClass();
        stressTestFitnessCentre();
        stressTestFitnessCouncil();

        System.out.println();
        System.out.println("========================================");
        System.out.println("ALL ASSERTION TESTS PASSED SUCCESSFULLY");
        System.out.println("========================================");
    }

    // =========================================================
    // Check whether assertions are enabled
    // =========================================================
    private static boolean testAssertionEnabled() {
        boolean assertionsEnabled = false;

        assert assertionsEnabled = true;

        if (!assertionsEnabled) {
            System.out.println(
                    "Assertions are disabled. Run the program using -ea."
            );
            return false;
        }

        System.out.println("Assertions are enabled.");
        return true;
    }

    // =========================================================
    // Person tests
    // =========================================================
    public static void testPerson() {
        Person person = new Person(
                "Alice Tan",
                "S1234567A",
                "Female",
                "1999-05-12"
        );

        assert person.getName().equals("Alice Tan")
                : "Person name is incorrect";

        assert person.getNRIC().equals("S1234567A")
                : "Person NRIC is incorrect";

        assert person.getGender().equals("Female")
                : "Person gender is incorrect";

        assert person.getDateOfBirth().equals("1999-05-12")
                : "Person date of birth is incorrect";

        String expected =
                "Alice Tan (S1234567A), Female, DOB: 1999-05-12";

        assert person.toString().equals(expected)
                : "Person toString() is incorrect";

        // Boundary-style values
        Person person2 = new Person("", "", "", "");

        assert person2.getName().equals("")
                : "Empty name was not stored correctly";

        assert person2.getNRIC().equals("")
                : "Empty NRIC was not stored correctly";

        assert person2.toString().equals(" (), , DOB: ")
                : "Person toString() failed for empty strings";

        System.out.println("Person tests passed.");
    }

    // =========================================================
    // Member tests
    // =========================================================
    public static void testMember() {
        Member member = new Member(
                "Bob Lim",
                "S7654321B",
                "Male",
                "1998-02-01",
                "Premium",
                "Yoga"
        );

        // Inherited Person methods
        assert member.getName().equals("Bob Lim")
                : "Member inherited name is incorrect";

        assert member.getNRIC().equals("S7654321B")
                : "Member inherited NRIC is incorrect";

        assert member.getGender().equals("Male")
                : "Member inherited gender is incorrect";

        assert member.getDateOfBirth().equals("1998-02-01")
                : "Member inherited date of birth is incorrect";

        // Member methods
        assert member.getMembershipTier().equals("Premium")
                : "Membership tier is incorrect";

        assert member.getPreferredActivity().equals("Yoga")
                : "Preferred activity is incorrect";

        String expected =
                "Bob Lim (S7654321B), Male, DOB: 1998-02-01"
                        + ", Tier: Premium, Prefers: Yoga";

        assert member.toString().equals(expected)
                : "Member toString() is incorrect";

        // Check that Member really is a Person
        assert member instanceof Person
                : "Member should inherit from Person";

        System.out.println("Member tests passed.");
    }

    // =========================================================
    // FitnessClass tests
    // =========================================================
    public static void testFitnessClass() {
        FitnessClass.maxParticipants = 2;

        FitnessClass fitnessClass =
                new FitnessClass("Sunrise Yoga", "Yoga", 60);

        Member member1 = createMember(
                "Alice", "S1111111A", "Yoga"
        );

        Member member2 = createMember(
                "Bob", "S2222222B", "Spin"
        );

        Member member3 = createMember(
                "Carol", "S3333333C", "HIIT"
        );

        Member duplicateNRIC = createMember(
                "Different Person", "s1111111a", "Swimming"
        );

        // Constructor and accessors
        assert fitnessClass.getClassName().equals("Sunrise Yoga")
                : "FitnessClass className is incorrect";

        assert fitnessClass.getActivityType().equals("Yoga")
                : "FitnessClass activityType is incorrect";

        assert fitnessClass.getParticipants() != null
                : "getParticipants() must never return null";

        assert fitnessClass.getParticipants().isEmpty()
                : "New FitnessClass should have no participants";

        assert fitnessClass.toString().equals(
                "Sunrise Yoga | Yoga | 60 mins | 0/2 enrolled"
        ) : "Initial FitnessClass toString() is incorrect";

        // Negative: null member
        assert !fitnessClass.enrolMember(null)
                : "Null member should not be enrolled";

        assert fitnessClass.getParticipants().isEmpty()
                : "Null enrolment changed participant list";

        // Positive: first enrolment
        assert fitnessClass.enrolMember(member1)
                : "First member should be enrolled";

        assert fitnessClass.getParticipants().size() == 1
                : "Participant count should be 1";

        // Negative: same object
        assert !fitnessClass.enrolMember(member1)
                : "Same member should not be enrolled twice";

        // Negative: different object but same NRIC
        assert !fitnessClass.enrolMember(duplicateNRIC)
                : "Member with duplicate NRIC should be rejected";

        assert fitnessClass.getParticipants().size() == 1
                : "Duplicate NRIC changed participant count";

        // Positive: fill remaining slot
        assert fitnessClass.enrolMember(member2)
                : "Second member should be enrolled";

        assert fitnessClass.getParticipants().size() == 2
                : "Class should now contain 2 participants";

        // Boundary: class at maximum capacity
        assert !fitnessClass.enrolMember(member3)
                : "Class should reject enrolment when full";

        assert fitnessClass.getParticipants().size()
                == FitnessClass.maxParticipants
                : "Participant count exceeded maximum capacity";

        assert fitnessClass.toString().equals(
                "Sunrise Yoga | Yoga | 60 mins | 2/2 enrolled"
        ) : "Full class toString() is incorrect";

        // Negative removal cases
        assert !fitnessClass.removeMember(null)
                : "removeMember(null) should return false";

        assert !fitnessClass.removeMember("")
                : "removeMember(\"\") should return false";

        assert !fitnessClass.removeMember("S9999999Z")
                : "Removing unknown NRIC should return false";

        // Positive: case-insensitive removal
        assert fitnessClass.removeMember("s1111111a")
                : "NRIC removal should be case-insensitive";

        assert fitnessClass.getParticipants().size() == 1
                : "Participant count should be 1 after removal";

        assert !fitnessClass.removeMember("S1111111A")
                : "Already removed member should not be removed again";

        // Slot should become available
        assert fitnessClass.enrolMember(member3)
                : "New member should enrol after a slot is freed";

        assert fitnessClass.getParticipants().size() == 2
                : "Participant count should return to 2";

        // Remove remaining members
        assert fitnessClass.removeMember("S2222222B")
                : "Second member removal failed";

        assert fitnessClass.removeMember("S3333333C")
                : "Third member removal failed";

        assert fitnessClass.getParticipants().isEmpty()
                : "Participant list should be empty";

        System.out.println("FitnessClass tests passed.");
    }

    // =========================================================
    // FitnessCentre tests
    // =========================================================
    public static void testFitnessCentre() {
        FitnessCentre centre =
                new FitnessCentre("IronWorks", "FC-2026-001");

        assert centre.getCentreName().equals("IronWorks")
                : "Centre name is incorrect";

        assert centre.toString().equals(
                "IronWorks (Reg: FC-2026-001)"
        ) : "FitnessCentre toString() is incorrect";

        assert centre.getClasses() != null
                : "getClasses() must never return null";

        assert centre.getClasses().isEmpty()
                : "New centre should have no classes";

        // Negative null class
        assert !centre.addClass(null)
                : "Null FitnessClass should not be added";

        FitnessClass yoga1 =
                new FitnessClass("Sunrise Yoga", "Yoga", 60);

        FitnessClass yoga2 =
                new FitnessClass("Evening Yoga", "Yoga", 45);

        FitnessClass spin1 =
                new FitnessClass("Spin Express", "Spin", 30);

        FitnessClass duplicateYogaName =
                new FitnessClass("sunrise yoga", "Yoga", 90);

        // Positive first activity
        assert centre.addClass(yoga1)
                : "First Yoga class should be added";

        assert centre.getClasses().size() == 1
                : "Centre should contain one activity type";

        assert centre.getClasses().containsKey("Yoga")
                : "Yoga key should exist";

        // Positive same activity, different class name
        assert centre.addClass(yoga2)
                : "Second distinct Yoga class should be added";

        assert centre.getClassesByActivity("Yoga").size() == 2
                : "Yoga should contain 2 classes";

        // Negative duplicate class name under same activity
        assert !centre.addClass(duplicateYogaName)
                : "Duplicate class name should be rejected";

        assert centre.getClassesByActivity("Yoga").size() == 2
                : "Duplicate attempt changed class count";

        // Positive different activity
        assert centre.addClass(spin1)
                : "Spin class should be added";

        assert centre.getClasses().size() == 2
                : "Centre should contain Yoga and Spin";

        // Unknown activity
        ArrayList<FitnessClass> unknown =
                centre.getClassesByActivity("Swimming");

        assert unknown != null
                : "Unknown activity must not return null";

        assert unknown.isEmpty()
                : "Unknown activity should return an empty list";

        // Invalid removals
        assert !centre.removeClass(null)
                : "removeClass(null) should return false";

        assert !centre.removeClass("")
                : "removeClass(\"\") should return false";

        assert !centre.removeClass("Unknown Class")
                : "Unknown class removal should return false";

        // Case-insensitive successful removal
        assert centre.removeClass("SUNRISE YOGA")
                : "Class removal should be case-insensitive";

        assert centre.getClassesByActivity("Yoga").size() == 1
                : "Yoga should contain one class after removal";

        // Remove only Spin class: Spin key must disappear
        assert centre.removeClass("spin express")
                : "Spin class removal failed";

        assert !centre.getClasses().containsKey("Spin")
                : "Empty Spin key should be removed";

        // Remove final Yoga class
        assert centre.removeClass("Evening Yoga")
                : "Final Yoga removal failed";

        assert !centre.getClasses().containsKey("Yoga")
                : "Empty Yoga key should be removed";

        assert centre.getClasses().isEmpty()
                : "Centre should contain no classes";

        System.out.println("FitnessCentre tests passed.");
    }

    // =========================================================
    // FitnessCouncil tests
    // =========================================================
    public static void testFitnessCouncil() {
        FitnessCouncil council = new FitnessCouncil();

        assert council.getCentres() != null
                : "getCentres() must never return null";

        assert council.getCentres().isEmpty()
                : "New council should contain no centres";

        assert council.getAllClassNames() != null
                : "getAllClassNames() must never return null";

        assert council.getAllClassNames().isEmpty()
                : "New council should contain no class names";

        // Required negative case
        assert !council.registerCentre(null)
                : "Null centre should not be registered";

        FitnessCentre centre1 =
                new FitnessCentre("IronWorks", "FC-001");

        FitnessCentre centre2 =
                new FitnessCentre("ZenFlow", "FC-002");

        FitnessCentre duplicateName =
                new FitnessCentre("ironworks", "FC-999");

        centre1.addClass(
                new FitnessClass("Sunrise Yoga", "Yoga", 60)
        );

        centre1.addClass(
                new FitnessClass("Spin Express", "Spin", 30)
        );

        centre2.addClass(
                new FitnessClass("Sunrise Yoga", "Yoga", 45)
        );

        centre2.addClass(
                new FitnessClass("Moonlight Yoga", "Yoga", 75)
        );

        centre2.addClass(
                new FitnessClass("HIIT Blast", "HIIT", 40)
        );

        // Positive registrations
        assert council.registerCentre(centre1)
                : "First centre registration failed";

        assert council.registerCentre(centre2)
                : "Second centre registration failed";

        assert council.getCentres().size() == 2
                : "Council should contain 2 centres";

        // Negative duplicate name, case-insensitive
        assert !council.registerCentre(duplicateName)
                : "Duplicate centre name should be rejected";

        assert council.getCentres().size() == 2
                : "Duplicate registration changed centre count";

        // All class names retain duplicates across centres
        ArrayList<String> allNames =
                council.getAllClassNames();

        assert allNames.size() == 5
                : "Expected 5 total class-name occurrences";

        int sunriseCount = countOccurrences(
                allNames,
                "Sunrise Yoga"
        );

        assert sunriseCount == 2
                : "Duplicate names across centres must be retained";

        // Centre lookup
        ArrayList<String> ironWorksClasses =
                council.getClassesByCentre("IRONWORKS");

        assert ironWorksClasses.size() == 2
                : "IronWorks should contain 2 classes";

        assert ironWorksClasses.contains("Sunrise Yoga")
                : "IronWorks missing Sunrise Yoga";

        assert ironWorksClasses.contains("Spin Express")
                : "IronWorks missing Spin Express";

        // Unknown centre
        assert council.getClassesByCentre(
                "Unknown Centre"
        ).isEmpty()
                : "Unknown centre should return an empty list";

        // Activity map
        HashMap<String, ArrayList<FitnessClass>> activities =
                council.getActivitiesByCentre("zenflow");

        assert activities != null
                : "Activity map must never be null";

        assert activities.size() == 2
                : "ZenFlow should contain Yoga and HIIT";

        assert activities.get("Yoga").size() == 2
                : "ZenFlow should contain 2 Yoga classes";

        // Unknown centre activity map
        HashMap<String, ArrayList<FitnessClass>> unknownMap =
                council.getActivitiesByCentre("Missing Centre");

        assert unknownMap != null
                : "Unknown centre must return a non-null map";

        assert unknownMap.isEmpty()
                : "Unknown centre should return an empty map";

        // Classes by activity should remove duplicate names
        ArrayList<String> yogaClasses =
                council.getClassesByActivity("Yoga");

        assert yogaClasses.size() == 2
                : "Yoga results should contain 2 unique names";

        assert yogaClasses.contains("Sunrise Yoga")
                : "Yoga results missing Sunrise Yoga";

        assert yogaClasses.contains("Moonlight Yoga")
                : "Yoga results missing Moonlight Yoga";

        assert countOccurrences(
                yogaClasses,
                "Sunrise Yoga"
        ) == 1
                : "Duplicate Sunrise Yoga should be removed";

        // Unknown activity
        assert council.getClassesByActivity(
                "Swimming"
        ).isEmpty()
                : "Unknown activity should return an empty list";

        System.out.println("FitnessCouncil tests passed.");
    }

    // =========================================================
    // High-volume FitnessClass stress test
    // =========================================================
    public static void stressTestFitnessClass() {
        int originalMaximum = FitnessClass.maxParticipants;
        FitnessClass.maxParticipants = 100;

        FitnessClass largeClass =
                new FitnessClass("Large Class", "HIIT", 90);

        // Add exactly 100 unique members
        for (int i = 0; i < 100; i++) {
            Member member = createMember(
                    "Member " + i,
                    "NRIC" + i,
                    "HIIT"
            );

            assert largeClass.enrolMember(member)
                    : "Failed to enrol member " + i;
        }

        assert largeClass.getParticipants().size() == 100
                : "Large class should contain exactly 100 members";

        // 101st member must be rejected
        Member extraMember = createMember(
                "Extra Member",
                "EXTRA001",
                "HIIT"
        );

        assert !largeClass.enrolMember(extraMember)
                : "Class accepted member beyond capacity";

        // Remove every even-numbered member
        for (int i = 0; i < 100; i += 2) {
            assert largeClass.removeMember("nric" + i)
                    : "Failed to remove NRIC" + i;
        }

        assert largeClass.getParticipants().size() == 50
                : "Expected 50 members after mass removal";

        // Removed members should no longer be found
        for (int i = 0; i < 100; i += 2) {
            assert !largeClass.removeMember("NRIC" + i)
                    : "Removed member was removed twice";
        }

        FitnessClass.maxParticipants = originalMaximum;

        System.out.println("FitnessClass stress test passed.");
    }

    // =========================================================
    // High-volume FitnessCentre stress test
    // =========================================================
    public static void stressTestFitnessCentre() {
        FitnessCentre centre =
                new FitnessCentre("Mega Fitness", "FC-MEGA");

        int activityCount = 10;
        int classesPerActivity = 20;

        // Add 200 classes: 10 activities × 20 classes
        for (int activity = 0;
             activity < activityCount;
             activity++) {

            for (int classNumber = 0;
                 classNumber < classesPerActivity;
                 classNumber++) {

                FitnessClass fitnessClass =
                        new FitnessClass(
                                "Class-" + activity + "-" + classNumber,
                                "Activity-" + activity,
                                30 + classNumber
                        );

                assert centre.addClass(fitnessClass)
                        : "Failed to add stress-test class";
            }
        }

        assert centre.getClasses().size() == activityCount
                : "Incorrect number of activity keys";

        for (int activity = 0;
             activity < activityCount;
             activity++) {

            assert centre.getClassesByActivity(
                    "Activity-" + activity
            ).size() == classesPerActivity
                    : "Incorrect number of classes for activity";
        }

        // Try adding all names again using different capitalisation
        for (int activity = 0;
             activity < activityCount;
             activity++) {

            FitnessClass duplicate =
                    new FitnessClass(
                            ("Class-" + activity + "-0").toUpperCase(),
                            "Activity-" + activity,
                            999
                    );

            assert !centre.addClass(duplicate)
                    : "Case-insensitive duplicate was accepted";
        }

        // Remove every class
        for (int activity = 0;
             activity < activityCount;
             activity++) {

            for (int classNumber = 0;
                 classNumber < classesPerActivity;
                 classNumber++) {

                String className =
                        "class-" + activity + "-" + classNumber;

                assert centre.removeClass(className)
                        : "Failed to remove " + className;
            }
        }

        assert centre.getClasses().isEmpty()
                : "All activity keys should be removed";

        System.out.println("FitnessCentre stress test passed.");
    }

    // =========================================================
    // High-volume FitnessCouncil stress test
    // =========================================================
    public static void stressTestFitnessCouncil() {
        FitnessCouncil council = new FitnessCouncil();

        int centreCount = 50;
        int classesPerCentre = 10;

        for (int centreNumber = 0;
             centreNumber < centreCount;
             centreNumber++) {

            FitnessCentre centre =
                    new FitnessCentre(
                            "Centre-" + centreNumber,
                            "REG-" + centreNumber
                    );

            for (int classNumber = 0;
                 classNumber < classesPerCentre;
                 classNumber++) {

                String activity =
                        "Activity-" + (classNumber % 5);

                FitnessClass fitnessClass =
                        new FitnessClass(
                                "Centre-" + centreNumber
                                        + "-Class-" + classNumber,
                                activity,
                                30
                        );

                assert centre.addClass(fitnessClass)
                        : "Failed to add council stress-test class";
            }

            assert council.registerCentre(centre)
                    : "Failed to register Centre-" + centreNumber;
        }

        assert council.getCentres().size() == centreCount
                : "Council should contain 50 centres";

        assert council.getAllClassNames().size()
                == centreCount * classesPerCentre
                : "Council should contain 500 class occurrences";

        // Attempt to register duplicates using uppercase names
        for (int centreNumber = 0;
             centreNumber < centreCount;
             centreNumber++) {

            FitnessCentre duplicate =
                    new FitnessCentre(
                            ("Centre-" + centreNumber).toUpperCase(),
                            "DUPLICATE-" + centreNumber
                    );

            assert !council.registerCentre(duplicate)
                    : "Duplicate centre name was accepted";
        }

        assert council.getCentres().size() == centreCount
                : "Duplicate attempts changed centre count";

        // Each activity appears twice per centre:
        // class numbers 0 and 5 use Activity-0, etc.
        for (int activity = 0; activity < 5; activity++) {
            ArrayList<String> results =
                    council.getClassesByActivity(
                            "Activity-" + activity
                    );

            assert results.size() == centreCount * 2
                    : "Unexpected class count for Activity-"
                    + activity;
        }

        // Check a centre near the end of the list
        ArrayList<String> lastCentreClasses =
                council.getClassesByCentre("centre-49");

        assert lastCentreClasses.size() == classesPerCentre
                : "Case-insensitive lookup failed for Centre-49";

        System.out.println("FitnessCouncil stress test passed.");
    }

    // =========================================================
    // Helper methods
    // =========================================================
    private static Member createMember(
            String name,
            String nric,
            String preferredActivity
    ) {
        return new Member(
                name,
                nric,
                "Not Specified",
                "2000-01-01",
                "Basic",
                preferredActivity
        );
    }

    private static int countOccurrences(
            ArrayList<String> values,
            String target
    ) {
        int count = 0;

        for (String value : values) {
            if (value.equals(target)) {
                count++;
            }
        }

        return count;
    }
}