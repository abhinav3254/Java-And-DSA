package DSA.recursion.practise;

public class PatternOnePractise {
    public static void main(String[] args) {
        patternOne(4,0);
    }

    private static void patternOne(int row,int column){
        if(row == 0){
            return;
        }
        if(column<row){
            System.out.print("* ");
            patternOne(row, column+1);
        } else{
            System.out.println();
            patternOne(row-1,0);
        }
    }
}
