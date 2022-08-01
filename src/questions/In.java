package questions;

public class In {
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println(check(12));
    }

    public static boolean check(int n) {
        if((n&1)==0) {
            return true;
        } else {
            return false;
        }
    }
}
