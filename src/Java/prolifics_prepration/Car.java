package Java.prolifics_prepration;

public class Car extends Vehicle{
    public void start() {
        System.out.println("Self-start");
    }
    public void isEV() {
        System.out.println("No it is not an EV inside car class");
    }
    public void wheels() {
        System.out.println("Car has 4 wheels");
    }

    public void mileage() {
        System.out.println("depends upon car and it's company");
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.isEV();
        Vehicle vehicle1 = new Vehicle();
        vehicle1.isEV();
    }
}
