package leetcode;

import java.util.LinkedList;

public class Two {


    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l1.add(2);
        l1.add(4);
        l1.add(3);

        l2.add(5);
        l2.add(6);
        l2.add(4);

        stuff(l1,l2);
    }

    public static void stuff(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        LinkedList<Integer> l3 = new LinkedList<>();
        int size = 0;
        if(l1.size()>=l2.size()) {
            size = l1.size();
        } else {
            size = l2.size();
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum = l1.get(i)+l2.get(i);
            if(sum>9) {
                int rem = sum%10;
                sum = sum/10;
            }
        }
        System.out.println(l3);
    }
}
