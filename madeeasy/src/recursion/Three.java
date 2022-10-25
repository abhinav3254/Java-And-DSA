package recursion;

public class Three {
    public static void main(String[] args) {
        String s = "geeksforgeeKs";
        System.out.println(isUpper(s,0,""));
    }
    public static String isUpper (String s,int i,String n) {
        if (i==s.length())
            return n;
        if (Character.isUpperCase(s.charAt(i)))
            n = n+s.charAt(i);
        return isUpper(s, i+1, n);
    }
}
