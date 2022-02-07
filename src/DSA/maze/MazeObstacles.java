package DSA.maze;

public class MazeObstacles {
    public static void main(String[] args) {
        boolean[][] arr = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        maze("",arr,0,0);
    }
    private static void maze(String newName,boolean[][]arr,int r , int c){
        if(r == arr.length-1 && c == arr[0].length-1){
            System.out.println(newName);
            return;
        }
        if(arr[r][c] == false){
            return;
        }
        if(r<arr.length-1){
            maze(newName+"D",arr,r+1,c);
        }
        if(c<arr[0].length-1){
            maze(newName+"R",arr,r,c+1);
        }
    }
}
