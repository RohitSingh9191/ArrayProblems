
public class MoveZeroes {
    public static void main(String[] args) {
         int arr[] ={0,1,2,0,0,3,0,4};
        moveZeroesLast(arr);
    }


    public  static  void moveZeroesLast(int[] nums){

        int swapIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Only swap if current index and swapIndex are different
                if (i != swapIndex) {
                    int temp = nums[swapIndex];
                    nums[swapIndex] = nums[i];
                    nums[i] = temp;
                }
                swapIndex++;
            }
        }
//        int swapIndex = -1;
//        boolean swap = false;
//        for(int i=0 ; i<nums.length ; i++){
//            if(nums[i]==0){
//                swapIndex=i;
//                swap = true;
//                break;
//            }
//        }
//
//        if(swap == true){
//
//        for(int i=swapIndex+1 ; i<nums.length ; i++){
//                if(nums[i]!=0){
//                    int temp = nums[swapIndex];
//                    nums[swapIndex] = nums[i];
//                    nums[i] = temp;
//                    swapIndex++;
//
//                }
//        }
//        }

        for(int num : nums){
            System.out.print(num+",");
        }
    }


}