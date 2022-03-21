package DSA.graph.adjacencyMatrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SECONDGRAPHADJAN {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Number of Nodes: ");
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        System.out.println("Enter the Nodes:- ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

//        Matrix Start Here

        System.out.println("Hit 1 for connection");
        System.out.println("Hit 0 for no connection");

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(a[i]+" has connection with "+a[j]);
                arr[i][j] = Integer.parseInt(br.readLine());
            }
        }

//        Printing the matrix

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
