package DSA.recursion.strings;

public class RemoveASelf {
    private static String removeA(String name,String newName){
        if(name.isEmpty()){
            return newName;
        }
        char ch = name.charAt(0);
        if(ch=='a'){
            return removeA(name.substring(1),newName);
        } else{
            return removeA(name.substring(1),newName+ch);
        }
    }

    public static void main(String[] args) {
        String ans = removeA("abhinav","");
        System.out.println(ans);
    }
}
