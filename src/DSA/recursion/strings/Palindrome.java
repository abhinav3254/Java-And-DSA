package DSA.recursion.strings;

public class Palindrome {
    public static void main(String[] args) {
        pali();
    }
    private static void pali(){
        String name = "acba";
        var name2 = pali1(name,"");
        if(name.equals(name2))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    private static String pali1(String name,String newName) {
        if(name.isEmpty()){
            return newName;
        }
        char ch = name.charAt(0);
        return pali1(name.substring(1),ch+newName);
    }
}