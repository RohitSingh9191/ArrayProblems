package ProblemSolve;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortWords {
public static void main(String[] args) {

     String word = "jaavvrakkbrrttt";

        // Count frequency of each character
        Map<String, Long> freqMap =
                Arrays.stream(word.split(""))
                      .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        // Sort by frequency (desc), then by character (asc)
        String result =
                freqMap.entrySet().stream()
                       .sorted(
                           Map.Entry.<String, Long>comparingByValue(Comparator.reverseOrder())
                                    .thenComparing(Map.Entry.comparingByKey())
                       )
                       .map(e -> e.getKey().repeat(e.getValue().intValue()))
                       .collect(Collectors.joining());

        System.out.println(result);
    
}

}
