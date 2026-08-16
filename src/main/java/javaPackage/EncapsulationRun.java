package javaPackage;

public class EncapsulationRun extends Encapsulation {
    public static void main(String[] args) {
        EncapsulationRun obj = new EncapsulationRun();
        obj.setName("John");
        obj.setAge(30);

        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
    }
}
