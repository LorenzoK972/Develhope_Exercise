package Develhope_Exercise.OOP._2;

public class Student {
    String name = null;
    int age = 0;
    Student(String name, int age) {
        System.out.println("Constructing...");
        this.name = name;
        this.age = age;
        System.out.println("Constructed!");
        System.out.println(this.name + " " + this.age);
    }

    Student (String name) {
        this.name = name;
        System.out.println(this.name);
    }

    Student (int age) {
        this.age = age;
        System.out.println(this.age);
    }

    Student() {
        System.out.println("Nothing to print");
    }
}
