package ProblemSolve;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseStreamApi {
    public static void main(String[] args) {
        String sentance = "I am going now";

        String result = Arrays.stream(sentance.split(" "))
                        .map(word -> new StringBuilder(word).reverse().toString())
                        .collect(Collectors.joining(" "));

        System.out.println(result);

    }
}
