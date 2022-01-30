package DSA.recursion.strings;

import java.util.ArrayList;

public class SubSet2 {
    static int size = 0;
    private static final ArrayList<String> list = new ArrayList<>();
    private static void subset(String name,String newName){
        if(name.isEmpty()){
            size++;
            list.add(newName);
            return;
        }
        char ch = name.charAt(0);
        subset(name.substring(1),newName+ch);
        subset(name.substring(1),newName);
    }

    public static void main(String[] args) {
        subset("abhinav","");
        System.out.println("Number of subset possible is "+size);
        System.out.println(list);

    }
}
