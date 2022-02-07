package DSA.recursion_assignments;

public class LengthOfAString {
    public static void main(String[] args) {
        length("ab",0);
    }
    private static void length(String name,int length) {
        if(name.isEmpty()){
            System.out.println(length);
            return;
        }
        length(name.substring(1),length+1);
    }
}
