package javaPackage;

public class Encapsulation {
    // Encapsulation is a fundamental concept in object-oriented programming that involves bundling data and methods that operate on that data into a single unit, typically a class.
    // It restricts direct access to some of an object's components, which can prevent the accidental modification of data. This is usually achieved by making class variables private and providing public getter and setter methods to access and modify those variables.

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
