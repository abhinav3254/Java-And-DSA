package DSA.recursion.permutation;

public class First {
    private static void permutation(String name , String newName){
        if(name.isEmpty()){
            System.out.println(newName);
            return;
        }
        char ch = name.charAt(0);
        for(int i = 0;i<=newName.length();i++){
            String first = newName.substring(0,i);
            String second = newName.substring(i,newName.length());
            permutation(name.substring(1),first+ch+second);
        }
    }

    public static void main(String[] args) {
        permutation("ab","");
    }
}
