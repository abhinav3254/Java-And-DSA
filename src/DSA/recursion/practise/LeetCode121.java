package DSA.recursion.practise;

public class LeetCode121 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        bestDay(prices);
        bestDayToSell(prices,bestDayIndex);
    }
    private static int bestDayIndex = 0;
    private static void bestDay(int[] arr){
        int min = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
                bestDayIndex = i;
            }
        }
        System.out.println(min);
        System.out.println(bestDayIndex);
    }

    static int bestProfit = 0;
    private static void bestDayToSell(int[] arr,int bestDayIndex){
        int max = arr[bestDayIndex];
        for(int i = bestDayIndex;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
                bestProfit = i;
            }
        }
        System.out.println(max);
        System.out.println(bestProfit);
    }
}
