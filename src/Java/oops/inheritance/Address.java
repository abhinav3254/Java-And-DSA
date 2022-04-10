package Java.oops.inheritance;

public class Address {
    int houseNumber;
    int pinCode;
    String city;
    String country;

    public Address(int houseNumber, int pinCode, String city, String country) {
        this.houseNumber = houseNumber;
        this.pinCode = pinCode;
        this.city = city;
        this.country = country;
    }

    public Address() {
        this.houseNumber = 0;
        this.pinCode = 0;
        this.city = null;
        this.country = null;
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseNumber=" + houseNumber +
                ", pinCode=" + pinCode +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
