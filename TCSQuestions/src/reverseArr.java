package TCSQuestions.src;

import java.util.Scanner;

public class reverseArr {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int size = sc.nextInt();
        String[] inputArr = new String[size];
        for(int i=0; i< size; i++){
            inputArr[i] = sc.nextLine();
        }

        for(int i=0; i< size ; i++){
            System.out.print(inputArr[i] + " " );
        }
    }
}
