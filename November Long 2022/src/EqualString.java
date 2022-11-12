public class EqualString {
    static String leastLexiString(String s)
    {
        if (s.length() == 1)
            return s;

        String x = leastLexiString(s.substring(0,
                s.length() / 2));
        String y = leastLexiString(s.substring(s.length() / 2));

        return String.valueOf((x + y).compareTo(y + x));
    }

    static boolean areEquivalent(String a, String b)
    {
        return !(leastLexiString(a).equals(leastLexiString(b)));
    }
    public static void main(String[] args)
    {
        String a = "aaba";
        String b = "abaa";
        if (areEquivalent(a, b))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
