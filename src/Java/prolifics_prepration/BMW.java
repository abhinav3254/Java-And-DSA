package Java.prolifics_prepration;

public class BMW extends Car {
    public void isEV() {
        System.out.println("Yes BMW A-8 is an EV");
    }
    public void start() {
        System.out.println("has a feature of self start in bmw");
    }
    public void wheels () {
        System.out.println("in bmw we have 4 wheels");
    }
    public void mileage() {
        System.out.println("BMW has a mileage of 40 km/l ");
    }

    public static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.isEV();
        bmw.mileage();
        bmw.start();
        bmw.wheels();

        Car car = new BMW();
        car.isEV();

        Vehicle vehicle = new BMW();
        vehicle.isEV();
//        It accesses only those which are on the right side of the = symbol
    }
}
