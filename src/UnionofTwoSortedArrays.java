import java.util.*;

public class UnionofTwoSortedArrays {
    public static void main(String[] args) {

        int a[] = {1,2,3,4,5};
        int b[] = {2,3,4,6};

        unionOfArrays(a,b);


        unionOfArraysOptimal(a,b);
    }

  public static void unionOfArrays(int a[], int b[]){

      Set<Integer>  res = new HashSet<>();

      Arrays.stream(a).forEach(res :: add);

      Arrays.stream(b).forEach(res :: add);

      System.out.println("Union: " + res);

  }

    public static void unionOfArraysOptimal(int arr1[], int arr2[]){
        int n = arr1.length, m = arr2.length;
        int i = 0, j = 0;
        List<Integer> result = new ArrayList<>();

        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                if (result.isEmpty() || result.get(result.size() - 1) != arr1[i])
                    result.add(arr1[i]);
                i++;
            } else if (arr1[i] > arr2[j]) {
                if (result.isEmpty() || result.get(result.size() - 1) != arr2[j])
                    result.add(arr2[j]);
                j++;
            } else {
                if (result.isEmpty() || result.get(result.size() - 1) != arr1[i])
                    result.add(arr1[i]);
                i++;
                j++;
            }
        }

        // Add remaining elements
        while (i < n) {
            if (result.isEmpty() || result.get(result.size() - 1) != arr1[i])
                result.add(arr1[i]);
            i++;
        }

        while (j < m) {
            if (result.isEmpty() || result.get(result.size() - 1) != arr2[j])
                result.add(arr2[j]);
            j++;
        }


        System.out.println(result);

    }





 }