package DSA.maze;

/*
*
*   0 0 0
*   0 0 0
*   0 0 0
* */

public class POne {
    public static void mazePath (int r , int c , String newName) {
        if (r == 1 && c == 1) {
            System.out.println(newName);
            return;
        }
        if(r > 1) {
            mazePath(r-1 , c , newName+"V");
        }
        if(c > 1) {
            mazePath(r , c-1 , newName+"H");
        }
        if(r > 1 && c>1) {
            mazePath(r-1 , c-1 , newName+"D");
        }
    }
    public static int mazePathCount(int r,int c){
        if(r==1 || c == 1) {
            return 1;
        }
        int left = mazePathCount(r-1,c);
        int right = mazePathCount(r,c-1);

        return left+right;
    }

    public static void main(String[] args) {
        System.out.println(mazePathCount(3,3));
        mazePath(3,3,"");
    }
}
