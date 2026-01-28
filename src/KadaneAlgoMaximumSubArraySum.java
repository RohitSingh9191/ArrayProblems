public class KadaneAlgoMaximumSubArraySum {
    public static void main(String[] args) {

        //Brut force Sol N*3
        int [] arr ={-2,1,-3,4,-1,2,1,-5,4};
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i ; j < arr.length ; j++){
                   int sum=0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                max = Math.max(max, sum);
            }
        }
        System.out.println(max);

    //Better Sol N*2
        for(int i = 0 ; i < arr.length ; i++){
            int sum=0;
            for(int j = i ; j < arr.length ; j++){
                sum += arr[j];
                max = Math.max(max, sum);
            }
        }
        System.out.println(max);

// Optimal Sol
        long maxi = Long.MIN_VALUE; // minimum sum
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (sum > maxi) {
                maxi = sum;
            }

            // If sum < 0: discard the sum calculated
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println(maxi);
    }


}