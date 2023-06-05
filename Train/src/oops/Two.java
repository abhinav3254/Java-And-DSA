package oops;

public class Two extends OneAbstract {
    @Override
    void oneMethod() {
        System.out.println("Abstract method");
    }

    public static void main(String[] args) {
        Two two = new Two();
        two.oneMethod();
    }
}

abstract class OneAbstract {
    int a;
    abstract void oneMethod ();
}
