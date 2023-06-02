package practise;


// question statement

//1. Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of
//   the "Person" class, set their attributes using the constructor, and print their name and age.
public class One {
    public static void main(String[] args) {
        Person anil = new Person("Anil",18);
        Person vijay = new Person("Vijay",22);
        anil.show();
        vijay.show();
    }
}
class Person {
    String name;
    int age;

    Person (String name,int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println("{\nname: "+name+"\nage: "+age+"\n}\n");
    }
}