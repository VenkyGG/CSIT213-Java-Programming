package Tutorials.Tut3.T04F;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ClaimManager {
    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        ClaimManager mgr = new ClaimManager();
        mgr.load("data/lab_3_data.csv");
        System.out.println(mgr);
        System.out.println("mgr.getTotalClaim(): " + mgr.getTotalClaim());
        System.out.println("mgr.getTotalClaim(\"E001\"): " + mgr.getTotalClaim("E001"));
        System.out.println("mgr.getTotalClaim(\"E002\"): " + mgr.getTotalClaim("E002"));
        System.out.println("mgr.getTotalClaim(\"E003\"): " + mgr.getTotalClaim("E003"));
        System.out.println("mgr.getTotalClaim(\"E004\"): " + mgr.getTotalClaim("E004"));
        System.out.println("mgr.getTotalOT(): " + mgr.getTotalOT());
        System.out.println("mgr.getTotalTp(): " + mgr.getTotalTp());

    }

    private final List<Claim> claims;

    public ClaimManager() {
        claims = new ArrayList<>();
    }

    public void load(String file) {

        try {
            Scanner data = new Scanner(new File(file));

            while (data.hasNextLine()) {
                String line = data.nextLine();
                String[] parts = line.split(",");

                // Check for malformed or comments
                if (parts.length < 4) {
                    continue;
                }

                String type = parts[0];
                String empId = parts[1].trim();
                LocalDate date = LocalDate.parse(parts[2].trim());

                try {
                    switch (type) {
                        case "TPT": {
                            double dist = Double.parseDouble(parts[3].trim());
                            claims.add(new ClaimTpt(empId, date, dist));
                            break;
                        }
                        case "OT": {
                            int hours = Integer.parseInt(parts[3].trim());
                            claims.add(new ClaimOT(empId, date, hours));
                            break;
                        }
                        default:
                            // Ignore unknown type
                    }
                }
                catch (RuntimeException ex) {
                    // Skip invalid numeric/date conversions for this line
                }
            }
        }
        catch (FileNotFoundException err) {
            System.out.println("File not found.");
        }
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