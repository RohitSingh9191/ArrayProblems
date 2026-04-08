package ProblemSolve;

import java.text.Collator;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SecondLargestNumber {

    public static void main(String[] args) {
        int[] nums = {10, 10, 5} ;   
        Integer largest = Integer.MIN_VALUE;
        Integer secondLargest = Integer.MIN_VALUE;


        for(Integer num : nums){

            if(largest < num){
                secondLargest = largest;
                largest = num;
            }else if(num > secondLargest && num != largest){
                    secondLargest = num;
            }
        }

        System.out.println(secondLargest);

      
     Integer result = Arrays.stream(nums)
      .distinct()
      .boxed()
      .sorted((a,b) -> b - a)
      .skip(1)
      .findFirst()
      .orElse(null);


      System.out.println(result);


    }



}
