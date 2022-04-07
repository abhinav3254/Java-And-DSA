package Java.achal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vehicle {

    private String registrationNo;
    private int modelNo;

    public Vehicle () {
        this.modelNo = 0;
        this.registrationNo = null;
    }

    public Vehicle(String registrationNo, int modelNo) {
        this.registrationNo = registrationNo;
        this.modelNo = modelNo;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public int getModelNo() {
        return modelNo;
    }

    public void setModelNo(int modelNo) {
        this.modelNo = modelNo;
    }
}

class Car extends Vehicle {

    public Car(String registrationNo, int modelNo) {
        super(registrationNo, modelNo);
    }

    private String name;
    private String color;

    public Car(String registrationNo, int modelNo, String name, String color) {
        super(registrationNo, modelNo);
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        String name = "Registration No :"+super.getRegistrationNo()+"\nModel no: "+super.getModelNo()+"\nCar Name "+this.getName()+"\nColor"+this.getColor();
        return name;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String registrationNo = br.readLine();
        String model = br.readLine();
        String name = br.readLine();
        String color = br.readLine();


        Car car = new Car(registrationNo,Integer.parseInt(model),name,color);
        System.out.println(car);

    }
}