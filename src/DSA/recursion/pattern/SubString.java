package DSA.recursion.pattern;

public class SubString {

    static void subStringMethod(String name,String newName, int index) {
        if(index==name.length()){
            System.out.println(newName);
            return;
        }
        subStringMethod(name,newName+name.charAt(index),index+1);
        subStringMethod(name,newName,index+1);
    }

    public static void main(String[] args) {
//        subStringMethod("abhinav","",0);
        subStringMethod("ab","",0);
//        String name = "ab";
//        System.out.println(name.length());
    }
}
