package DSA.maze;

/*
*
*   [0 0 0 0]
*   [0 1 0 0]
*   [0 0 0 0]
*
* */

public class PTwo {
    public static void obs (boolean[][] arr, int r , int c,String newName) {
        if(r== arr.length-1 && c == arr[0].length-1) {
            System.out.println(newName);
            return;
        }
        if(!arr[r][c]) {
            return;
        }
        if(r< arr.length-1) {
            obs(arr, r+1, c,newName+"D");
        }
        if(c< arr[0].length-1) {
            obs(arr, r, c+1,newName+"R");
        }
    }

    public static void main(String[] args) {
        boolean[][] arr = {
                {true,true,true,true},
                {true,false,true,true},
                {true,true,true,true}
        };
        obs(arr,0,0,"");
    }
}
