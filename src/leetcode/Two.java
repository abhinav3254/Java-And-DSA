package leetcode;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Two {


    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        int arr1[] = {9,9,9,9,9,9,9};
        int arr2[] = {9,9,9,9};

        for (int i = 0; i < arr1.length; i++) {
            l1.add(arr1[i]);
        }


        for (int i = 0; i < arr2.length; i++) {
            l2.add(arr2[i]);
        }

        System.out.println(l1);
        System.out.println(l2);

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
            l3.add(sum);
        }
        int q = 0;
        int rem = 0;
        for (int i = 0; i < size; i++) {
            if(l3.get(i)>9) {
                rem = l3.get(i)%10;
                q = l3.get(i)/10;
                l3.set(i,rem);
                int n = l3.get(i+1);
                l3.set(i+1,n+q);
            }
        }
    }
}
