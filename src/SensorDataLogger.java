import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;


public class SensorDataLogger {
    private static final int SENSOR_PIN = 1;

    private static final int INTERVAL_MS=4000;

    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new SensorDataReadingTask(),1000,INTERVAL_MS);
}
    static class SensorDataReadingTask extends TimerTask {
        @Override
        public void run() {
            int sensorData = readSensorData();

            // Store data in flash memory
            storeDataInFlash(sensorData);
        }

        private int readSensorData() {

            int random = (int) (Math.random() * 10);


            return random;
        }

        private void storeDataInFlash(int sensorData) {
            // Simulate storing data in flash memory
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(sensorData);

            System.out.println("Storing data " + sensorData + " in flash memory at address " +numbers.hashCode());
        }
    }
}
