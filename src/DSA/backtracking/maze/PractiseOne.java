package DSA.backtracking.maze;

public class PractiseOne {
    public static void main(String[] args) {
        boolean[][] arr = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        allPaths("",arr,0,0);
    }

    private static void allPaths(String newName, boolean[][] arr, int r, int c) {
        if(r == arr.length-1 && c == arr[0].length-1) {
            System.out.println(newName);
            return;
        }
        if(!arr[r][c]) {
            return;
        }
        arr[r][c] = false;

        if(r<arr.length-1) {
            allPaths(newName+"D", arr, r+1, c);
        }
        if(c<arr[0].length-1) {
            allPaths(newName+"R", arr, r, c+1);
        }
        if(r>0) {
            allPaths(newName+"L",arr,r-1,c);
        }
        if(c>0) {
            allPaths(newName+"D",arr,r,c-1);
        }

        arr[r][c] = true;
    }
}
