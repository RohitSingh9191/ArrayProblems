package ProblemSolve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateElement {

    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,2,3,4,2,5,3,6);
        Set<Integer> seen = new HashSet<>();


        List<Integer> dub = num.stream().filter(n -> !seen.add(n)).collect(Collectors.toList());
        
        System.out.println(dub);

    }

}
