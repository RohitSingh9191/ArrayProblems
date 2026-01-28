public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int a[] = {1,1,1,1,0,0,0,0,0,0,1,1,1,1,1};

        maximumConsecutiveboth(a);
        maximumConsecutiveOnes(a);
    }
   public static  void  maximumConsecutiveboth(int nums[]){

        int max=0;
       int ones=0;
       int zeros=0;
        for(int i = 0 ; i < nums.length ; i++){

            if(nums[i]==1){
                ones++;
                if(max < zeros){
                    max = zeros;
                }
                zeros =0;
            }
            else {
                if(max<ones){
                    max = ones;
                }
                zeros++;
                ones = 0;
            }

        }

        if(max <  ones) max = ones;
        if(max < zeros) max = zeros;


       System.out.println(max);
    }

    public static  void  maximumConsecutiveOnes(int nums[]){

        int max=0;
        int ones=0;
//        for(int i = 0 ; i < nums.length ; i++){

//            if(nums[i]==1){
//                ones++;
//
//            }
//            else {
//                if(max<ones){
//                    max = ones;
//                }
//
//                ones = 0;
//            }
//
//        }
//
//        if(max <  ones) max = ones;

            for (int num : nums) {
                if (num == 1) {
                    ones++;
                    max = Math.max(max, ones); // update max in the same block
                } else {
                    ones = 0;
                }
            }

        System.out.println(max);
    }

}