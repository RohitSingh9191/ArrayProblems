public class ArrayIsSortedRotated {
    public static void main(String[] args) {
         int arr[] ={3,3,4,5,1,2,1};

        System.out.println(check(arr));


    }


    public static boolean check(int[] nums) {
        int n=nums.length;
        int rotate =0;
        for(int i =0 ;i<n-1;i++){

            if(nums[i]>nums[i+1]){
                rotate++;
                if(rotate==2){
                    return false;
                }

            }

            if(nums[0] < nums[n-1] ){
                rotate++;
                if(rotate==2){
                    return false;
                }
            }


        }

        return true;
    }
}