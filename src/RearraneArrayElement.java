
public class RearraneArrayElement {
    public static void main(String[] args) {

        //You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.
        int arr [] = {3,1,-2,-5,2,-4};

        int posIndex = 0;
        int negIndex = 1;
        int newArr [] = new int[arr.length];

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] < 0){
                newArr[negIndex] = arr[i];
                negIndex += 2;

            }else {
                newArr[posIndex] = arr[i];
                posIndex += 2;
            }
        }
for(int num : newArr){
    System.out.print(num+ " ");
}

    }
}