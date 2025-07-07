package TCSQuestions.src;

public class ReverseNumber {

    public static int reverseNumber(int number, int reversed) {
        if (number == 0) {
            return reversed;
        }
        int remainder = number % 10;
        reversed = reversed * 10 + remainder;
        return reverseNumber(number / 10, reversed);
    }

    public static int countZero(int number, int count){
        if(number == 0) {
            return count;
        }
        int rem = number % 10;
        if(rem == 0){
            return countZero(number/10,count+1);
        }else{
            return  countZero(number/10,count);
        }

    }

    public static void main(String[] args) {
        int number = 10462509;
        int count =0;
        int reversed = reverseNumber(number, 0);
        System.out.println("Reversed number: " + reversed);
        System.out.println("Number of zeros : "+ countZero(number, count));
    }


}

