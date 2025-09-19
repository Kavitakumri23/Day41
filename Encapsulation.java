package com.polymorphism.Encapsulation;

class Student {
    private String name;   // data hidden
    private int age;

    // public getters and setters
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
        if (age > 0) {
            this.age = age;
        }
    }
}

public class Encapsulation {
        public static void main(String[] args) {
            Student s = new Student();
            s.setName("Rahul");
            s.setAge(20);

            System.out.println(s.getName() + " " + s.getAge());
        }
    }

