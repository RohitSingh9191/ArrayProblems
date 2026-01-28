import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MissingNumber {
    public static void main(String[] args) {

        int[] num = {0,5,29,4,56,7};

        int n = num.length;

//        for(int i = 0 ; i < n/2 ; i++){
//            int temp = num[i];
//            num[i] =  num[n - i -1];
//            num[n - i - 1] = temp;
//        }

        for(int i = 0 ; i < n/2 ; i++){

            num[i] = num[i] + num[n - i -1];

            num[n - i -1] = num[i] - num[n - i -1];

            num[i] = num[i] - num[n - i -1];

        }



        for(int arr : num){
            System.out.print(arr + " ");
        }

    }

    String name = "Rohit";

    String name1 = new String("Rohit");

    


    }