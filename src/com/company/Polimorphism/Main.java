package com.company.Polimorphism;

public class Main {
    public static void main(String[] args) {

        /* Shape circle = new Circle();
        circle.draw();

        Shape triangle = new Triangle();
        triangle.draw();

        Shape square = new Square();
        square.draw();
        */


        Shape[] arr = new Shape[] {new Circle(), new Square(), new Triangle()};
        for (int i = 0; i < arr.length; i++){
            arr[i].draw();
        }
    }
}
