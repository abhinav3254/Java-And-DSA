package Java.prolifics_prepration.abstraction;

public class One {
    static abstract class Java {
        abstract public void check();
        public void doubleMain() {
            System.out.println("Method name double main is not an abstract method inside abstract class");
        }
    }

    static class Two extends Java{
        @Override
        public void check() {
            System.out.println("This is an check method which used to be an abstract method inside the Java class");
        }

        public static void main(String[] args) {
            Two two = new Two();
            two.check();
        }
    }
}
