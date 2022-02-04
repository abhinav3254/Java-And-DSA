package DSA.recursion.competitive;

//https://practice.geeksforgeeks.org/problems/josephus-problem/1/?problemType=functional&difficulty[]=0&page=1&sortBy=submissions&category[]=Recursion&query=problemTypefunctionaldifficulty[]0page1sortBysubmissionscategory[]Recursion

public class JosephusProblem {
    static int josephus(int n, int k)
    {
        if (n == 1)
            return 1;
        else
            return (josephus(n - 1, k) + k - 1) % n + 1;
    }

    public static void main(String[] args)
    {
        int n = 3;
        int k = 2;
        var ans = josephus(n, k);
        System.out.println("The chosen place is "
                +ans);
    }
}
