package DSA.recursion.practise;

public class SubStringOne {
    public static void main(String[] args) {
        subset("ab","");
    }
    private static void subset(String name,String newName){
        if(name.isEmpty()){
            System.out.println(newName);
            return;
        }
        char ch = name.charAt(0);
        subset(name.substring(1),newName+ch);
        subset(name.substring(1),newName);
    }
}
