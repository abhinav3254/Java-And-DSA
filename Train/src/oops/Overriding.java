package oops;

public class Overriding {
    public static void main(String[] args) {
        Parent parent = new SubClass();
        parent.showName("Ravish");

//        Here Object is from child class so it parent reference will refer to all the methods of Child class only
    }
}

class Parent {
    public void showName(String name) {
        System.out.println("Hello "+name+" from parent class");
    }
}

class SubClass extends Parent{
    public void showName(String name) {
        System.out.println("Hello "+name+" from child class");
    }
}
