package DSA.recursion.pattern;

/*
*  This is the pattern that we have to print
    * * * *
    * * *
    * *
    *

* */
public class P1 {
    private static void pattern(int row,int column){
        if(row == 0){
            return;
        }
        if(row>column){
            System.out.print("* ");
            pattern(row,column+1);
        } else{
            System.out.println();
            pattern(row-1,0);
        }
    }

    public static void main(String[] args) {
        pattern(4,0);
    }
}
