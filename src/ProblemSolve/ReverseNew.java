package ProblemSolve;

public class ReverseNew {
    public static void main(String[] args) {
        String sentance = "my name is rohit";
        String[] words = sentance.split(" ");
        StringBuilder result = new StringBuilder();

        for(String word :words ){
            result.append(new StringBuilder(word).reverse() + " ");    
        }
        System.out.println(result.toString().trim());
    }

}
