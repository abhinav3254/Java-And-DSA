package DSA.recursion.practise;

public class DiceRollOne {
    public static void main(String[] args) {
        rollDice("",2);
    }
    private static void rollDice(String newName , int target) {
        if(target == 0){
            System.out.println(newName);
            return ;
        }
        for (int i = 1; i <=target; i++) {
            rollDice(newName+i,target-i);
        }
    }
}
