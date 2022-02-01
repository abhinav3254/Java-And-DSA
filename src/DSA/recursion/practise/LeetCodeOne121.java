package DSA.recursion.practise;

public class LeetCodeOne121 {
    public static void main(String[] args) {
//        int[] prices = {7,1,5,3,6,4};
//        int[] prices = {7,6,4,3,1};
        int[] prices = {2,4,1};
        int ans = maxProfit(prices);
        System.out.println(ans);
    }

    public static int maxProfit(int[] prices) {
        int max = -1;
        int min = prices[0];
        int buyDay = 0;
        for(int i = 0;i<prices.length;i++){
            if(min>prices[i]){
                min = prices[i];
                buyDay = i;
            }
        }
        for(int j = buyDay;j<prices.length;j++){
            if(max<prices[j]){
                max = prices[j];
            }
        }
        return (max-min);
    }
}
