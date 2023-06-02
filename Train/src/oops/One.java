package oops;

public class One {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.voice();
    }
}

class Animal {
    int leg;
    public void voice(){
        System.out.println("This is animal voice");
    };
}

class Dog extends Animal {
}
