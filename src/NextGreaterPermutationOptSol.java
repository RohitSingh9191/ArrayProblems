public class NextGreaterPermutationOptSol {
    public static void main(String[] args) {

        int[] arr = {3, 2, 1};


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

    static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            swap(arr, left++, right--);
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

