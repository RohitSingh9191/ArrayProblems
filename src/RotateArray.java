import java.util.ArrayList;

public class RotateArray {
    public static void main(String[] args) {
         int arr[] ={1,2,3,4,5,6,7};
        rotateLeftArrayByOne(arr);

        int arr3[] ={1,2,3,4,5,6,7};
        rotateLeftBruteForce(arr3,3);


        int arr1[] ={1,2,3,4,5,6,7};
        rotateRight(arr1,3);

        int arr2[] ={1,2,3,4,5,6,7};
        rotateRightBruteForce(arr2,3);


        int arr4[] ={1,2,3,4,5,6,7};
        rotateRightOtimalSol(arr4,3);
    }


    public static void rotateLeftArrayByOne(int[] nums) {
        int i=0;
        int temp=nums[0];
        while(i< nums.length-1){
            nums[i]=nums[i+1];
            i++;
        }
        nums[nums.length-1]=temp;

        System.out.println("rotateArrayByOne");
        for(int num : nums){
            System.out.print(num+",");
        }

    }

    // Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.


    public static void rotateRight(int[] nums, int k) {

        if(k >= nums.length ){
            k = k % nums.length;
        }
        for (int j=1 ; j<=k ;j++){
            int i=nums.length-1;
            int temp=nums[i];
            while(i>0){
                nums[i]=nums[i-1];
                i--;
            }
            nums[0]=temp;
        }
        System.out.println();
        System.out.println("rotateRight");
        for(int num : nums){
            System.out.print(num+",");
        }
    }


    public static void rotateLeftBruteForce(int[] nums, int k) {
        if(k >= nums.length ){
            k = k % nums.length;
        }
        ArrayList<Integer> temp = new ArrayList<>();
       for(int i=0 ; i<k ; i++){
           temp.add(nums[i]);
       }

       int j=0;
       for(int i = k ; i<nums.length ; i++){
           nums[j]=nums[i];
           j++;
       }

       for(int num : temp){
           nums[j]=num;
           j++;
       }

        System.out.println();
        System.out.println("rotateLeftBruteForce");
        for(int num : nums){
            System.out.print(num+",");
        }
    }


    public static void rotateRightBruteForce(int[] nums, int k) {

            k = k % nums.length;

        ArrayList<Integer> temp = new ArrayList<>();

        for(int i=0 ; i<=nums.length-1-k ; i++){
            temp.add(nums[i]);
        }

        int j=0;
        for(int i = nums.length-k ; i<nums.length ; i++){
            nums[j]=nums[i];
            j++;
        }
        for(int num : temp){
            nums[j]=num;
            j++;
        }

        System.out.println();
        System.out.println("rotateRightBruteForce");
        for(int num : nums){
            System.out.print(num+",");
        }
    }

    public static void rotateRightOtimalSol(int[] nums, int k) {

        k = k % nums.length;

        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);


        System.out.println();
        System.out.println("rotateroghtOtimalSol");
        for(int num : nums){
            System.out.print(num+",");
        }


    }

    public static void reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


}