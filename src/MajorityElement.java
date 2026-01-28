import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {

        //Find the Majority Element that occurs more than N/2 times

        int[] arr = {2,2,1,1,1,2,2,2,5,5,2};

        // Normal Sol , Using hashing

        HashMap<Integer, Integer> map = new HashMap<>();

        for(Integer num : arr){
            if(map.containsKey(num)){
               int count =  map.get(num);
               count++;
               map.put(num,count);
            }else {
                map.put(num,1);
            }
        }
        int max = 0;
        int key = 0;
       for(Map.Entry<Integer, Integer> entry : map.entrySet()){
           int value =  entry.getValue();
           if(max < value){
               max = value;
               key = entry.getKey();
           }
       }
       if(max > (arr.length/2)) {
           System.out.println(key);
       }else {
           System.out.println(-1);
       }



// Optimal Solution using

        // Using Moone's Vating Algo
        int[] arrr = {3,1,2,3,6,3,4,3,5,5,3,3,3,5,2,3,3,3,3,3,1,2};

        Integer currentElement = null;
        int elementCount = 0;
        for(int num : arrr){
            if(elementCount == 0){
                currentElement = num;
                elementCount ++;
            }else if(currentElement == num) {
                elementCount ++;
            }else {
                elementCount --;
            }
        }

        int countOfElement = 0;
        for(int num : arrr){
            if(num == currentElement){
                countOfElement ++;
            }
        }
        if(countOfElement > (arrr.length/2)){
            System.out.println(currentElement);
        }else {
            System.out.println(-1);
        }
    }

}