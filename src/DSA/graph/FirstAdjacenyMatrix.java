package DSA.graph;

import java.util.Scanner;

public class FirstAdjacenyMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome TO Graph Section");
        System.out.println("Enter Number of Nodes");
        int number_of_nodes = sc.nextInt();
        int [] arr = new int[number_of_nodes];
        int[][] two_arr = new int[number_of_nodes][number_of_nodes];

        System.out.println("Enter the elements:- ");
        for(int i = 0;i<number_of_nodes;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Hit 1 if they have relation\nelse Hit 0");

        for (int i = 0; i < number_of_nodes; i++) {
            for (int j = 0; j < number_of_nodes; j++) {
                System.out.println(arr[i]+" has relation with "+arr[j]);
                two_arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < number_of_nodes; i++) {
            for (int j = 0; j < number_of_nodes; j++) {
                System.out.print(two_arr[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();

    }
}
