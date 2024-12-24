package lesson_10_interfaces_object.intertypes;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

public class InterfaceTypes implements BasicTypeInterface,
                                        FunctionalTypeInterface,
                                        MarkerTypeInterface,
                                        Cloneable,
                                        Serializable,
                                        Comparable,
                                        Comparator,
                                        CloneMyClass{
    // Serializable -> no obligations, just a message we can use serialization as an object save approach
    private String basicMessage;
    private String compareMessage;
    private int mainIntegerDigit;
    private double mainDoubleDigit;

    public InterfaceTypes(String basicMessage, String compareMessage,
                          int mainIntegerDigit, double mainDoubleDigit) {
        this.basicMessage = basicMessage;
        this.compareMessage = compareMessage;
        this.mainIntegerDigit = mainIntegerDigit;
        this.mainDoubleDigit = mainDoubleDigit;
    }

    public InterfaceTypes(InterfaceTypes t){
        this.basicMessage = t.basicMessage;
        this.compareMessage = t.compareMessage;
        this.mainIntegerDigit = t.mainIntegerDigit;
        this.mainDoubleDigit = t.mainDoubleDigit;

        // this.array = t.array;
        // Array copy
    }

    public String getBasicMessage() {
        return basicMessage;
    }

    // Basic Interface Type
    @Override
    public void showText(String text) {
        System.out.println("You have passed via interface the following text: " + text);
    }

    @Override
    public void compareText(String text) {
        System.out.println("You have passed a String value called text. It equals: " + text);
        System.out.println("You also have a class variable String compareMessage: " + this.compareMessage);
        System.out.println("Are these Strings equal: " + (text.equals(this.compareMessage)));
    }

    @Override
    public void showDigits(int integerValue, double doubleValue) {
        System.out.println("You have passed an integer value: " + integerValue);
        System.out.println("You have passed a double value: " + doubleValue);
        System.out.println("You also have a class variable of integer: " + this.mainIntegerDigit);
        System.out.println("You also have a class variable of double: " + this.mainDoubleDigit);
        System.out.println("integerValue compare to mainIntegerDigit: " + (integerValue == this.mainIntegerDigit));
        System.out.println("doubleValue compare to mainDoubleDigit: " + (integerValue == this.mainDoubleDigit));
    }

    // Functional type Interface
    @Override
    public boolean compareOnlyThis(InterfaceTypes t) {
        // Interface which we can apply to our object precisely
        if (this.compareMessage.equals(t.compareMessage) && this.basicMessage.equals(t.basicMessage)
        && this.mainDoubleDigit == t.mainDoubleDigit && this.mainIntegerDigit == t.mainIntegerDigit){
            return true;
        }

        return false;
    }

    // Interface Cloneable tells a compiler that a method clone() from super class Object can be implemented
    // But there is no actual need to provide the new realization;
    // If you don't provide method body why do you implement it?!
    @Override
    public InterfaceTypes clone() {
        try {
            InterfaceTypes clone = (InterfaceTypes) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    // Blunt ineffective comparison
    // Check how it works
    // Comparable functional interface just to compare
    @Override
    public int compareTo(Object o) {
        return 0;
    }

    // Comparator more methods and possibilities
    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

    @Override
    public void makeClone(InterfaceTypes t) {
        this.basicMessage = t.basicMessage;
        this.compareMessage = t.compareMessage;
        this.mainDoubleDigit = t.mainDoubleDigit;
        this.mainIntegerDigit = t.mainIntegerDigit;

        // If we are trying to manually copy array = Arrays.copy
    }

    public void getGeneralMsg(){
        System.out.println(this.basicMessage);
        System.out.println(this.compareMessage);
        System.out.println(this.mainIntegerDigit);
        System.out.println(this.mainDoubleDigit);
    }

    public void setBasicMessage(String basicMessage) {
        this.basicMessage = basicMessage;
    }
}
