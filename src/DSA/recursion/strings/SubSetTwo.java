package DSA.recursion.strings;

public class SubSetTwo {
    static void subSeq(String name,String newName,int index){
        if(index==name.length()){
            System.out.println(newName);
            return;
        }
        subSeq(name,newName+name.charAt(index),index+1);
        subSeq(name,newName,index+1);
    }

    public static void main(String[] args) {
        subSeq("abc","",0);
    }
}
