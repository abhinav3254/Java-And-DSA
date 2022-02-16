package DSA.recursion_assignments;

// Q link :- https://practice.geeksforgeeks.org/problems/subset-sums2234/1/?category[]=Recursion&category[]=Recursion&difficulty[]=-1&page=1&query=category[]Recursiondifficulty[]-1page1category[]Recursion

import java.util.ArrayList;

public class SubsetSumsGFG {
    public static void main(String[] args) {
        subsetSum("23","");
    }
    static ArrayList<String> list = new ArrayList<>();
    private static void subsetSum(String up, String p) {
        if(up.isEmpty()) {
            System.out.print(p+" ");
            list.add(up);
            return;
        }
        char ch = up.charAt(0);
        subsetSum(up.substring(1),p+ch);
        subsetSum(up.substring(1),p);
    }
}
