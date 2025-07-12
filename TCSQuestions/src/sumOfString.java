package TCSQuestions.src;

public class sumOfString {
    public static void main(String[] args) {
        String str = "abc12xy3z5";
        int sum = 0;
        String temp = "";

        for(int i=0; i< str.length(); i++){

            char ch = str.charAt(0);

            if(Character.isDigit(ch)){
                temp +=ch;
            }
        }
    }
}
