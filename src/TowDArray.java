public class TowDArray {
    public static void main(String[] args) {

        int [][] arr = { {212,22,35} , {2185,545,5221} , {212121,212,2212}, {21,12,1} };

        int max = 0;
        int indx = 0;

        for(int i = 0 ; i < arr.length ; i++){
            int sum = 0;
            for(int j = 0 ; j < arr[i].length ; j++){
              sum += arr[i][j];
            }
            if(max < sum){
                max = sum;
                indx = i;
            }
        }
        System.out.println(max);
        System.out.println(indx);
    }
}