package Assignments.A3;

import java.util.ArrayList;
import java.util.HashMap;

public class DistrictAirQualityAnalyser implements Analyser {

	@Override
	public HashMap<String, Double> process(ArrayList<AirQualityReading> data) {
		HashMap<String, Double> results = new HashMap<>();
		HashMap<String, ArrayList<Double>> sorted = new HashMap<>();

		for (AirQualityReading a : data) {
			// If key is already present, get the ArrayList and add it to the list
			String key = a.getReadingDateTime().toString() + "_" + a.getDistrict();

			if (sorted.containsKey(key)) {
				ArrayList<Double> values = sorted.get(key);
				values.add(a.getPm25());
			}
			// Key not created in the HashMap yet, so now make it
			else {
				ArrayList<Double> values = new ArrayList<>();
				values.add(a.getPm25());
				sorted.put(key, values);
			}
		}

		for (String key : sorted.keySet()) {
			double sum = 0;

			for (Double pm25 : sorted.get(key)) {
				sum += pm25;
			}

			double avg = sum / sorted.get(key).size();
			double rounded = Math.round(avg * 100.0) / 100.0;
			results.put(key, rounded);
		}

		return results;
	}
}
