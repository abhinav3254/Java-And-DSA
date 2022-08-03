package teach.practise;

public class Maze {
    public static void main(String[] args) {
        boolean [][]arr = {
                {true,true,true},
                {true,false,true},
                {true,true,true},
        };

        checkOut("",arr,0,0);
    }

    public static void checkOut(String newName , boolean[][] arr, int r , int c) {

        if(r == arr.length-1 && c == arr[0].length-1) {
            System.out.println(newName);
            return;
        }

        if(!arr[r][c]) {
            return;
        }

        if(r<arr.length-1) {
            checkOut("D"+newName,arr,r+1,c);
        }


        if(c<arr[0].length-1) {
            checkOut("R"+newName,arr,r,c+1);
        }
    }
}
