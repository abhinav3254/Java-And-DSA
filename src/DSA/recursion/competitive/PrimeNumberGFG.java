package DSA.recursion.competitive;

// https://practice.geeksforgeeks.org/problems/prime-number2314/1/?category[]=Prime%20Number&category[]=Prime%20Number&company[]=Amazon&company[]=Amazon&page=1&query=category[]Prime%20Numbercompany[]Amazonpage1company[]Amazoncategory[]Prime%20Number

public class PrimeNumberGFG {
    public static void main(String[] args) {
        System.out.println(Solution.isPrime(7));
    }
}
class Solution {
    static int isPrime(int n) {
        if (n == 1) {
            return 0;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }
        }

        return 1;
    }
}