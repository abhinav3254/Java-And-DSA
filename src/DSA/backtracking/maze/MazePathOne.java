package DSA.backtracking.maze;

public class MazePathOne {
    public static void main(String[] args) {
        path("",3,3);
    }
    private static void path(String newName , int row , int column) {
        if(row == 1 && column == 1){
            System.out.println(newName);
            return;
        }
        if(row>1) {
            path(newName+'D',row-1,column);
        }
        if(column>1) {
            path(newName+'R',row,column-1);
        }
    }
}
