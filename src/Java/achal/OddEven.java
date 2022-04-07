package Java.achal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddEven {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            try {
                System.out.println("Enter a Number:- ");
        int number = Integer.parseInt(br.readLine());

        System.out.println(number+" in binary is :------>>>>>>  "+Integer.toBinaryString(number));

        if(isEven(number))
        System.out.println("Even");
        else 
        System.out.println("Odd");
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println("Enter a valid Number");
            }
        }
    }
    
    private static boolean isEven(int number) {
        if((number&1)==0) {
            return true;
        } else {
            return false;
        }
    }
    
}
