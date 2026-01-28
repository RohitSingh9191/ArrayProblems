public class BestTimeBuySellStock {
    public static void main(String[] args) {

        //Problem Statement: You are given an array of prices where prices[i] is the price of a given stock on an ith day.
        int arr [] = {2,4,1};
        int max = 0 ;
        int min = arr[0];
        for(int i = 0 ; i < arr.length ; i++) {
            int cost  = arr[i] - min;

            max = Integer.max(max,cost);

            min = Integer.min(min,arr[i]);
        }

        System.out.println(max);

    }
}