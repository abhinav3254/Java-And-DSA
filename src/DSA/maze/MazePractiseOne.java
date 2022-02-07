package DSA.maze;

public class MazePractiseOne {
    public static void main(String[] args) {
        System.out.println(mazePathCount(3,3));
        mazePath("",3,3);
    }
    private static int mazePathCount(int row , int column) {
        if(row == 1 || column == 1) {
            return 1;
        }
        return (mazePathCount(row-1,column)+mazePathCount(row,column-1));
    }

    private static void mazePath(String newName , int row , int column) {
        if(row == 1 && column ==1) {
            System.out.println(newName);
            return;
        }
        if(row>1) {
            mazePath(newName+'D',row-1,column);
        }
        if(column>1){
            mazePath(newName+'R',row,column-1);
        }
    }
}
