package DSA.recursion.practise;

import java.util.ArrayList;

public class DicePractiseTwo {
    public static void main(String[] args) {
        diceRoll("",5);
        System.out.println(list.toString());
    }
    private static ArrayList<String> list = new ArrayList<>();
    private static void diceRoll(String newName , int num) {
        if(num == 0){
            list.add(newName);
            return;
        }

        for(int i = 1;i<=num;i++){
            diceRoll(newName+i,num-i);
        }
    }
}
