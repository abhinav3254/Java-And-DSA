package out.production.Train.rough;

public class Two {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();
    }
}

interface Animal {
    public void makeSound();
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("meow-meow");
    }
}
