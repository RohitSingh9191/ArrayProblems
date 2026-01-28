import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {
       
        List<Integer> list = Arrays.asList(9,42,6,8,5,1,96,4,54,8,4,1,6554,41,1,2,5,4,6,2,3,8,7,4,6,54,8,4,55,4,5);

        
          List<Integer> newList = list.stream().filter(x -> x % 2 ==0)
          .distinct()
          .sorted((a,b) -> (b - a))
          .peek(x -> System.out.print(x + ","))
          .map(x -> x/2)
          .limit(5)
          .collect(Collectors.toList());


          System.out.println(newList);


    }
}