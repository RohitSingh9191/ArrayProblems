import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class HashMapProblem {
    public static void main(String[] args) {

        List<Studen> studenList = new ArrayList<>(
            Arrays.asList(
                new Studen("Rohit", 25),
                new Studen("Amit", 25),
                new Studen("Neha", 22)
            )
        );

        studenList.add(new Studen("Rohit", 5));


        Map<Integer,List<String>> sameAgeGroup =  studenList.stream()
                                                  .collect(Collectors.groupingBy(
                                                    s -> s.age, Collectors.mapping(s -> s.name, Collectors.toList())
                                                  ));


        System.out.println(sameAgeGroup);


    }




    static class Studen {
        String name;
        Integer age;

        public Studen(String name, Integer age) {
            this.name = name;
            this.age = age;
        }
        }
}


