import java.util.ArrayList;

public class RemoveDuplicatesElements {
    public static void main(String[] args) {
        int nums[] = {0,0,1,1,1,2,2,3,3,4};
        if (nums.length == 0) System.out.println("0");

        int j = 0; // pointer for unique elements
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }

        System.out.println(j + 1); // k: number of unique elements
    }
}