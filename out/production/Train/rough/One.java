package out.production.Train.rough;

public class One {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("This is finally block");
        }
    }
}
