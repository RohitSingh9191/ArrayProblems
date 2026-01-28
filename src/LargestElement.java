public class LargestElement {
    public static void main(String[] args) {
         int arr[] ={4, 7, 8, 6 ,7, 6};

         int i=1;
         int largest=arr[0];
         while (i<arr.length){

            if(largest<arr[i]){
                largest=arr[i];
            }

             i++;
         }

        System.out.println(largest);

    }
}