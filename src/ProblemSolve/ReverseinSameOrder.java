package ProblemSolve;

public class ReverseinSameOrder {

    public static void main(String[] args) {
        
        String sentance = " hi my name si rohit";
        StringBuffer word = new StringBuffer();
        StringBuffer result = new StringBuffer();


        for(int i = sentance.length()-1 ; i >=0 ; i--){

            if(sentance.charAt(i) == ' '){

                for(int j = word.length()-1 ; j >=0 ; j--){
                    result.append(word.charAt(j));
                }
                result.append(' ');
                word.setLength(0);

            }else{
                word.append(sentance.charAt(i));
            }
        }

        System.out.println(result);
    }

}
