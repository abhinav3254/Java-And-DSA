package Java.abstarction;

public class AbsOne {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.draw();

        Circle circle = new Circle();
        circle.draw();
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Hello There this is Rectangle");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("This is Circle");
    }
}

abstract class Shape  {
    public abstract void draw();
}
