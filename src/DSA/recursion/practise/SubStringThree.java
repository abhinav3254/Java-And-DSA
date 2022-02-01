package DSA.recursion.practise;

public class SubStringThree {
    public static void main(String[] args) {
        subString("ab","");
        System.out.println("Total subsets are:- "+count);
    }
    static int count ;
    private static void subString(String name , String newName){
        if(name.isEmpty()){
            System.out.println(newName);
            count++;
            return;
        }
        char ch = name.charAt(0);
        subString(name.substring(1),newName+ch);
        subString(name.substring(1),newName);
    }
}
