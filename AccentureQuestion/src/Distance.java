package AccentureQuestion.src;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of x1 and y1 of point A :");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.println("Enter value of x2 and y2 of point A :");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        System.out.println("Enter value of x3 and y3 of point A :");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        System.out.print("Sum of distance of all 3 points : "+ sum(x1,y1, x2,y2, x3,y3));
    }

    private static double sum(double x1, double y1, double x2, double y2, double x3, double y3){
        double sum = 0;
        sum += sumtwo(x1,y1,x2,y2);
        sum += sumtwo(x2,y2,x3,y3);
        sum += sumtwo(x1,y1,x3,y3);
        return sum;
    }

    private static double sumtwo(double x1, double y1, double x2, double y2){
        return Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
    }
}
