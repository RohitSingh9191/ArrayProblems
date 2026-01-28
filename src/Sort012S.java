public class Sort012S {
    public static void main(String[] args) {

        int [] arr = {2,0,1};

        // Better Solution
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        // Take count of 0, 1 and 2 then store in arr
        for(int num :arr){
            if(num == 0){
                count0++;
            } else if (num == 1) {
                count1++;
            } else if (num == 2) {
                count2++;
            }
        }
        int index = 0;
        for(int i = 0 ; i<count0 ; i++){
            arr[index] = 0;
            index ++;
        }

        for(int i = 0 ; i<count1 ; i++){
            arr[index] = 1;
            index ++;
        }
        for(int i = 0 ; i<count2 ; i++){
            arr[index] = 2;
            index ++;
        }
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println("");
        System.out.println("Optimal Sol ---------------------");
        int [] arr1 = {2,0,2,1,1,0};
        int low = 0 , mid = 0, high = arr1.length-1;

        while(mid <= high){

            if(arr1[mid] == 0){
                int temp = arr1[mid];
                arr1[mid] = arr1[low];
                arr1[low] = temp;
                low++;
                mid++;
            }else if(arr1[mid] == 1){
                mid++;
            } else if(arr1[mid] == 2){
                int temp = arr1[mid];
                arr1[mid] = arr1[high];
                arr1[high] = temp;
                high--;
            }
        }

        for(int num : arr1){
            System.out.print(num + " ");
        }
    }


}