package lesson_11_repetition_strings;

public class RAM {
    private final String ramType;
    private final double ramSize;

    public RAM(String ramType, double ramSize) {
        this.ramType = ramType;
        this.ramSize = ramSize;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "ramType='" + ramType + '\'' +
                ", ramSize=" + ramSize +
                '}';
    }
}