package Java.cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human abhinav = new Human(20,"Abhinav");
//        Human twin = new Human(abhinav);

        Human twin = (Human)abhinav.clone();

        System.out.println(twin.age+" "+twin.name);
    }
}
