package sorting.cropmonitor;

public class SensorData {
    long timestamp;     // time of reading
    double temperature; // soil temperature

    public SensorData(long timestamp, double temperature) {
        this.timestamp = timestamp;
        this.temperature = temperature;
    }
}
