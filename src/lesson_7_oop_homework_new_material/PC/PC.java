package lesson_7_oop_homework_new_material.PC;

// PC has a processor
// PC has a vga
// PC has ...
// Composition
public class PC {
    // has a - relations between Basic Class (PC) and its parts (Processor, RAM...)
    private Processor processor;
    private VGA vga;
    private RAM ram;
    private Cooler cooler;

    public PC(Processor processor, VGA vga, RAM ram, Cooler cooler){
        this.processor = processor;
        this.vga = vga;
        this.ram = ram;
        this.cooler = cooler;
    }

    @Override
    public String toString() {
        return "Your PC has: \n" +
                "\t\tProcessor: \n" + this.processor + "\n" +
                "\tVGA: \n" + this.vga + "\n" +
                "\tRAM: \n" + this.ram + "\n" +
                "\tCooler: \n" + this.cooler + "\n";
    }
}
