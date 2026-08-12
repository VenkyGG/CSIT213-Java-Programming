package Assignments.A3;

public class AirQualityDataException extends Exception {
    public AirQualityDataException(String errMsg) {
        super(errMsg);
    }

    public AirQualityDataException(String errMsg, Throwable err) {
        super(errMsg, err);
    }
}
