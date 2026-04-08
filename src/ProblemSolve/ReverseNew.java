package ProblemSolve;

public class ReverseNew {
    public static void main(String[] args) {
        String sentance = "my name is rohit";
        String[] words = sentance.split("\\s+");
        StringBuilder result = new StringBuilder();

         for(int i = words.length-1 ; i>=0 ; i--){
            result.append(words[i]).append(" ");
         }
        System.out.println(result.toString().trim());
    }

}
