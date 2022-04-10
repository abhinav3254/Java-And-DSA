package Java.oops.inheritance;

public class School {
    int rollNumber;
    String name;
    int age;
    int classN;
    Address address;

    public School(Address address) {
        this.address = address;
    }

    public School(int rollNumber, String name, int age, int classN, Address address) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.classN = classN;
        this.address = address;
    }

    @Override
    public String toString() {
        return "name: "+name+"roll Number is : "+rollNumber+"age : "+age+"class : "+classN+"address is: "+address.toString();
    }
}

class Ravi extends School {

    public Ravi(Address address) {
        super(address);
    }

    public static void main(String[] args) {
        Address address = new Address(26,947405,"Bhopal","India");
        School school = new School(address);
        System.out.println(school);
    }
}
