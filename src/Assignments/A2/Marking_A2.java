package Assignments.A2;

import java.util.*;

/**
 * FitnessComprehensiveTest.java
 * =====================================================================
 * A thorough assertion-based test driver for the National Fitness
 * Council Management System.
 *
 * Coverage per class: NORMAL cases (expected everyday usage),
 * EXTREME cases (boundary values, capacity edges, large volumes,
 * unusual-but-legal input) and ERROR cases (null, empty, not-found,
 * duplicates).
 *
 * Run with assertions enabled:
 *     javac *.java
 *     java -ea FitnessComprehensiveTest
 * =====================================================================
 */
public class Marking_A2 {

	private static int score = 0;
    public static void main(String[] args) {

        if (!checkAssertionsEnabled()) {
            System.out.println("Aborting: re-run with  java -ea FitnessComprehensiveTest");
            return;
        }

        // ---------- Person ----------
        try {
        	testPerson_Normal();
        }catch(Exception ex) {
        	System.out.println("testPerson_Normal() failed");
        }catch(AssertionError ex) {
        	System.out.println("testPerson_Normal() failed");
        }
        try {
        	testPerson_Extreme();
        }catch(Exception ex) {
        	System.out.println("testPerson_Extreme() failed");
        }catch(AssertionError ex) {
        	System.out.println("testPerson_Extreme() failed");
        }
 
        // ---------- Member ----------
        try {
        	testMember_Normal();
        }catch(Exception ex) {
        	System.out.println("testMember_Normal() failed");
        }catch(AssertionError ex) {
        	System.out.println("testMember_Normal() failed");
        }
        try {
        	testMember_InheritanceAndPolymorphism();
        }catch(Exception ex) {
        	System.out.println("testMember_InheritanceAndPolymorphism() failed");
        }catch(AssertionError ex) {
        	System.out.println("testMember_InheritanceAndPolymorphism() failed");
        }
        try {
        	testMember_Extreme();
        }catch(Exception ex) {
        	System.out.println("testMember_Extreme() failed");
        }catch(AssertionError ex) {
        	System.out.println("testMember_Extreme() failed");
        }
 
        // ---------- FitnessClass ----------
        try {
        	testFitnessClass_Normal();
        }catch(Exception ex) {
        	System.out.println("testFitnessClass_Normal() failed");
        }catch(AssertionError ex) {
        	System.out.println("testFitnessClass_Normal() failed");
        }
        try {
        	testFitnessClass_ErrorCases();
        }catch(Exception ex) {
        	System.out.println("testFitnessClass_ErrorCases() failed");
        }catch(AssertionError ex) {
        	System.out.println("testFitnessClass_ErrorCases() failed");
        }
        try {
        	testFitnessClass_CapacityBoundaries();
        }catch(Exception ex) {
        	System.out.println("testFitnessClass_CapacityBoundaries() failed");
        }catch(AssertionError ex) {
        	System.out.println("testFitnessClass_CapacityBoundaries() failed");
        }
        try {
        	testFitnessClass_StaticCapacityShared();
        }catch(Exception ex) {
        	System.out.println("testFitnessClass_StaticCapacityShared() failed");
        }catch(AssertionError ex) {
        	System.out.println("testFitnessClass_StaticCapacityShared() failed");
        }
        try {
        	testFitnessClass_RemovalAndReuse();
        }catch(Exception ex) {
        	System.out.println("testFitnessClass_RemovalAndReuse() failed");
        }catch(AssertionError ex) {
        	System.out.println("testFitnessClass_RemovalAndReuse() failed");
        }
        try {
        	testFitnessClass_ToString();
        }catch(Exception ex) {
        	System.out.println("testFitnessClass_ToString() failed");
        }catch(AssertionError ex) {
        	System.out.println("testFitnessClass_ToString() failed");
        }
 
        // ---------- FitnessCentre ----------
        try {
        	testFitnessCentre_Normal();
        }catch(Exception ex) {
        	System.out.println("testFitnessCentre_Normal() failed");
        }catch(AssertionError ex) {
        	System.out.println("testFitnessCentre_Normal() failed");
        }
        try {
        	testFitnessCentre_ErrorCases();
        }catch(Exception ex) {
        	System.out.println("testFitnessCentre_ErrorCases() failed");
        }catch(AssertionError ex) {
        	System.out.println("testFitnessCentre_ErrorCases() failed");
        }
        try {
        	testFitnessCentre_DuplicateRules();
        }catch(Exception ex) {
        	System.out.println("testFitnessCentre_DuplicateRules() failed");
        }catch(AssertionError ex) {
        	System.out.println("testFitnessCentre_DuplicateRules() failed");
        }
        try {
        	testFitnessCentre_KeyRemovalOnEmptyList();
        }catch(Exception ex) {
        	System.out.println("testFitnessCentre_KeyRemovalOnEmptyList() failed");
        }catch(AssertionError ex) {
        	System.out.println("testFitnessCentre_KeyRemovalOnEmptyList() failed");
        }
        try {
        	testFitnessCentre_LookupsAndToString();
        }catch(Exception ex) {
        	System.out.println("testFitnessCentre_LookupsAndToString() failed");
        }catch(AssertionError ex) {
        	System.out.println("testFitnessCentre_LookupsAndToString() failed");
        }
 
        // ---------- FitnessCouncil ----------
        try {
        	testFitnessCouncil_Normal();
        }catch(Exception ex) {
        	System.out.println("testFitnessCouncil_Normal() failed");
        }catch(AssertionError ex) {
        	System.out.println("testFitnessCouncil_Normal() failed");
        }
        try {
        	testFitnessCouncil_ErrorCases();
        }catch(Exception ex) {
        	System.out.println("testFitnessCouncil_ErrorCases() failed");
        }catch(AssertionError ex) {
        	System.out.println("testFitnessCouncil_ErrorCases() failed");
        }
        try {
        	testFitnessCouncil_Aggregation();
        }catch(Exception ex) {
        	System.out.println("testFitnessCouncil_Aggregation() failed");
        }catch(AssertionError ex) {
        	System.out.println("testFitnessCouncil_Aggregation() failed");
        }
        try {
        	testFitnessCouncil_DeDuplication();
        }catch(Exception ex) {
        	System.out.println("testFitnessCouncil_DeDuplication() failed");
        }catch(AssertionError ex) {
        	System.out.println("testFitnessCouncil_DeDuplication() failed");
        }
        try {
        	testFitnessCouncil_StressTest();
        }catch(Exception ex) {
        	System.out.println("testFitnessCouncil_StressTest() failed");
        }catch(AssertionError ex) {
        	System.out.println("testFitnessCouncil_StressTest() failed");
        }

        System.out.println("=====================================================");
        System.out.println("Score:"+Math.ceil(score/200.0*100));
        System.out.println("=====================================================");
    }

