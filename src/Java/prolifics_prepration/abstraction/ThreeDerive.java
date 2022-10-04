package Java.prolifics_prepration.abstraction;

public class ThreeDerive implements Three{
    @Override
    public void mm() {
        System.out.println("This is mm method");
    } public void ss() {
        System.out.println("This is ss method");
    }

    public static void main(String[] args) {
        ThreeDerive threeDerive = new ThreeDerive();
        threeDerive.mm();
        threeDerive.ss();
    }
}
