package Java.ExceptionHandling;

public class ExceptionHandlingOne {
    public static void main(String[] args) throws Exception {
        int a = 10;
        int b = 0;
        try{
            int c = a/b;
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This block will get Executed");
        }

        try{
            System.out.println(sum(a,b));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    static int sum(int a,int b) throws Exception {
        if(b==0){
            throw new Exception("Denominator must not be Zero");
        } else {
            return a/b;
        }
    }
}