    // =================================================================
    // 0. Assertion-enabled check (assignment-with-side-effect idiom)
    // =================================================================
    private static boolean checkAssertionsEnabled() {
        boolean enabled = false;
        assert enabled = true;
        score++; // intentional side effect
        System.out.println(enabled
                ? "[OK] Assertions are enabled."
                : "[!!] Assertions are NOT enabled. Use the -ea flag.");
        return enabled;
    }

    // =================================================================
    // 1. Person
    // =================================================================

    /** NORMAL: constructor, every getter, exact toString format. */
    private static void testPerson_Normal() {
        Person p = new Person("Alice Tan", "S1234567A", "Female", "1999-05-12");

        try {
            assert p.getName().equals("Alice Tan")        : "Person.getName() wrong value";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testPerson_Normal() test case 1 failed");
        }
        try {
            assert p.getNRIC().equals("S1234567A")        : "Person.getNRIC() wrong value";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testPerson_Normal() test case 2 failed");
        }
        try {
            assert p.getGender().equals("Female")         : "Person.getGender() wrong value";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testPerson_Normal() test case 3 failed");
        }
        try {
            assert p.getDateOfBirth().equals("1999-05-12"): "Person.getDateOfBirth() wrong value";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testPerson_Normal() test case 4 failed");
        }
        try {
            assert p.toString().equals("Alice Tan (S1234567A), Female, DOB: 1999-05-12")
                    : "Person.toString() format mismatch: " + p;
            score++;
        } catch (AssertionError ex) {
            System.out.println("testPerson_Normal() test case 5 failed");
        }

        // Two distinct Person objects must hold independent state
        Person q = new Person("Bob Lim", "S7654321B", "Male", "1998-02-01");
        try {
            assert !p.getName().equals(q.getName()) : "Person state not independent per instance";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testPerson_Normal() test case 6 failed");
        }
        try {
            assert p.getNRIC().equals("S1234567A")  : "Person p mutated by creating q";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testPerson_Normal() test case 7 failed");
        }

        System.out.println("[Person] NORMAL cases passed.");
    }

    /** EXTREME: empty strings, very long names, special characters. */
    private static void testPerson_Extreme() {
        // Empty strings are legal for a plain data holder
        Person empty = new Person("", "", "", "");
        try {
            assert empty.getName().equals("") : "Empty name not preserved";
            score+=2;
        } catch (AssertionError ex) {
            System.out.println("testPerson_Extreme() test case 1 failed");
        }
        try {
            assert empty.toString().equals(" (), , DOB: ")
                    : "toString with empty fields mismatch: [" + empty + "]";
            score+=2;
        } catch (AssertionError ex) {
            System.out.println("testPerson_Extreme() test case 2 failed");
        }

        // Very long name (1000 chars)
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) sb.append('X');
        String longName = sb.toString();
        Person longP = new Person(longName, "S0000000Z", "Other", "2000-01-01");
        try {
            assert longP.getName().length() == 1000 : "Long name truncated or altered";
            score+=2;
        } catch (AssertionError ex) {
            System.out.println("testPerson_Extreme() test case 3 failed");
        }
        try {
            assert longP.toString().startsWith(longName) : "toString lost long name";
            score+=2;
        } catch (AssertionError ex) {
            System.out.println("testPerson_Extreme() test case 4 failed");
        }
        
