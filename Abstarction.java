package com.polymorphism.Abstraction;

abstract class Shape {
    abstract void draw();  // only idea, no body
}

    class Circle extends Shape {
        void draw() {
            System.out.println("Drawing Circle");
        }
    }

    class Square extends Shape {
        void draw() {
            System.out.println("Drawing Square");
        }
    }

public class Abstarction {
        public static void main(String[] args) {
            Shape s1 = new Circle(); // abstraction
            Shape s2 = new Square();

            s1.draw();
            s2.draw();
        }
    }
