package DSA.backtracking;

import java.util.Arrays;

public class AllPathsPrint {
    public static void main(String[] args) {
        boolean[][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] path = new int[board.length][board[0].length];
        allPathPrint("",board,0,0,path,1);
    }
    private static void allPathPrint(String newName,boolean[][] arr,int r,int c,int[][] path,int step) {
        if(r == arr.length-1 && c == arr[0].length-1) {
            path[r][c] = step;
            for(int[] a:path){
                System.out.println(Arrays.toString(a));
            }
            System.out.println(newName);
            System.out.println();
            return;
        }
        if(!arr[r][c]){
            return;
        }
        arr[r][c] = false;
        path[r][c] = step;
        if(r<arr.length-1) {
            allPathPrint(newName+"D", arr, r+1, c, path, step+1);
        }
        if(c<arr[0].length-1) {
            allPathPrint(newName+"R", arr, r, c+1, path, step+1);
        }
        if(r>0) {
            allPathPrint(newName+"L", arr, r-1, c, path, step+1);
        }
        if(c>0) {
            allPathPrint(newName+"D", arr, r, c-1, path, step+1);
        }

        arr[r][c] = true;
        path[r][c] = 0;
    }
}
