package DSA.recursion.pattern;

public class SubSet2 {
    static void subSetString(String name,String newName){
        if(name.isEmpty()){
            System.out.println(newName);
            return;
        }
        char ch = name.charAt(0);
        subSetString(name.substring(1),newName+ch);
        subSetString(name.substring(1),newName);
    }

    public static void main(String[] args) {
        subSetString("ab","");
    }
}
