package DSA.recursion.practise;

public class ReverseOfNumbersOne {
    public static void main(String[] args) {
        String n = "1234";
        System.out.println(rev(n));
    }
    public static String rev(String name) {
        if(name.isEmpty()) {
            return "";
        }
        char ch = name.charAt(name.length()-1);
        return ch+rev(name.substring(0,name.length()-1));
    }
}
