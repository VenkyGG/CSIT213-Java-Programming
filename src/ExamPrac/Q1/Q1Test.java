package ExamPrac.Q1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Q1Test {
    public static void main(String[] args) {
        String filename = "data/prac_q1_data.txt";
        HashMap<String, ArrayList<Parcel>> parcels = load(filename);

        System.out.println("Delivering: ");
        show(parcels, "delivering");

        System.out.println("Received: ");
        show(parcels, "received");

        System.out.println("Returned: ");
        show(parcels, "returned");

        System.out.println("Ready: ");
        show(parcels, "ready");
    }

    public static HashMap<String, ArrayList<Parcel>> load(String filename) {
        HashMap<String, ArrayList<Parcel>> parcels = new HashMap<>();

        Scanner reader = null;

        try {
            reader = new Scanner(new File(filename));

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] data = line.split(",", -1);

                if (!line.startsWith("id,") && data.length == 7) {
                    String id = data[0].trim();
                    String addr = data[1].trim();
                    double len = Double.parseDouble(data[2].trim());
                    double wdt = Double.parseDouble(data[3].trim());
                    double hgt = Double.parseDouble(data[4].trim());
                    double wgt = Double.parseDouble(data[5].trim());
                    String stat = data[6].trim();

                    boolean duplicate = false;

                    if (id.startsWith("p")) {
                        Parcel newParcel = new Parcel(id, addr, len, wdt, hgt, wgt, stat);

                        for (String key : parcels.keySet()) {
                            for (Parcel p : parcels.get(key.toLowerCase())) {
                                if (p.equals(newParcel)) {
                                    duplicate = true;
                                }
                            }
                        }

                        if (duplicate)
                            continue;

                        if (parcels.containsKey(stat.toLowerCase())) {
                            ArrayList<Parcel> aListParcel = parcels.get(stat.toLowerCase());
                            aListParcel.add(newParcel);
                        }
                        else {
                            ArrayList<Parcel> newList = new ArrayList<>();
                            newList.add(newParcel);
                            parcels.put(stat.toLowerCase(), newList);
                        }
                    }
                    else {
                        Parcel24 newParcel = new Parcel24(id, addr, len, wdt, hgt, wgt, stat);

                        for (String key : parcels.keySet()) {
                            for (Parcel p : parcels.get(key.toLowerCase())) {
                                if (p.equals(newParcel)) {
                                    duplicate = true;
                                }
                            }
                        }

                        if (duplicate)
                            continue;

                        if (parcels.containsKey(stat.toLowerCase())) {
                            ArrayList<Parcel> aListParcel = parcels.get(stat.toLowerCase());
                            aListParcel.add(newParcel);
                        }
                        else {
                            ArrayList<Parcel> newList = new ArrayList<>();
                            newList.add(newParcel);
                            parcels.put(stat.toLowerCase(), newList);
                        }
                    }
                }
            }
        }
        catch (FileNotFoundException ex) {
            System.out.println("File not found.");
        }
        finally {
            if (reader != null) {
                reader.close();
            }
        }

/*        for (String key : parcels.keySet()) {
            System.out.println(parcels.get(key));
        }*/

        return parcels;
    }

    public static void show(HashMap<String, ArrayList<Parcel>> data, String status) {
        if (!data.isEmpty()) {
            for (Parcel p : data.get(status.toLowerCase())) {
                System.out.println(p);
            }
        }
    }
}