        System.out.println("[Person] EXTREME cases passed.");
    }

    // =================================================================
    // 2. Member
    // =================================================================

    /** NORMAL: constructor chaining, all getters, extended toString. */
    private static void testMember_Normal() {
        Member m = new Member("Alice Tan", "S1234567A", "Female", "1999-05-12",
                              "Premium", "Yoga");

        // Inherited getters
        try {
            assert m.getName().equals("Alice Tan")   : "Member inherited getName() broken";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testMember_Normal() test case 1 failed");
        }
        try {
            assert m.getNRIC().equals("S1234567A")   : "Member inherited getNRIC() broken";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testMember_Normal() test case 2 failed");
        }
        try {
            assert m.getGender().equals("Female")    : "Member inherited getGender() broken";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testMember_Normal() test case 3 failed");
        }
        try {
            assert m.getDateOfBirth().equals("1999-05-12") : "Member inherited getDateOfBirth() broken";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testMember_Normal() test case 4 failed");
        }

        // Own getters
        try {
            assert m.getMembershipTier().equals("Premium") : "getMembershipTier() wrong value";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testMember_Normal() test case 5 failed");
        }
        try {
            assert m.getPreferredActivity().equals("Yoga") : "getPreferredActivity() wrong value";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testMember_Normal() test case 6 failed");
        }

        // toString must EXTEND Person's toString (prefix must match exactly)
        String personPart = "Alice Tan (S1234567A), Female, DOB: 1999-05-12";
        String expected   = personPart + ", Tier: Premium, Prefers: Yoga";
        try {
            assert m.toString().equals(expected) : "Member.toString() mismatch: " + m;
            score++;
        } catch (AssertionError ex) {
            System.out.println("testMember_Normal() test case 7 failed");
        }
        try {
            assert m.toString().startsWith(personPart) : "Member.toString() does not chain super.toString()";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testMember_Normal() test case 8 failed");
        }

        System.out.println("[Member] NORMAL cases passed.");
    }

    /** Inheritance: is-a relationship and polymorphic dispatch. */
    private static void testMember_InheritanceAndPolymorphism() {
        Member m = new Member("Bob Lim", "S7654321B", "Male", "1998-02-01", "Basic", "Spin");

        try {
            assert m instanceof Person : "Member must inherit from Person";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testMember_InheritanceAndPolymorphism() test case 1 failed");
        }

        // Upcast: dynamic dispatch must still use Member's toString
        Person asPerson = m;
        try {
            assert asPerson.toString().contains("Tier: Basic")
                    : "Polymorphic toString() did not dispatch to Member override";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testMember_InheritanceAndPolymorphism() test case 2 failed");
        }
        try {
            assert asPerson.getName().equals("Bob Lim")
                    : "Upcast Member lost inherited accessor behaviour";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testMember_InheritanceAndPolymorphism() test case 3 failed");
        }

        // A Member must be usable anywhere a Person is expected
        ArrayList<Person> people = new ArrayList<>();
        people.add(m);
        try {
            assert people.get(0).getNRIC().equals("S7654321B") : "Member unusable as Person in collections";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testMember_InheritanceAndPolymorphism() test case 4 failed");
        }

        System.out.println("[Member] INHERITANCE / POLYMORPHISM cases passed.");
    }

    /** EXTREME: unusual tier / activity values. */
    private static void testMember_Extreme() {
        Member m = new Member("X", "S1", "N/A", "1900-01-01", "", "High-Intensity 高强度!");
        try {
            assert m.getMembershipTier().equals("") : "Empty tier not preserved";
            score+=2;
        } catch (AssertionError ex) {
            System.out.println("testMember_Extreme() test case 1 failed");
        }
        try {
            assert m.getPreferredActivity().equals("High-Intensity 高强度!") : "Unicode activity corrupted";
            score+=2;
        } catch (AssertionError ex) {
            System.out.println("testMember_Extreme() test case 2 failed");
        }
        try {
            assert m.toString().endsWith("Tier: , Prefers: High-Intensity 高强度!")
                    : "Member.toString() with extreme values mismatch: " + m;
            score+=2;
        } catch (AssertionError ex) {
            System.out.println("testMember_Extreme() test case 3 failed");
        }

        System.out.println("[Member] EXTREME cases passed.");
    }

    // =================================================================
    // 3. FitnessClass
    // =================================================================

    private static Member mem(String name, String nric) {
        return new Member(name, nric, "Female", "1999-01-01", "Basic", "Yoga");
    }

    /** NORMAL: getters, empty participant list, happy-path enrolment. */
    private static void testFitnessClass_Normal() {
        FitnessClass.maxParticipants = 2; // known capacity for the test

        FitnessClass cls = new FitnessClass("Sunrise Yoga", "Yoga", 60);
        try {
            assert cls.getClassName().equals("Sunrise Yoga") : "getClassName() wrong value";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessClass_Normal() test case 1 failed");
        }
        try {
            assert cls.getActivityType().equals("Yoga")      : "getActivityType() wrong value";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessClass_Normal() test case 2 failed");
        }
        try {
            assert cls.getParticipants() != null             : "getParticipants() returned null";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessClass_Normal() test case 3 failed");
        }
        try {
            assert cls.getParticipants().isEmpty()           : "New class must start with 0 participants";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessClass_Normal() test case 4 failed");
        }

        Member a = mem("Alice", "S1111111A");
        Member b = mem("Bob",   "S2222222B");

        try {
            assert cls.enrolMember(a) : "First enrolment should succeed";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessClass_Normal() test case 5 failed");
        }
        try {
            assert cls.getParticipants().size() == 1 : "Size should be 1 after first enrolment";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessClass_Normal() test case 6 failed");
        }
        try {
            assert cls.getParticipants().contains(a) : "Enrolled member not present in participants";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessClass_Normal() test case 7 failed");
        }

        try {
            assert cls.enrolMember(b) : "Second enrolment should succeed";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessClass_Normal() test case 8 failed");
        }
        try {
            assert cls.getParticipants().size() == 2 : "Size should be 2 after second enrolment";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessClass_Normal() test case 9 failed");
        }

        System.out.println("[FitnessClass] NORMAL cases passed.");
    }

    /** ERROR: null member, duplicate NRIC, null/empty/unknown removal. */
    private static void testFitnessClass_ErrorCases() {
        FitnessClass.maxParticipants = 5;
        FitnessClass cls = new FitnessClass("Spin Express", "Spin", 30);

        Member a = mem("Alice", "S1111111A");
        try {
            assert cls.enrolMember(a) : "Setup enrolment failed";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessClass_ErrorCases() test case 1 failed");
        }

        // Null member
        try {
            assert !cls.enrolMember(null) : "enrolMember(null) must return false";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessClass_ErrorCases() test case 2 failed");
        }
        try {
            assert cls.getParticipants().size() == 1 : "Null enrolment must not change size";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessClass_ErrorCases() test case 3 failed");
        }

        // Duplicate NRIC — same object AND a different object with same NRIC
        try {
            assert !cls.enrolMember(a) : "Re-enrolling same object must be rejected";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessClass_ErrorCases() test case 4 failed");
        }
        Member aClone = mem("Alice Clone", "S1111111A");
        try {
            assert !cls.enrolMember(aClone) : "Different object with same NRIC must be rejected";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessClass_ErrorCases() test case 5 failed");
        }
        try {
            assert cls.getParticipants().size() == 1 : "Duplicate attempts must not change size";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessClass_ErrorCases() test case 6 failed");
        }

        // Removal error cases
        try {
            assert !cls.removeMember(null)       : "removeMember(null) must return false";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessClass_ErrorCases() test case 7 failed");
        }
        try {
            assert !cls.removeMember("")         : "removeMember(\"\") must return false";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessClass_ErrorCases() test case 8 failed");
        }
        try {
            assert !cls.removeMember("S9999999Z"): "Removing unknown NRIC must return false";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessClass_ErrorCases() test case 9 failed");
        }
        try {
            assert cls.getParticipants().size() == 1 : "Failed removals must not change size";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessClass_ErrorCases() test case 10 failed");
        }

        // Removing twice: second attempt must fail
        try {
            assert cls.removeMember("S1111111A")  : "First removal should succeed";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessClass_ErrorCases() test case 11 failed");
        }
        try {
            assert !cls.removeMember("S1111111A") : "Second removal of same NRIC must fail";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessClass_ErrorCases() test case 12 failed");
        }
        try {
            assert cls.getParticipants().isEmpty(): "List should be empty after removal";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessClass_ErrorCases() test case 13 failed");
        }

        System.out.println("[FitnessClass] ERROR cases passed.");
    }

    /** EXTREME: capacity 0, capacity 1, exactly-at-capacity boundary. */
    private static void testFitnessClass_CapacityBoundaries() {
        FitnessClass cls = new FitnessClass("Bootcamp", "HIIT", 45);

        // Capacity 0: nobody can ever enrol
        FitnessClass.maxParticipants = 0;
        try {
            assert !cls.enrolMember(mem("A", "S0000001A")) : "Capacity 0 must reject everyone";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessClass_CapacityBoundaries() test case 1 failed");
        }
        try {
            assert cls.getParticipants().isEmpty() : "Capacity-0 class must stay empty";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessClass_CapacityBoundaries() test case 2 failed");
        }

        // Capacity 1: exactly one succeeds, the next is rejected
        FitnessClass.maxParticipants = 1;
        try {
            assert cls.enrolMember(mem("A", "S0000001A")) : "Capacity 1: first enrolment must succeed";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessClass_CapacityBoundaries() test case 3 failed");
        }
        try {
            assert !cls.enrolMember(mem("B", "S0000002B")) : "Capacity 1: second enrolment must fail";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessClass_CapacityBoundaries() test case 4 failed");
        }
        try {
            assert cls.getParticipants().size() == 1 : "Capacity 1: size must be exactly 1";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessClass_CapacityBoundaries() test case 5 failed");
        }

        // Large capacity: fill to the exact boundary
        FitnessClass big = new FitnessClass("Mega Class", "Yoga", 90);
        FitnessClass.maxParticipants = 100;
        for (int i = 0; i < 100; i++) {
            try {
                assert big.enrolMember(mem("M" + i, "S" + String.format("%07d", i) + "Q"))
                        : "Enrolment " + i + " should succeed below capacity";    
            } catch (AssertionError ex) {
                System.out.println("testFitnessClass_CapacityBoundaries() test case 6 failed");
            }
        }
        score++;
        
        try {
            assert big.getParticipants().size() == 100 : "Should hold exactly 100 participants";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessClass_CapacityBoundaries() test case 7 failed");
        }
        try {
            assert !big.enrolMember(mem("Overflow", "S9999999X"))
                    : "Enrolment number 101 must be rejected at capacity";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessClass_CapacityBoundaries() test case 8 failed");
        }

        FitnessClass.maxParticipants = 2; // restore default
        System.out.println("[FitnessClass] EXTREME capacity-boundary cases passed.");
    }

    /** maxParticipants is STATIC: changing it affects every instance. */
    private static void testFitnessClass_StaticCapacityShared() {
        FitnessClass.maxParticipants = 1;
        FitnessClass c1 = new FitnessClass("C1", "Yoga", 60);
        FitnessClass c2 = new FitnessClass("C2", "Spin", 30);

        try {
            assert c1.enrolMember(mem("A", "S1000001A")) : "c1 first enrolment should succeed";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessClass_StaticCapacityShared() test case 1 failed");
        }
        try {
            assert !c1.enrolMember(mem("B", "S1000002B")) : "c1 must be full at shared capacity 1";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessClass_StaticCapacityShared() test case 2 failed");
        }
        try {
            assert c2.enrolMember(mem("C", "S1000003C")) : "c2 first enrolment should succeed";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessClass_StaticCapacityShared() test case 3 failed");
        }
        try {
            assert !c2.enrolMember(mem("D", "S1000004D")) : "c2 must also honour shared capacity 1";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessClass_StaticCapacityShared() test case 4 failed");
        }

        // Raising the shared limit re-opens ALL classes
        FitnessClass.maxParticipants = 2;
        try {
            assert c1.enrolMember(mem("B", "S1000002B")) : "Raising static capacity must re-open c1";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessClass_StaticCapacityShared() test case 5 failed");
        }
        try {
            assert c2.enrolMember(mem("D", "S1000004D")) : "Raising static capacity must re-open c2";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessClass_StaticCapacityShared() test case 6 failed");
        }

        System.out.println("[FitnessClass] STATIC shared-capacity cases passed.");
    }

    /** Removal frees a slot; NRIC match on removal is case-insensitive. */
    private static void testFitnessClass_RemovalAndReuse() {
        FitnessClass.maxParticipants = 2;
        FitnessClass cls = new FitnessClass("Evening Flow", "Yoga", 45);

        try {
            assert cls.enrolMember(mem("Alice", "S1234567A"));
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessClass_RemovalAndReuse() test case 1 failed");
        }
        try {
            assert cls.enrolMember(mem("Bob",   "S7654321B"));
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessClass_RemovalAndReuse() test case 2 failed");
        }
        try {
            assert !cls.enrolMember(mem("Carol", "S1111222C")) : "Class should be full";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessClass_RemovalAndReuse() test case 3 failed");
        }

        // Case-insensitive removal (lower-case query for upper-case NRIC)
        try {
            assert cls.removeMember("s1234567a") : "Removal must match NRIC case-insensitively";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessClass_RemovalAndReuse() test case 4 failed");
        }
        try {
            assert cls.getParticipants().size() == 1 : "Size should drop to 1 after removal";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessClass_RemovalAndReuse() test case 5 failed");
        }

        // Freed slot can be reused
        try {
            assert cls.enrolMember(mem("Carol", "S1111222C")) : "Freed slot must be reusable";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessClass_RemovalAndReuse() test case 6 failed");
        }
        try {
            assert cls.getParticipants().size() == 2 : "Size should be back at capacity";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessClass_RemovalAndReuse() test case 7 failed");
        }

        // Mixed-case removal query as well
        try {
            assert cls.removeMember("s7654321B") : "Mixed-case removal must succeed";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessClass_RemovalAndReuse() test case 8 failed");
        }

        System.out.println("[FitnessClass] REMOVAL / slot-reuse cases passed.");
    }

    /** toString format: "name | type | mins | X/Y enrolled". */
    private static void testFitnessClass_ToString() {
        FitnessClass.maxParticipants = 2;
        FitnessClass cls = new FitnessClass("Sunrise Yoga", "Yoga", 60);

        try {
            assert cls.toString().equals("Sunrise Yoga | Yoga | 60 mins | 0/2 enrolled")
                    : "FitnessClass.toString() (empty) mismatch: " + cls;
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessClass_ToString() test case 1 failed");
        }

        cls.enrolMember(mem("Alice", "S1234567A"));
        try {
            assert cls.toString().equals("Sunrise Yoga | Yoga | 60 mins | 1/2 enrolled")
                    : "FitnessClass.toString() (1 enrolled) mismatch: " + cls;
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessClass_ToString() test case 2 failed");
        }

        System.out.println("[FitnessClass] toString cases passed.");
    }

    // =================================================================
    // 4. FitnessCentre
    // =================================================================

    /** NORMAL: add classes across activities, map structure, lookups. */
    private static void testFitnessCentre_Normal() {
        FitnessCentre centre = new FitnessCentre("IronWorks", "FC-2026-001");

        try {
            assert centre.getCentreName().equals("IronWorks") : "getCentreName() wrong value";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCentre_Normal() test case 1 failed");
        }
        try {
            assert centre.getClasses() != null : "getClasses() must never return null";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCentre_Normal() test case 2 failed");
        }
        try {
            assert centre.getClasses().isEmpty() : "New centre must have an empty class map";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCentre_Normal() test case 3 failed");
        }

        FitnessClass yoga1 = new FitnessClass("Sunrise Yoga", "Yoga", 60);
        FitnessClass yoga2 = new FitnessClass("Evening Flow", "Yoga", 45);
        FitnessClass spin1 = new FitnessClass("Spin Express", "Spin", 30);

        try {
            assert centre.addClass(yoga1) : "Adding first Yoga class should succeed";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCentre_Normal() test case 4 failed");
        }
        try {
            assert centre.addClass(yoga2) : "Adding second Yoga class should succeed";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCentre_Normal() test case 5 failed");
        }
        try {
            assert centre.addClass(spin1) : "Adding Spin class should succeed";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCentre_Normal() test case 6 failed");
        }

        // Map structure: 2 activity keys, correct list sizes and contents
        try {
            assert centre.getClasses().size() == 2 : "Map should hold exactly 2 activity keys";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCentre_Normal() test case 7 failed");
        }
        try {
            assert centre.getClasses().containsKey("Yoga") && centre.getClasses().containsKey("Spin")
                    : "Map keys must be the activity types";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCentre_Normal() test case 8 failed");
        }
        try {
            assert centre.getClassesByActivity("Yoga").size() == 2 : "Yoga list should hold 2 classes";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCentre_Normal() test case 9 failed");
        }
        try {
            assert centre.getClassesByActivity("Spin").size() == 1 : "Spin list should hold 1 class";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCentre_Normal() test case 10 failed");
        }
        try {
            assert centre.getClassesByActivity("Yoga").contains(yoga1)
                    && centre.getClassesByActivity("Yoga").contains(yoga2)
                    : "Yoga list contents mismatch";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCentre_Normal() test case 11 failed");
        }

        System.out.println("[FitnessCentre] NORMAL cases passed.");
    }

    /** ERROR: null add, null/empty/unknown removal, unknown activity lookup. */
    private static void testFitnessCentre_ErrorCases() {
        FitnessCentre centre = new FitnessCentre("ZenFlow", "FC-2026-002");

        try {
            assert !centre.addClass(null) : "addClass(null) must return false";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCentre_ErrorCases() test case 1 failed");
        }
        try {
            assert centre.getClasses().isEmpty() : "Failed add must not modify the map";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCentre_ErrorCases() test case 2 failed");
        }

        try {
            assert !centre.removeClass(null) : "removeClass(null) must return false";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCentre_ErrorCases() test case 3 failed");
        }
        try {
            assert !centre.removeClass("")   : "removeClass(\"\") must return false";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCentre_ErrorCases() test case 4 failed");
        }
        try {
            assert !centre.removeClass("Ghost Class") : "Removing unknown class must return false";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCentre_ErrorCases() test case 5 failed");
        }

        // Unknown activity lookup: empty list, never null — and repeatable
        try {
            assert centre.getClassesByActivity("Pilates") != null
                    : "getClassesByActivity(unknown) must not return null";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCentre_ErrorCases() test case 6 failed");
        }
        try {
            assert centre.getClassesByActivity("Pilates").isEmpty()
                    : "getClassesByActivity(unknown) must return an empty list";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCentre_ErrorCases() test case 7 failed");
        }
        try {
            assert centre.getClassesByActivity(null) != null
                    : "getClassesByActivity(null) must not return null";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCentre_ErrorCases() test case 8 failed");
        }
        try {
            assert centre.getClassesByActivity(null).isEmpty()
                    : "getClassesByActivity(null) must return an empty list";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCentre_ErrorCases() test case 9 failed");
        }

        System.out.println("[FitnessCentre] ERROR cases passed.");
    }

    /** Duplicate rules: same name+activity rejected (case-insensitive);
     *  same name under a DIFFERENT activity type is allowed. */
    private static void testFitnessCentre_DuplicateRules() {
        FitnessCentre centre = new FitnessCentre("FlexHub", "FC-2026-003");

        FitnessClass original  = new FitnessClass("Power Hour", "HIIT", 60);
        FitnessClass dupExact  = new FitnessClass("Power Hour", "HIIT", 45);
        FitnessClass dupCased  = new FitnessClass("pOwEr HoUr", "HIIT", 30);
        FitnessClass sameNameOtherActivity = new FitnessClass("Power Hour", "Spin", 60);

        try {
            assert centre.addClass(original) : "Original class should be added";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCentre_DuplicateRules() test case 1 failed");
        }
        try {
            assert !centre.addClass(dupExact) : "Exact duplicate name in same activity must be rejected";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCentre_DuplicateRules() test case 2 failed");
        }
        try {
            assert !centre.addClass(dupCased) : "Case-variant duplicate in same activity must be rejected";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCentre_DuplicateRules() test case 3 failed");
        }
        try {
            assert centre.getClassesByActivity("HIIT").size() == 1
                    : "HIIT list must remain size 1 after duplicate attempts";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCentre_DuplicateRules() test case 4 failed");
        }

        // Spec: duplicates are only forbidden under the SAME activity type
        try {
            assert centre.addClass(sameNameOtherActivity)
                    : "Same class name under a different activity type must be allowed";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCentre_DuplicateRules() test case 5 failed");
        }
        try {
            assert centre.getClassesByActivity("Spin").size() == 1
                    : "Spin list should hold the same-named class";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCentre_DuplicateRules() test case 6 failed");
        }

        System.out.println("[FitnessCentre] DUPLICATE-rule cases passed.");
    }

    /** Key removal: activity key disappears once its last class is removed. */
    private static void testFitnessCentre_KeyRemovalOnEmptyList() {
        FitnessCentre centre = new FitnessCentre("CoreLab", "FC-2026-004");

        centre.addClass(new FitnessClass("Sunrise Yoga", "Yoga", 60));
        centre.addClass(new FitnessClass("Evening Flow", "Yoga", 45));
        centre.addClass(new FitnessClass("Spin Express", "Spin", 30));

        // Remove one of two Yoga classes: key must remain
        try {
            assert centre.removeClass("SUNRISE YOGA") : "Case-insensitive removal must succeed";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCentre_KeyRemovalOnEmptyList() test case 1 failed");
        }
        try {
            assert centre.getClasses().containsKey("Yoga")
                    : "Yoga key must remain while one class is left";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCentre_KeyRemovalOnEmptyList() test case 2 failed");
        }
        try {
            assert centre.getClassesByActivity("Yoga").size() == 1 : "Yoga list should be size 1";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCentre_KeyRemovalOnEmptyList() test case 3 failed");
        }

        // Remove Spin's ONLY class: key must vanish
        try {
            assert centre.removeClass("Spin Express") : "Removing sole Spin class should succeed";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCentre_KeyRemovalOnEmptyList() test case 4 failed");
        }
        try {
            assert !centre.getClasses().containsKey("Spin")
                    : "Spin key must be removed once its list is empty";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCentre_KeyRemovalOnEmptyList() test case 5 failed");
        }

        // Remove the last Yoga class: map must become fully empty
        try {
            assert centre.removeClass("evening flow") : "Removing last Yoga class should succeed";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCentre_KeyRemovalOnEmptyList() test case 6 failed");
        }
        try {
            assert !centre.getClasses().containsKey("Yoga")
                    : "Yoga key must be removed once its list is empty";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCentre_KeyRemovalOnEmptyList() test case 7 failed");
        }
        try {
            assert centre.getClasses().isEmpty() : "Map must be empty after all classes removed";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCentre_KeyRemovalOnEmptyList() test case 8 failed");
        }

        // EXTREME: add again after full emptying (map must be reusable)
        try {
            assert centre.addClass(new FitnessClass("Comeback Class", "Yoga", 50))
                    : "Centre must accept classes again after being emptied";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCentre_KeyRemovalOnEmptyList() test case 9 failed");
        }
        try {
            assert centre.getClasses().size() == 1 : "Map should rebuild correctly after emptying";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCentre_KeyRemovalOnEmptyList() test case 10 failed");
        }

        System.out.println("[FitnessCentre] KEY-REMOVAL cases passed.");
    }

    /** toString format and repeated lookups. */
    private static void testFitnessCentre_LookupsAndToString() {
        FitnessCentre centre = new FitnessCentre("IronWorks", "FC-2026-001");
        try {
            assert centre.toString().equals("IronWorks (Reg: FC-2026-001)")
                    : "FitnessCentre.toString() mismatch: " + centre;
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCentre_LookupsAndToString() test case 1 failed");
        }

        System.out.println("[FitnessCentre] toString cases passed.");
    }

    // =================================================================
    // 5. FitnessCouncil
    // =================================================================

    /** NORMAL: register centres, basic retrieval. */
    private static void testFitnessCouncil_Normal() {
        FitnessCouncil council = new FitnessCouncil();
        FitnessCentre c1 = new FitnessCentre("IronWorks", "FC-2026-001");
        FitnessCentre c2 = new FitnessCentre("ZenFlow Studio", "FC-2026-002");

        try {
            assert council.getCentres() != null : "getCentres() must never return null";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_Normal() test case 1 failed");
        }
        try {
            assert council.getCentres().isEmpty() : "New council must have no centres";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_Normal() test case 2 failed");
        }

        try {
            assert council.registerCentre(c1) : "registerCentre(c1) should succeed";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_Normal() test case 3 failed");
        }
        try {
            assert council.registerCentre(c2) : "registerCentre(c2) should succeed";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_Normal() test case 4 failed");
        }
        try {
            assert council.getCentres().size() == 2 : "Council should hold exactly 2 centres";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_Normal() test case 5 failed");
        }
        try {
            assert council.getCentres().contains(c1) && council.getCentres().contains(c2)
                    : "Registered centres missing from getCentres()";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_Normal() test case 6 failed");
        }

        System.out.println("[FitnessCouncil] NORMAL cases passed.");
    }

    /** ERROR: null centre, duplicates, empty-council queries never null. */
    private static void testFitnessCouncil_ErrorCases() {
        FitnessCouncil council = new FitnessCouncil();

        try {
            assert !council.registerCentre(null) : "registerCentre(null) must return false";
            score+=2;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_ErrorCases() test case 1 failed");
        }

        // All queries on an empty council: empty results, never null
        try {
            assert council.getAllClassNames() != null && council.getAllClassNames().isEmpty()
                    : "getAllClassNames() on empty council must be empty, never null";
            score+=2;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_ErrorCases() test case 2 failed");
        }
        try {
            assert council.getClassesByCentre("Nowhere") != null
                    && council.getClassesByCentre("Nowhere").isEmpty()
                    : "getClassesByCentre(unknown) must be empty, never null";
            score+=2;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_ErrorCases() test case 3 failed");
        }
        try {
            assert council.getActivitiesByCentre("Nowhere") != null
                    && council.getActivitiesByCentre("Nowhere").isEmpty()
                    : "getActivitiesByCentre(unknown) must be empty, never null";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_ErrorCases() test case 4 failed");
        }
        try {
            assert council.getClassesByActivity("Yoga") != null
                    && council.getClassesByActivity("Yoga").isEmpty()
                    : "getClassesByActivity() on empty council must be empty, never null";
            score+=2;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_ErrorCases() test case 5 failed");
        }

        // Duplicate rejection: same object, and different object with case-variant name
        FitnessCentre c1    = new FitnessCentre("IronWorks", "FC-2026-001");
        FitnessCentre c1Dup = new FitnessCentre("IRONWORKS", "FC-2026-099");
        try {
            assert council.registerCentre(c1) : "First registration should succeed";
            score+=2;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_ErrorCases() test case 6 failed");
        }
        try {
            assert !council.registerCentre(c1) : "Registering the same object twice must fail";
            score+=2;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_ErrorCases() test case 7 failed");
        }
        try {
            assert !council.registerCentre(c1Dup)
                    : "Case-insensitive duplicate centre name must be rejected";
            score+=2;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_ErrorCases() test case 8 failed");
        }
        try {
            assert council.getCentres().size() == 1 : "Council must still hold exactly 1 centre";
            score+=3;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_ErrorCases() test case 9 failed");
        }

        // Registered centre WITH NO classes: all queries stay empty and safe
        try {
            assert council.getClassesByCentre("IronWorks").isEmpty()
                    : "Class-less centre must yield an empty class-name list";
            score+=3;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_ErrorCases() test case 10 failed");
        }
        try {
            assert council.getActivitiesByCentre("IronWorks").isEmpty()
                    : "Class-less centre must yield an empty activity map";
            score+=3;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_ErrorCases() test case 11 failed");
        }
        try {
            assert council.getAllClassNames().isEmpty()
                    : "Council whose only centre has no classes must yield no names";
            score+=3;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_ErrorCases() test case 12 failed");
        }

        System.out.println("[FitnessCouncil] ERROR cases passed.");
    }

    /** Aggregation: names across centres (duplicates KEPT), per-centre views. */
    private static void testFitnessCouncil_Aggregation() {
        FitnessCouncil council = new FitnessCouncil();
        FitnessCentre c1 = new FitnessCentre("IronWorks", "FC-2026-001");
        FitnessCentre c2 = new FitnessCentre("ZenFlow Studio", "FC-2026-002");

        try {
            assert c1.addClass(new FitnessClass("Sunrise Yoga", "Yoga", 60));
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_Aggregation() test case 1 failed");
        }
        try {
            assert c1.addClass(new FitnessClass("Spin Express", "Spin", 30));
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_Aggregation() test case 2 failed");
        }
        try {
            assert c2.addClass(new FitnessClass("Sunrise Yoga", "Yoga", 45));
            score++; // same name, other centre
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_Aggregation() test case 3 failed");
        }
        try {
            assert c2.addClass(new FitnessClass("Moonlight Yoga", "Yoga", 75));
            score++;;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_Aggregation() test case 4 failed");
        }

        try {
            assert council.registerCentre(c1);
            score++;;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_Aggregation() test case 5 failed");
        }
        try {
            assert council.registerCentre(c2);
            score++;;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_Aggregation() test case 6 failed");
        }

        // getAllClassNames(): 4 names, "Sunrise Yoga" appears twice
        ArrayList<String> all = council.getAllClassNames();
        try {
            assert all.size() == 4 : "Expected 4 names across both centres, got " + all.size();
            score++;;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_Aggregation() test case 7 failed");
        }
        int sunrise = 0;
        for (String n : all) if (n.equals("Sunrise Yoga")) sunrise++;
        try {
            assert sunrise == 2 : "getAllClassNames() must keep cross-centre duplicates (expected 2)";
            score++;;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_Aggregation() test case 8 failed");
        }

        // getClassesByCentre(): correct contents + case-insensitive lookup
        ArrayList<String> c1Names = council.getClassesByCentre("IronWorks");
        try {
            assert c1Names.size() == 2 : "IronWorks should list 2 classes";
            score++;;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_Aggregation() test case 9 failed");
        }
        try {
            assert c1Names.contains("Sunrise Yoga") && c1Names.contains("Spin Express")
                    : "IronWorks class names mismatch";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_Aggregation() test case 10 failed");
        }
        try {
            assert council.getClassesByCentre("ironworks").equals(c1Names)
                    : "getClassesByCentre() lookup must be case-insensitive";
            score++;;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_Aggregation() test case 11 failed");
        }
        try {
            assert council.getClassesByCentre("  IronWorks  ").isEmpty()
                    : "Untrimmed name is a different name — should not match";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_Aggregation() test case 12 failed");
        }

        // getActivitiesByCentre(): correct keys and sizes, case-insensitive
        HashMap<String, ArrayList<FitnessClass>> c1Map = council.getActivitiesByCentre("IRONWORKS");
        try {
            assert c1Map.size() == 2 : "IronWorks map should have 2 activity keys";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_Aggregation() test case 13 failed");
        }
        try {
            assert c1Map.containsKey("Yoga") && c1Map.containsKey("Spin")
                    : "IronWorks activity keys mismatch";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_Aggregation() test case 14 failed");
        }
        try {
            assert c1Map.get("Yoga").size() == 1 && c1Map.get("Spin").size() == 1
                    : "IronWorks per-activity list sizes mismatch";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_Aggregation() test case 15 failed");
        }

        HashMap<String, ArrayList<FitnessClass>> c2Map = council.getActivitiesByCentre("ZenFlow Studio");
        try {
            assert c2Map.size() == 1 && c2Map.get("Yoga").size() == 2
                    : "ZenFlow map should have 1 key (Yoga) with 2 classes";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_Aggregation() test case 16 failed");
        }

        System.out.println("[FitnessCouncil] AGGREGATION cases passed.");
    }

    /** getClassesByActivity(): de-duplicates identical names across centres. */
    private static void testFitnessCouncil_DeDuplication() {
        FitnessCouncil council = new FitnessCouncil();
        FitnessCentre c1 = new FitnessCentre("A Gym", "FC-1");
        FitnessCentre c2 = new FitnessCentre("B Gym", "FC-2");
        FitnessCentre c3 = new FitnessCentre("C Gym", "FC-3");

        // "Sunrise Yoga" exists in ALL THREE centres — must appear once
        try {
            assert c1.addClass(new FitnessClass("Sunrise Yoga", "Yoga", 60));
            score++;;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_DeDuplication() test case 1 failed");
        }
        try {
            assert c2.addClass(new FitnessClass("Sunrise Yoga", "Yoga", 45));
            score++;;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_DeDuplication() test case 2 failed");
        }
        try {
            assert c3.addClass(new FitnessClass("Sunrise Yoga", "Yoga", 30));
            score++;;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_DeDuplication() test case 3 failed");
        }
        try {
            assert c2.addClass(new FitnessClass("Moonlight Yoga", "Yoga", 75));
            score++;;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_DeDuplication() test case 4 failed");
        }
        try {
            assert c3.addClass(new FitnessClass("Spin Express", "Spin", 30));
            score++;;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_DeDuplication() test case 5 failed");
        }

        try {
            assert council.registerCentre(c1);
            score++;;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_DeDuplication() test case 6 failed");
        }
        try {
            assert council.registerCentre(c2);
            score++;;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_DeDuplication() test case 7 failed");
        }
        try {
            assert council.registerCentre(c3);
            score++;;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_DeDuplication() test case 8 failed");
        }

        ArrayList<String> yoga = council.getClassesByActivity("Yoga");
        try {
            assert yoga.size() == 2 : "Yoga should de-duplicate 4 classes to 2 unique names, got " + yoga.size();
            score++;;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_DeDuplication() test case 9 failed");
        }
        try {
            assert yoga.contains("Sunrise Yoga") && yoga.contains("Moonlight Yoga")
                    : "De-duplicated Yoga names mismatch";
            score++;;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_DeDuplication() test case 10 failed");
        }

        ArrayList<String> spin = council.getClassesByActivity("Spin");
        try {
            assert spin.size() == 1 && spin.contains("Spin Express") : "Spin names mismatch";
            score++;;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_DeDuplication() test case 11 failed");
        }

        // Unknown activity across a populated council
        try {
            assert council.getClassesByActivity("Pilates").isEmpty()
                    : "Unknown activity must give an empty list even with centres present";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_DeDuplication() test case 12 failed");
        }

        // Sanity cross-check: getAllClassNames keeps all 5 occurrences
        try {
            assert council.getAllClassNames().size() == 5
                    : "getAllClassNames() must keep every occurrence (expected 5)";
            score++;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_DeDuplication() test case 13 failed");
        }

        System.out.println("[FitnessCouncil] DE-DUPLICATION cases passed.");
    }

    /** EXTREME: many centres and classes; totals must stay consistent. */
    private static void testFitnessCouncil_StressTest() {
        FitnessCouncil council = new FitnessCouncil();
        String[] activities = {"Yoga", "Spin", "HIIT", "Pilates"};

        // 50 centres x 4 classes each = 200 classes
        for (int i = 0; i < 50; i++) {
            FitnessCentre c = new FitnessCentre("Centre-" + i, "FC-" + i);
            for (int j = 0; j < 4; j++) {
                // "Shared Class" is identical in every centre; others are unique
                String name = (j == 0) ? "Shared Class" : ("Class-" + i + "-" + j);
                try {
                    assert c.addClass(new FitnessClass(name, activities[j], 30 + j))
                            : "Stress add failed at centre " + i + ", class " + j;    
                } catch (AssertionError ex) {
                    System.out.println("testFitnessCouncil_StressTest() test case 1 failed");
                }
            }
            try {
                assert council.registerCentre(c) : "Stress registration failed at centre " + i;
            } catch (AssertionError ex) {
                System.out.println("testFitnessCouncil_StressTest() test case 2 failed");
            }
        }
        score+=3;
        
        try {
            assert council.getCentres().size() == 50 : "Council should hold 50 centres";
            score+=3;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_StressTest() test case 3 failed");
        }
        try {
            assert council.getAllClassNames().size() == 200
                    : "All names (duplicates kept) should total 200";
            score+=3;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_StressTest() test case 4 failed");
        }

        // "Shared Class" (activity Yoga) is in all 50 centres but must appear ONCE
        ArrayList<String> yoga = council.getClassesByActivity("Yoga");
        try {
            assert yoga.size() == 1 && yoga.contains("Shared Class")
                    : "50 identical Yoga classes must de-duplicate to 1 name";
            score+=3;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_StressTest() test case 5 failed");
        }

        // Unique HIIT classes: one per centre, no accidental de-duplication
        try {
            assert council.getClassesByActivity("HIIT").size() == 50
                    : "50 uniquely named HIIT classes must all survive de-duplication";
            score+=3;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_StressTest() test case 6 failed");
        }

        // Spot-check a per-centre view deep in the list
        try {
            assert council.getClassesByCentre("centre-37").size() == 4
                    : "Case-insensitive lookup of Centre-37 should list 4 classes";
            score+=3;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_StressTest() test case 7 failed");
        }
        try {
            assert council.getActivitiesByCentre("CENTRE-42").size() == 4
                    : "Centre-42 should expose 4 activity keys";
            score+=3;
        } catch (AssertionError ex) {
            System.out.println("testFitnessCouncil_StressTest() test case 8 failed");
        }

        System.out.println("[FitnessCouncil] EXTREME stress-test cases passed.");
    }
}