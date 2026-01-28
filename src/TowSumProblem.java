import java.util.HashMap;
import java.util.Iterator;

public class TowSumProblem {
    public static void main(String[] args) {

        int [] arr = {2,3,5,8,11};
        int target = 14;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int differance = target - arr[i];
            if(map.containsKey(differance)){
                int value = map.get(differance);
                System.out.println(value +","+ i );
                break;
            }
            map.put(arr[i],i);
        }


    }


}