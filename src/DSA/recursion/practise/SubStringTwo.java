package DSA.recursion.practise;

import java.util.List;

public class SubStringTwo {
    public static void main(String[] args) {
        letterCombinations("abcdef","");
    }
    static List<String> list;
    private static void letterCombinations(String name , String newName){
        if(name.isEmpty()){
            System.out.println(newName);
            return;
        }
        char ch = name.charAt(0);
        letterCombinations(name.substring(1),newName+ch);
        letterCombinations(name.substring(1),newName);
    }
}
