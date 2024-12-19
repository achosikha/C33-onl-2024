package lesson_8_polymorphism.keyfinal;

public final class Person {
    private String name;
    private String surname;
    private final String sex;
    private int age;
    private long telephoneNumber;
    private long mobileNumber;

    public Person(String name, String surname, String sex, int age, long telephoneNumber, long mobileNumber){
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.age = age;
        this.telephoneNumber = telephoneNumber;
        this.mobileNumber = mobileNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setTelephoneNumber(long telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getSex() {
        return sex;
    }
}
