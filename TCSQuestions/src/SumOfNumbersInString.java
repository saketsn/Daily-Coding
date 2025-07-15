package TCSQuestions.src;

public class SumOfNumbersInString {
    public static void main(String[] args) {
        String input = "abc12xyz34def5";
        int sum = 0;
        String temp = "0";

        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(Character.isDigit(ch)){
                temp += ch;
            }else{
                sum += Integer.parseInt(temp);
                temp = "0";
            }
        }

        sum += Integer.parseInt(temp);

        System.out.println("Sum of numbers: " + sum);
    }
}
