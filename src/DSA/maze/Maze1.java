package DSA.maze;

public class Maze1 {
    public static void main(String[] args) {
        System.out.println(maze(3,3));
    }
    private static int maze(int row , int column) {
        if(row == 1 || column == 1) {
            return 1;
        }
        return (maze(row-1,column)+maze(row,column-1));
//        int left = maze(row-1,column);
//        int right = maze(row,column-1);
//        return left+right;
    }
}
