import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortAndReverse {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(4, 2, 7, 9);

        List<Integer> b = a.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        for(int c : b){
            System.out.println(c);
        }
    }
}