import java.util.ArrayList;

public class LeadersInArray {
    public static void main(String[] args) {
        int arr[] = {0, 22, 12, 3, 0, 6};

        int max = Integer.MIN_VALUE;

        ArrayList<Integer> leaders = new ArrayList<>();

        for(int i = arr.length-1 ; i >= 0 ; i--){
            if(arr[i] > max){
                max = arr[i];
                leaders.add(arr[i]);
            }
        }

        System.out.println(leaders);
    }
}