package DSA.maze;

public class GoingDiagonal {
    public static void main(String[] args) {
        maze("",3,3);
        System.out.println(count);
    }
    private static int count = 0;
    private static void maze(String newName , int row , int column) {
        if(row == 1 && column == 1){
            System.out.println(newName);
            count++;
            return;
        }
        if(row>1 && column>1) {
            maze(newName+'D',row-1,column-1);
        }
        if(row>1) {
            maze(newName+'V',row-1,column);
        }
        if(column>1) {
            maze(newName+'H',row,column-1);
        }
    }
}
