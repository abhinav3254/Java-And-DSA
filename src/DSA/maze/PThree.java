package DSA.maze;

public class PThree {
    public static void allPaths(boolean[][] arr, int r,int c,String newName) {
        if (r == arr.length-1 && c == arr[0].length-1) {
            System.out.println(newName);
            return;
        }
        if(!arr[r][c]) {
            return;
        }

        arr[r][c] = false;

        if(r< arr.length-1) {
            allPaths(arr, r+1, c, newName+"D");
        }
        if(c< arr[0].length-1) {
            allPaths(arr, r, c+1, newName+"R");
        }
        if(r>0) {
            allPaths(arr, r-1, c, newName+"U");
        }
        if(c>0) {
            allPaths(arr, r, c-1, newName+"L");
        }


        arr[r][c] = true;

    }

    public static void main(String[] args) {
        boolean[][] arr = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };

        allPaths(arr,0,0,"");
    }
}
