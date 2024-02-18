import java.util.Scanner;

/**
 * A pentagonal number is defined as n (3n–1)/2 for n = 1, 2, . . ., and so on. Therefore, the first
 * few numbers are 1, 5, 12, 22, . . . .
 * Write a method with the following header that returns a pentagonal number:
 * public static int getPentagonalNumber(int n)
 */
public class a6q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j =1;
        for(int i =1 ;i<=n;i++){

                int s = penta(i);
                System.out.print(s+" ");
                j++;
            if(j%10==0){
                System.out.println();
            }
            }





    }
    public static int penta(int n) {
    int pgonal = n*(3*n-1)/2;
    return pgonal;


    }
}
