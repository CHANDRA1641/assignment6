import java.util.Scanner;

/**
 * Design a Simple Calculator using methods in java containing the following functionalities,
 * namely, with Addition, Subtraction, Multiplication, Remainder, Division and Square Root. The
 * signature of the methods are given below.
 *  public static int additionSimple(int x, int y)
 *  Two inputs, x and y. Return the result of adding x to y.
 *  public static int subtractionSimple(int x, int y)
 *  Two inputs, x and y. Return the result of subtracting x from y i.e y-x.
 *  public static int multiplicationSimple(int x, int y)
 *  Two inputs, x and y. Return the result of multiplying x to y i.e. x*y.
 *  public static double divisionSimple(int x, int y)
 *  Two inputs, x and y. Return the result of dividing y by x. Please check whether
 * x is zero before dividing.
 *  public static int remainderSimple(int n, int m)
 *  Please make sure that remainderSimple() takes two inputs, namely, a number
 * (int) n and a number (int) m. The method should return the remainder of n
 * divided by m.
 *  public static double squareRootSimple(int n)
 *  Takes one input, namely a number n, and returns the square root of the number.
 * The return should be double. Please kindly make sure that the number n is
 * positive
 */
public class a6q1 {
    public static int additionsimple(int x,int y){
        int sum = x+y;
        return sum;
    }public static int subtractionsimple(int x ,int y){
        int subtraction = x- y;
        return subtraction;
    }

   public static int multipication(int x, int y){        int multiply = x*y;
        return multiply;
    }   public static double divison(int x , int y){
        double divison = 0 ;
        if(x!=0){
            divison = (double)y/x;
        }
    return divison;
    }
    public static int remainder(int x, int y){
        int rem = x%y;
        return  rem;
    }
    public static double sqrt(int n){
        double sqrt = Math.sqrt(n);
        return sqrt;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
        int sum = additionsimple(a,b);
        System.out.println("the sum will be "+sum);
        int sub = subtractionsimple(a,b);
        System.out.println("the subtraction is: "+sub);
        System.out.println(" ram ram");
        double div = divison(a,b);
        System.out.println("the divison is "+div);
        int rem = remainder(a,b);
        System.out.println("the remainder is = "+rem);
        double sqrt1 = sqrt(a);
        double sqrt2 = sqrt(b);
        System.out.println("the squre root will be :"+sqrt1+" "+sqrt2);
    }

}
