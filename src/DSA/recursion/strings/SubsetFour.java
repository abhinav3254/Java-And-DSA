package DSA.recursion.strings;

public class SubsetFour {
    public static void main(String[] args) {
        subset("ab","");
        System.out.println("Total Number of subsets are as follows :- "+count);
    }
    private static int count = 0;
    private static void subset(String name , String newName) {
        if(name.isEmpty()) {
            System.out.println(newName);
            count++;
            return;
        }

        char ch = name.charAt(0);
        subset(name.substring(1),newName+ch);
        subset(name.substring(1),newName);
    }
}
