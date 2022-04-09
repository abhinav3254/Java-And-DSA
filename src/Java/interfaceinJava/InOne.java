package Java.interfaceinJava;

public class InOne {
    public static void main(String[] args) {
        Car car = new Car();
        car.Wheels();
        car.starts();
    }
}

interface Vehicle {
    public void Wheels();
    public void starts();
//    We can define here anything
}

class Car implements Vehicle {
    @Override
    public void Wheels() {
        System.out.println("Has 4 wheels");
    }

    @Override
    public void starts() {
        System.out.println("Starts With Self");
    }
}


