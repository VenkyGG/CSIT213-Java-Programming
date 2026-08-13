package Assignments.A3;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class CityAirStat {

	public CityAirStat() {

	}

	public void load(String fileName) {
		Scanner reader = null;

		try {
			reader = new Scanner(new File(fileName));

			while (reader.hasNextLine()) {
				String currLine = reader.nextLine();

				// Check for Comment Lines
				if (!currLine.contains("#")) {
					// Split the lines
					String[] data = currLine.split(",");

					// Check for correct number of values
					if (data.length == 4) {
						//System.out.println(data[0] + " " + data[1] + " " + data[2] + " " + data[3]);
						try {
							String sensorId = data[1];
							String district = data[2];
							LocalDate date = LocalDate.parse(data[0]);
							double pm25 = Double.parseDouble(data[3]);

							AirQualityReading tmp = new AirQualityReading(sensorId, district, date, pm25);
							System.out.println(tmp);
						}
						catch (DateTimeParseException | NumberFormatException | AirQualityDataException err) {
							System.out.println(err);
						}
					}
				}
			}

		} catch (FileNotFoundException err) {
			System.out.println("File does not exist.");
		} finally {
			if (reader != null) {
				reader.close();
			}
		}
	}

	public int getSize() {
		return 0;
	}

	@Override
	public String toString() {
		return String.format("None");
	}

	public void process(Analyser analyser) {

	}

	public static void main(String[] args) {
		CityAirStat app = new CityAirStat();
		app.load("data/ass_3_data.csv");

		Analyser analyser = new DistrictAirQualityAnalyser();
		app.process(analyser);
	}
}