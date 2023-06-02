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

        Dog dog = new Dog("JOJO","German");
        Dog dog1 = new Dog("XOXO","Mustiff");

        System.out.println("Before modification");
        dog.show();
        dog1.show();

        System.out.println("after modification");
        dog.setName("UOUO");
        dog.setBreed("Indian");

        dog1.setName("UOUO-1");
        dog1.setBreed("Indian-1");

        dog.show();
        dog1.show();
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

// 2. Write a Java program to create a class called "Dog" with a name and breed attribute. Create two instances of the "Dog" class, set their attributes
//    using the constructor and modify the attributes using the setter methods and print the updated values.

class Dog {
    String name;
    String breed;

    Dog(String name,String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed (String breed) {
        this.breed = breed;
    }

    public void show() {
        System.out.println("Name is :- "+name+" and Breed is :- "+breed);
    }
}