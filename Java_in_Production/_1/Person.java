package Develhope_Exercise.Java_in_Production._1;

public record Person(String name, int age, int address) {
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}