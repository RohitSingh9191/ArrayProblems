import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergerArray {
    public static void main(String[] args) {
        int [] a = {4, 2, 7, 9};
        int [] b = {4, 2, 7, 1};

        ArrayList<Integer> c = (ArrayList<Integer>) Stream.concat(Arrays.stream(a).boxed(), Arrays.stream(b).boxed())
                .collect(Collectors.toList());

        int[] d = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).toArray();

        int[] e = Arrays.stream(a).toArray();

        e = Arrays.stream(b).toArray();

        System.out.println(Arrays.toString(e));
        System.out.println(c);
    }
}