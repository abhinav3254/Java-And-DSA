package DSA.recursion_assignments;

// https://www.geeksforgeeks.org/first-uppercase-letter-in-a-string-iterative-and-recursive/

public class Q3FirstUppercaseLetterInAString {
    public static void main(String[] args) {
        isUpper("abHinav","");
    }
    private static void isUpper(String name,String newName){
        if(name.isEmpty()) {
            System.out.println(newName);
            return;
        }
        char ch = name.charAt(0);
        if(Character.isUpperCase(ch)) {
            isUpper(name.substring(1),newName+ch);
        }else {
            isUpper(name.substring(1),newName);
        }
    }
}
