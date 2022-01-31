package DSA.recursion.practise;

public class RemoveCharInString {
    public static void main(String[] args) {
        System.out.println(remove("abhinav",'a',""));
    }
    private static String remove(String name,char ch,String newName){
        if(name.isEmpty()){
            return newName;
        }
        char c = name.charAt(0);
        if(c == ch){
            return remove(name.substring(1),ch,newName);
        }
        return remove(name.substring(1),ch,newName+c);
    }
}
