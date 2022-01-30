package DSA.recursion.strings;

import java.util.ArrayList;

public class ArrayListOfString {
    static ArrayList<String> list = new ArrayList<>();

    private static void subSet(String name,String newName){
        if(name.isEmpty()){
            list.add(newName);
            return;
        } char ch = name.charAt(0);
        subSet(name.substring(1),newName+ch);
        subSet(name.substring(1),newName);
    }

    public static void main(String[] args) {
        subSet("ab","");
        System.out.println(list.toString());
    }
}
