package lesson_7_oop_princinples;

public class PC {
    // by default package-private
    // package level
    // public String processor;
    private String processor;
    private int ram; // directly accessible only in the class itself
    private int hdd;
    private String cooler;
    private String vga;

    //protected int hdd;
    //public String cooler; // open to everyone everywhere, no restrictions
    //String vga; // by default, package-private

    public PC(String processor, int ram, int hdd, String cooler, String vga){
        this.processor = processor;
        this.ram = ram;
        this.hdd = hdd;
        this.cooler = cooler;
        this.vga = vga;
    }

    // setter for processor
    public void setProcessor(String processor){
        this.processor = processor;
    }

    // getter for processor
    public String getProcessor(){
        return this.processor;
    }

    public int getHdd() {
        return hdd;
    }

    public String getCooler() {
        return cooler;
    }

    public void setCooler(String cooler) {
        this.cooler = cooler;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    @Override
    public String toString() {
        return "PC:\n" +
                "Processor ='" + processor + '\'' + "\n" +
                "RAM =" + ram + "\n" +
                "HDD =" + hdd + "\n" +
                "Cooler ='" + cooler + '\'' + "\n" +
                "VGA ='" + vga + '\'';
    }

    // Used in rare cases when you need to hide existence of such method at all
    private void hiddenMethod(){
        //
    }

    public void callHiddenMethod(){
        hiddenMethod();
    }
}
