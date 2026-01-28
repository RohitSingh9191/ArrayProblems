import java.util.HashMap;
import java.util.Map;

public class CountSubarray {
    public static void main(String[] args) {

        //Brut force Sol N*3
        int[] arr = {3, 1, 2, 4};
        int n = arr.length; // size of the given array.
        int k = 3;
        Map<Integer,Integer> mpp = new HashMap<>();
        int preSum = 0;
        Integer cnt = 0;

        mpp.put(0, 1); // Setting 0 in the map.
        for (int i = 0; i < n; i++) {
            // add current element to prefix Sum:
            preSum += arr[i];

            // Calculate x-k:
            int remove = preSum - k;

            // Add the number of subarrays to be removed:
            cnt += mpp.getOrDefault(remove, 0);

            // Update the count of prefix sum
            // in the map.
            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
        }
        System.out.println(cnt);
    }
}