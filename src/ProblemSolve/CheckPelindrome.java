package ProblemSolve;

public class CheckPelindrome {

    public static void main(String[] args) {
        String str = "A man a plan a canal Panama";

        int left = 0;
        int right = str.length()-1;


        while (left < right) {
            
            if(str.charAt(left) == ' '){
                left++;
                continue;
            }

            if(str.charAt(right) == ' '){
                right--;
                continue;
            }

            if(Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))){ // str.charAt(right)){
                System.out.println(false);
                break;
            }else{
                System.out.println(true);
            }

            left++;
            right--;
        }

        

        
    }

}
