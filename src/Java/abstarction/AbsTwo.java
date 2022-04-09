package Java.abstarction;

public class AbsTwo {

    public static void main(String[] args) {
        BMW bmw = new BMW();
        YamahaRX100 yamahaRX100 = new YamahaRX100();

        System.out.println("::--:: This is BMW Car ::--::");
        bmw.start();
        bmw.engine();
        bmw.isElectric();
        bmw.stop();

        System.out.println("::--:: This is Yamaha RX 100 ::--::");

        yamahaRX100.start();
        yamahaRX100.engine();
        yamahaRX100.isElectric();
        yamahaRX100.stop();
    }

}

abstract class Vehicle {
    public abstract void engine();
    public abstract void start();
    public void stop() {
        System.out.println("Stops With Key");
    }

    public abstract void isElectric();
}

class BMW extends Vehicle {
    @Override
    public void engine() {
        System.out.println("BMW has 4400 hp engine");
    }

    @Override
    public void start() {
        System.out.println("Starts With Keys");
    }

    @Override
    public void isElectric() {
        System.out.println("Yes it has an Electric Car");
    }
}

class YamahaRX100 extends Vehicle {
    @Override
    public void start() {
        System.out.println("Starts with Kick");
    }

    @Override
    public void engine() {
        System.out.println("It has 500 hp engine");
    }

    @Override
    public void isElectric() {
        System.out.println("No it is not an Electric Engine");
    }
}
