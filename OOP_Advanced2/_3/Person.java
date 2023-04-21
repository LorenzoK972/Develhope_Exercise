package Develhope_Exercise.OOP_Advanced2._3;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private int address;
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getAddress());
    }
    public Person(String name, int age, int address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
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
    public int getAddress() {
        return address;
    }
    public void setAddress(int address) {
        this.address = address;
    }

}
