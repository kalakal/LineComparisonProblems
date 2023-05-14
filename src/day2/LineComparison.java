package day2;
import java.util.*;

public class LineComparison {

    double LinePQ(double x1, double x2, double y1, double y2) {

        double a=Math.pow(x2-x1, 2);
        double b=Math.pow(y2-y1, 2);
        double c= a*x1 + b*y1;
        double length1=Math.sqrt(a+b);

        if (b < 0) {
            System.out.println(
                    "The line passing through points P and Q:: "
                            + a + "x - " + b + "y = " + c);
        }
        else {
            System.out.println(
                    "The line passing through points P and Q:: "
                            + a + "x + " + b + "y = " + c);
        }
        System.out.println("Length of Line= "+length1);
        System.out.println();
        return length1;
    }

    double LineRS(double x3, double x4, double y3, double y4) {

        double a=Math.pow(x4-x3, 2);
        double b=Math.pow(y4-y3, 2);
        double c= a*x3 + b*y3;
        double length2=Math.sqrt(a+b);

        if (b < 0) {
            System.out.println(
                    "The line passing through points R and S:: "
                            + a + "x - " + b + "y = " + c);
        }
        else {
            System.out.println(
                    "The line passing through points R and S:: "
                            + a + "x + " + b + "y = " + c);
        }
        System.out.println("Length of Line= "+length2);
        System.out.println();
        return length2;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Problems");
        Scanner in=new Scanner(System.in);

        System.out.println("Enter x1, x2, y1, y2 for PQ: ");
        int x1=in.nextInt();
        int x2=in.nextInt();
        int y1=in.nextInt();
        int y2=in.nextInt();

        System.out.println("Enter x3, x4, y3, y4 for RS: ");
        int x3=in.nextInt();
        int x4=in.nextInt();
        int y3=in.nextInt();
        int y4=in.nextInt();

        LineComparison objPQ=new LineComparison();
        LineComparison objRS=new LineComparison();

        boolean lineCheck  = Objects.equals(objPQ.LinePQ(x1, x2, y1, y2), objRS.LineRS(x3, x4, y3, y4));

        if (lineCheck == true)
            System.out.println("The lines PQ and RS are equal");
        else
            System.out.println("PQ and RS are not equal");

    }
}
