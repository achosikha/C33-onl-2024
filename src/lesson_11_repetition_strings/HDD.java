package lesson_11_repetition_strings;

public class HDD {
    private final String hddName;
    private final double capacity;

    public HDD(String hddName, double capacity) {
        this.hddName = hddName;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "HDD{" +
                "hddName='" + hddName + '\n' +
                ", capacity=" + capacity + "\n" +
                '}';
    }
}
