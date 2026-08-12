package Assignments.A3;

public class CityAirStat {

	public CityAirStat() {

	}

	public void load(String fileName) {
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
		app.load("data.csv");

		Analyser analyser = new DistrictAirQualityAnalyser();
		app.process(analyser);
	}

}
