public class NextGreaterPermutation {
    public static void main(String[] args) {

        int[] arr = {3, 2, 1};

        int n = arr.length;
        int ind = -1;

        // Step 1: Find the break point:
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                ind = i;
                break;
            }
        }

        // If break point does not exist:
        if (ind == -1) {
            // reverse the whole array
            reverseSubArray(arr, 0, n - 1);  // ✅ FIX: use n-1
        } else {
            // Step 2: Find the next greater element and swap with arr[ind]
            for (int i = n - 1; i > ind; i--) {
                if (arr[i] > arr[ind]) {
                    int temp = arr[i];
                    arr[i] = arr[ind];
                    arr[ind] = temp;
                    break;
                }
            }

            // Step 3: reverse the right half
            reverseSubArray(arr, ind + 1, n - 1);  // ✅ FIX: reverse only after ind
        }

        // Print result
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void reverseSubArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


    // Optimal sol


    class Solution {
        public void nextPermutation(int[] arr) {
            int n = arr.length;
            int ind = -1;

            // Step 1: Find the break point
            for (int i = n - 2; i >= 0; i--) {
                if (arr[i] < arr[i + 1]) {
                    ind = i;
                    break;
                }
            }

            if (ind == -1) {
                // No break point → last permutation → reverse whole array
                reverse(arr, 0, n - 1);
                return;
            }

            // Step 2: Find next greater element to swap with arr[ind]
            for (int i = n - 1; i > ind; i--) {
                if (arr[i] > arr[ind]) {
                    swap(arr, i, ind);
                    break;
                }
            }

            // Step 3: Reverse the right half
            reverse(arr, ind + 1, n - 1);
        }

        private void reverse(int[] arr, int left, int right) {
            while (left < right) {
                swap(arr, left++, right--);
            }
        }

        private void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

}
