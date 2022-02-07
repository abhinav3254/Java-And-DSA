package DSA.maze;

public class MazePathTwo {
    public static void main(String[] args) {
        maze("",3,3);
    }
    private static void maze(String newName,int r,int c) {
        if(r == 1 && c == 1) {
            System.out.println(newName);
            return;
        }
        if(r>1 && c>1) {
            maze(newName+'D',r-1,c-1);
        }
        if(r>1) {
            maze(newName+'V',r-1,c);
        }
        if(c>1) {
            maze(newName+"R",r,c-1);
        }
    }
}