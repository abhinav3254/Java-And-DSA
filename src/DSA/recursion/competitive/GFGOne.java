package DSA.recursion.competitive;

// https://www.geeksforgeeks.org/recursive-solution-count-substrings-first-last-characters/

//https://ide.geeksforgeeks.org/rgdSstxuPW --> My Solution

import java.util.ArrayList;

public class GFGOne {
    public static void main(String[] args) {
        num("aba","");
        System.out.println(list.toString());
        System.out.println(count);
    }
    private static ArrayList<String> list = new ArrayList<>();
    private static int count = 0;
    private static void num(String name , String newName) {
        if(name.isEmpty()) {
            if((newName.length() == 0) || (newName.charAt(0) == newName.charAt(newName.length()-1))){
                list.add(newName);
                count++;
            }
            return;
        }

        var ch = name.charAt(0);
        num(name.substring(1),newName+ch);
        num(name.substring(1),newName);
    }
}
