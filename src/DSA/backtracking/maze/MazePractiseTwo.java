package DSA.backtracking.maze;

public class MazePractiseTwo {
    public static void main(String[] args) {
        maze("",2,2);
        System.out.println(count);
    }
    static int count = 0;
    private static void maze(String path , int row , int column) {
        if(row == 1 && column == 1) {
            System.out.println(path);
            count++;
            return;
        }
        if(row>1){
            maze(path+'D',row-1,column);
        }
        if(column>1){
            maze(path+'R',row,column-1);
        }
    }
}
