package oops;

public class Vehicle {
    int tyre;
    int pass;

    public Vehicle(int tyre, int pass) {
        this.tyre = tyre;
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "tyre=" + tyre +
                ", pass=" + pass +
                '}';
    }
}

class Demo extends Vehicle {
    public Demo(int tyre, int pass) {
        super(tyre, pass);
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(4,8);
        System.out.println(vehicle.toString());

//        Creating a same reference as of vehicle
        Vehicle vehicle1 = vehicle;

        System.out.println(vehicle1.toString());

    }
}
