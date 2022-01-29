package DSA.recursion.strings;

public class SelfOne {
    public static String remove(String name, String newString, int index){
        if(index==name.length()){
            return newString;
        }
        if(name.charAt(index) != 'a'){
            return remove(name,newString+name.charAt(index),index+1);

        } else {
            return remove(name,newString,index+1);
        }
    }

    public static void main(String[] args) {
        String ans = remove("abhinav","",0);
        System.out.println(ans);
//        String name = "name";
//        System.out.println(name.length());
    }
}
