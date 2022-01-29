package DSA.recursion.strings;

public class SelfTwo {
    public static void main(String[] args) {
        System.out.println(remove("abhinav","",0));
    }
    public static String remove(String name,String newName,int index){
        if(name.length()==index){
            return newName;
        }
        if(name.charAt(index)=='b'){
            return remove(name,newName,index+1);
        } else{
            return remove(name,newName+name.charAt(index),index+1);
        }
    }
}
