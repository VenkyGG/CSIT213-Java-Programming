package Assignments.A3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CityAirStat {
	private String errFileName = "data/ass_3_errors.txt";
	private String resFileName = "data/ass_3_results.txt";
	private ArrayList<AirQualityReading> readings;

	public CityAirStat() {
		readings = new ArrayList<>();
	}

	public void load(String fileName) {
		Scanner reader = null;
		PrintWriter writer = null;
		int lineCount = 0;

		try {
			reader = new Scanner(new File(fileName));
			writer = new PrintWriter(new File(errFileName));
			StringBuilder errorTxt = new StringBuilder();

			while (reader.hasNextLine()) {
				lineCount++;
				String currLine = reader.nextLine();

				// Check for Comment Lines
				if (!currLine.startsWith("#")) {
					// Split the lines
					String[] data = currLine.split(",", -1);

					// Check for correct number of values
					if (data.length == 4) {
						boolean valid = true;

						String sensorId = data[1].trim();
						String district = data[2].trim();
						LocalDate date = null;
						double pm25 = 0;

						try {
							date = LocalDate.parse(data[0].trim());
						} catch (DateTimeParseException err) {
							errorTxt.append("Line " + lineCount + ": " + "Invalid Reading Date\n");
							valid = false;
						}

						if (sensorId.isEmpty()) {
							errorTxt.append("Line " + lineCount + ": " + "Invalid Sensor ID\n");
							valid = false;
						}

						if (district.isEmpty()) {
							errorTxt.append("Line " + lineCount + ": " + "Invalid District\n");
							valid = false;
						}

						try {
							pm25 = Double.parseDouble(data[3].trim());
						} catch (NumberFormatException err) {
							errorTxt.append("Line " + lineCount + ": " + "Invalid PM2.5\n");
							valid = false;
						}

						if (valid) {
							try {
								readings.add(new AirQualityReading(sensorId, district, date, pm25));
							}
							catch (AirQualityDataException err) {
								errorTxt.append("Line " + lineCount + ": " + err.getMessage() + "\n");
							}
						}
					}
				}
			}

			writer.print(errorTxt.toString());

		} catch (FileNotFoundException err) {
			System.out.println("File does not exist.");
		} finally {
			if (reader != null) {
				reader.close();
			}

			if (writer != null) {
				writer.close();
			}
		}
	}

	public int getSize() {
		return readings.size();
	}

	@Override
	public String toString() {
		Analyser analyser = new DistrictAirQualityAnalyser();
		HashMap<String, Double> results = analyser.process(readings);

		StringBuilder output = new StringBuilder();

		for (String key : results.keySet()) {
			output.append(String.format(
					"%s : %.2f%n",
					key,
					results.get(key)
			));
		}

		return output.toString();
	}

	public void process(Analyser analyser) {
		PrintWriter writer = null;

		try {
			writer = new PrintWriter(new File(resFileName));

			HashMap<String, Double> processed = analyser.process(readings);

			for (String key : processed.keySet()) {
				writer.println(key + " : " + processed.get(key));
			}

		} catch (FileNotFoundException err) {
			System.out.println("File not found");
		} finally {
            if (writer != null) {
				writer.close();
			}
        }
	}

	public static void main(String[] args) {
		CityAirStat app = new CityAirStat();
		app.load("data/ass_3_data.csv");

		Analyser analyser = new DistrictAirQualityAnalyser();
		app.process(analyser);
	}
}