import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LongestConsecutiveSequenceArray {
    public static void main(String[] args) {
        int arr [] = {3, 8, 5, 7, 6};
        int max = 0;
        Set<Integer> set = new TreeSet<>();

        for( int i = 0; i < arr.length ; i++){
            set.add(arr[i]);
        }

        int diffrence = 1;
        int count = 1;
        for(Integer num : set){

            if(diffrence == num-1){
                diffrence = num;
                count++;
            }else{
                diffrence = num;
                count =1;
            }

            max = Integer.max(max,count);
        }
        System.out.println(max);

        // Optimal

        Set<Integer> newSet = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int newMax = 0;

        for (int num : newSet) {
            // Check if num is start of a sequence
            if (!newSet.contains(num - 1)) {
                int current = num;
                int newCount = 1;

                while (newSet.contains(current + 1)) {
                    current++;
                    newCount++;
                }

                newMax = Math.max(newMax, newCount);
            }
        }

        System.out.println(newMax);
    }
}