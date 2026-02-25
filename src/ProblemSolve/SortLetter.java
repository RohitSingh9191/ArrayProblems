package ProblemSolve;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SortLetter {

    public static void main(String[] args) {

        String input = "nhjhgnmgkiii";

        // Step 1: Count frequency (LinkedHashMap keeps insertion order)
        Map<Character, Integer> freqMap = new LinkedHashMap<>();
        for (char ch : input.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Convert map entries to list
        List<Map.Entry<Character, Integer>> list =
                new ArrayList<>(freqMap.entrySet());

        // Step 3: Sort by frequency (descending)
        list.sort((a, b) -> b.getValue() - a.getValue());

        // Step 4: Build result string
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : list) {
            result.append(String.valueOf(entry.getKey())
                    .repeat(entry.getValue()));
        }

        System.out.println(result.toString());
    }
}
