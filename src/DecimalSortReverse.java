import java.util.*;
import java.util.stream.Collectors;

public class DecimalSortReverse {
    public static void main(String[] args) {
        List<Double> a = Arrays.asList(114.25, 1385.12, 214.32, 5.2, 25.5);

        a = a.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println(a);

        String c = "My name is Rohit Singh";

         c = Arrays.stream(c.split(" ")).collect(Collectors
                 .collectingAndThen(Collectors.toList(), list -> {
                Collections.reverse(list);
                return String.join((" "), list);
         }));
        System.out.println(c);

        String d = Arrays.stream(c.split(" ")).collect(Collectors.collectingAndThen(Collectors.toList(),list-> {
            Collections.reverse(list);
            return String.join(" ",list);
        }));

        System.out.println(d);
    }
}