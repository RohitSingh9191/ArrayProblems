package ProblemSolve;

public class Reverse {
        public static void main(String[] args) {
            String sentance = "Java is very good language";
            StringBuilder word = new StringBuilder();
            StringBuilder result = new StringBuilder();

            for(int i = 0 ; i < sentance.length() ; i++){
                char ch = sentance.charAt(i);

                if(ch == ' '){

                    for(int j = word.length()-1 ; j >= 0 ; j--){
                        result.append(word.charAt(j));
                    }
                    result.append(" ");
                    word.setLength(0);

                }else{
                    word.append(ch);
                }

            }   

            for (int j = word.length() - 1; j >= 0; j--) {
            result.append(word.charAt(j));
        }

            
            System.out.println(result);
        
        }
}
