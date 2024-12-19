package lesson_9_polymorphism_abstract.interfacepanel;

public class PanelComputer extends Panel{
    public PanelComputer(String name) {
        super(name);
    }

    @Override
    public void turnOnTimer() {}

    @Override
    public void turnOffTimer() {}

    @Override
    public void startTimer() {}

    @Override
    public void stopTimer() {}

    @Override
    public void vipService() {}

    @Override
    public void turnOn() {
        System.out.println("Turn on your panel computer.");
    }

    @Override
    public void turnOff() {}

    @Override
    public void start() {}

    @Override
    public void stop() {}

    @Override
    public void getMethodWithDefaultBody() {
        System.out.println("This method is default but I still overloaded it...");
    }
}
