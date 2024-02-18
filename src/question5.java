import java.util.Scanner;

/**
 * Question-5:
 * A regular polygon is an n-sided polygon in which all sides are of the same length and all angles
 * have the same degree (i.e., the polygon is both equilateral and equiangular). The formula for
 * computing the area of a regular polygon is
 *Area = 𝑛 × 𝑆^2/(4*tan(pi/9))
 *
 * Write a method that returns the area of a regular polygon using the following header:
 * public static double area(int n, double side)
 */
public class question5 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("write the  number of sides:");
        int n = sc.nextInt();
        System.out.println("write the length of side:");
        double s = sc.nextDouble();
        System.out.println("the area of given polygon is :"+area(n,s));

    }
    public static double area(int n,double s){
        double area = (n*Math.pow(s,2))/(4*Math.tan(Math.PI/9));
        return area;


    }

}
