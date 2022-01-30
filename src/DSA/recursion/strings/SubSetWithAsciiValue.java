package DSA.recursion.strings;

public class SubSetWithAsciiValue {
    private static void subsetWithAscii(String name,String newName){
        if(name.isEmpty()){
            System.out.println(newName);
            return;
        }
        char ch = name.charAt(0);
        subsetWithAscii(name.substring(1),newName+ch);
        subsetWithAscii(name.substring(1),newName);
        subsetWithAscii(name.substring(1),newName+(ch+0));
    }

    public static void main(String[] args) {
        subsetWithAscii("ab","");
    }
}
