package Assignments.A3;

import java.util.ArrayList;
import java.util.HashMap;

public interface Analyser {
    public HashMap<String, Double> process(ArrayList<AirQualityReading> data);
}
