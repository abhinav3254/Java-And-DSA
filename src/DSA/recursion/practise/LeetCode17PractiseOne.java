package DSA.recursion.practise;

public class LeetCode17PractiseOne {
    public static void main(String[] args) {
        num("1","");
    }

//    private static void num(String name,String newName) {
//        if(name.isEmpty()){
//            System.out.println(newName);
//            return;
//        }
//        int digit = name.charAt(0)-'0';
//        for (int i = (digit-1)*3; i <digit*3; i++) {
//            char ch = (char)('a'+i);
//            num(name.substring(1),newName+ch);
//        }
//    }

    private static void num(String name,String newName){
        if(name.isEmpty()) {
            System.out.println(newName);
            return;
        }
        int digit = name.charAt(0)-'0';

        for(int i = (digit-1)*3;i<digit*3;i++){
            char ch = (char) ('a'+i);
            num(name.substring(1),newName+ch);
        }
    }
}
