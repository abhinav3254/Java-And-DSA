package DSA.recursion.practise;

public class SubStringWithASCII {
    public static void main(String[] args) {
        subString("ab","");
    }
    private static void subString(String name,String newName){
        if(name.isEmpty()){
            System.out.println(newName);
            return;
        }

        char ch = name.charAt(0);
        subString(name.substring(1),newName+ch);
        subString(name.substring(1),newName);
        subString(name.substring(1),newName+(ch+0));
    }
}
