import java.util.*;
import java.util.stream.Collectors;

public class CountDuplicacy {
    public static void main(String[] args) {
        List<String> a = Arrays.asList("pen", " eraser", "pen", "book", "book");

        Map<String, Integer> data = new HashMap<>();

        for(String b : a){
            if(data.containsKey(b)){
                int value =  data.get(b);
                data.put(b,value+1);
            }else{
                data.put(b,1);
            }
        }

        for(Map.Entry<String,Integer> resutl : data.entrySet()){
            if(resutl.getValue()==2){
                System.out.println(resutl.getValue() +" " + resutl.getKey());
            }
        }

        Map<String, Long> count = a.stream().collect(Collectors.groupingBy(String::trim,Collectors.counting()));

        count.entrySet().stream().filter(entry -> entry.getValue() == 2)
                .forEach(stringLongEntry -> System.out.println(stringLongEntry.getValue() +" " + stringLongEntry.getKey()));
    }
}