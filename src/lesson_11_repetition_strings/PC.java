package lesson_11_repetition_strings;

public class PC {
    private final HDD hdd;
    private final RAM ram;

    public PC(HDD hdd, RAM ram){
        this.hdd = hdd;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "PC{" +
                "hdd=" + hdd +
                ", ram=" + ram +
                '}';
    }
}