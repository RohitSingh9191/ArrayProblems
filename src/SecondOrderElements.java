public class SecondOrderElements {
    public static void main(String[] args) {
         int arr[] ={2,13,10,12,9,6, 8, 7, 4 ,7, 3,11};

         int i=1;
         int largest=arr[0];
         int secondLargest = arr[1];
        int smalest = arr[0];
        int secondSmalest= arr[1];
         while (i<arr  .length){
            if(largest<arr[i]){
                secondLargest = largest;
                largest=arr[i];
            }else {
                if(secondLargest < arr[i])
                    secondLargest=arr[i];
            }
             if(smalest>arr[i]){
                 secondSmalest = smalest;
                 smalest=arr[i];
             }else {
                 if(secondSmalest > arr[i]){
                     secondSmalest=arr[i];
                 }
             }
             i++;
         }
        System.out.println(secondLargest);
        System.out.println(secondSmalest);

    }
}