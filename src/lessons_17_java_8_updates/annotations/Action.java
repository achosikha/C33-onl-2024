package lessons_17_java_8_updates.annotations;

@FunctionalInterface
public interface Action {
    String sound(String message);
}