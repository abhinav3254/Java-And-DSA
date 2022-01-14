package Java.ExceptionHandling;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            String name = "Abhinav";
            if(name.equals("Abhinav")){
                throw new Exception("Name is Abhinav");
            }
        } catch (MyException e){
            System.out.println(e.getMessage());
        }
    }
}

