package DSA.recursion.strings;

public class SubSetThree {
    static int count = 0;
    private static void subSetPractise(String name,String newName){
        if(name.isEmpty()){
            System.out.println(newName);
            count++;
            return;
        }
        char c = name.charAt(0);
        subSetPractise(name.substring(1),newName+c);
        subSetPractise(name.substring(1),newName);
    }

    public static void main(String[] args) {
        subSetPractise("ab","");
        System.out.println("Total subset is : "+count);
    }
}
