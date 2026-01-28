
public class CountEvenNumber {
    public static void main(String[] args) {
         int arr[] ={12,345,2,6,7896};
        evenNumber(arr);
    }

    public static void evenNumber(int nums[]){

        int count =0;

        for(int num : nums){
            int numCount =0;
            while (num > 0){
              num /= 10;
                numCount++;
            }
            if(numCount % 2 ==0){
                count++;
            }

        }

        System.out.println(count);
    }

}