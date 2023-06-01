package Abstraction;

public class One {
    public static void main(String[] args) {
        Shape shape = new Square();
        shape.drawShape();
    }
}

abstract class Shape {
    Shape () {
        System.out.println("This is abstract class Shape");
    }
    abstract void drawShape();
}

class Square extends Shape{
    @Override
    void drawShape() {
        System.out.println("Drawing Square");
    }
}