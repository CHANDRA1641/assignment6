import java.util.Scanner;

public class question9 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the values:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        double area1= areaOfTriangle(a,b);
        double area2=areaOfSquare(a);
        double area3=areaOfCircle(a);
        double area4=areaOfRectangle(a,b);
        System.out.println("Area of triangle:"+area1);
        System.out.println("Area of Square:"+area2);
        System.out.println("Area of circle:"+area3);
        System.out.println("Area of rectangle:"+area4);
    }
    public static double areaOfTriangle(int h,int b) {
        double area=(h*b)/2;
        return area;
    }
    public static double areaOfSquare(int h) {
        double area=(h*h);
        return area;
    }
    public static double areaOfCircle(int r) {
        double pi=Math.PI;
        double area=(pi*r*r);
        return area;
    }
    public static double areaOfRectangle(int l,int b) {
        double area=(l*b);
        return area;
    }

}

