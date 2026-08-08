package Tutorials.Tut3.T01F;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class ClaimManager {
    public static void main(String[] args) {
        //test1();
        //test2();
        test3();
    }

    public static void test1() {

    }

    public static void test2() {
        ArrayList<Claim> claims = new ArrayList<>();
        claims.add(new Claim("e1", LocalDate.of(2026, 5, 15)));
        claims.add(new ClaimTpt("e2", LocalDate.of(2026, 6, 12), 100));
        claims.add(new ClaimOT("e3", LocalDate.of(2026, 4, 15), 6));
        claims.add(new ClaimOT("e4", LocalDate.of(2026, 5, 15), 2));

        System.out.println(claims);
    }

    public static void test3() {
        ClaimManager mgr = new ClaimManager();
        mgr.load();
        System.out.println(mgr);
        System.out.println(mgr.getTotalClaim());
        System.out.println(mgr.getTotalTp());
        System.out.println(mgr.getTotalOT());
        System.out.println(mgr.getTotalClaim("e1"));
        System.out.println(mgr.getTotalClaim("e99"));

        HashMap<String, ArrayList<Claim>> summary = mgr.getSummary();
        for (String empId : summary.keySet()) {
            System.out.println(empId);
            ArrayList<Claim> empClaims = summary.get(empId);
            for (Claim c : empClaims) {
                System.out.println(" " + c);
            }
        }
    }

    private ArrayList<Claim> claims;

    public HashMap<String, ArrayList<Claim>> getSummary() {
        HashMap<String, ArrayList<Claim>> summary = new HashMap<>();

        for (Claim c : claims) {
            String empId = c.getEmpId();
            // Entry found
            if (summary.containsKey(c.getEmpId())) {
                ArrayList<Claim> claimList = summary.get(empId);
                claimList.add(c);
            }
            else {
                // Create new and add
                ArrayList<Claim> newList = new ArrayList<>();
                newList.add(c);
                summary.put(empId, newList);
            }
        }

        return summary;
    }

    public ClaimManager() {
        claims = new ArrayList<>();
    }

    public void load() {
        claims.add(new Claim("e1", LocalDate.of(2026, 5, 15)));
        claims.add(new ClaimTpt("e1", LocalDate.of(2026, 6, 12), 100));

        claims.add(new ClaimTpt("e2", LocalDate.of(2026, 6, 12), 100));

        claims.add(new ClaimTpt("e3", LocalDate.of(2026, 6, 12), 100));
        claims.add(new ClaimOT("e3", LocalDate.of(2026, 4, 15), 6));

        claims.add(new Claim("e4", LocalDate.of(2026, 5, 15)));
        claims.add(new Claim("e4", LocalDate.of(2026, 5, 20)));
        claims.add(new ClaimOT("e4", LocalDate.of(2026, 5, 15), 2));
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        for (Claim c : claims) {
            result.append(c + "\n");
        }

        return result.toString();
    }

    public double getTotalClaim(String empId) {
        double total = 0;

        for (Claim c : claims) {
            if (c.getEmpId().equalsIgnoreCase(empId)) {
                total += c.getClaimAmount();
            }
        }

        return total;
    }

    public double getTotalClaim() {
        double total = 0;

        for (Claim c : claims) {
            total += c.getClaimAmount();
        }

        return total;
    }

    public double getTotalTp() {
        double total = 0;

        for (Claim c : claims) {
            if (c instanceof ClaimTpt) {
                total += c.getClaimAmount();
            }
        }

        return total;
    }

    public double getTotalOT() {
        double total = 0;

        for (Claim c : claims) {
            if (c instanceof ClaimOT) {
                total += c.getClaimAmount();
            }
        }

        return total;
    }
}