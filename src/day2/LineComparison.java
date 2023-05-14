package day2;
import java.util.*;
public class LineComparison {

    static double lineCalculation(double x1, double x2, double y1, double y2) {
        double a=Math.pow(x2-x1, 2);
        double b=Math.pow(y2-y1, 2);
        double c= a*x1 + b*y1;
        double length=Math.sqrt(a+b);

        if (b < 0) {
            System.out.println(
                    "The line passing through points P and Q:: "
                            + a + "x - " + b + "y = " + c);
        }
        else {
            System.out.println(
                    "The line passing through points P and Q is: "
                            + a + "x + " + b + "y = " + c);
        }
        System.out.println("Length of Line= "+length);
        return length;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Problems");
        Scanner in=new Scanner(System.in);

        System.out.print("Enter x1:");
        int x1=in.nextInt();

        System.out.print("Enter y1:");
        int y1=in.nextInt();

        System.out.print("Enter x2:");
        int x2=in.nextInt();

        System.out.print("Enter y2:");
        int y2=in.nextInt();

        double lengthPQ=lineCalculation(x1, x2, y1, y2);
    }
}