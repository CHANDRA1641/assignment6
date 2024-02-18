import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of days");
        int n = sc.nextInt();
        int year = n/365;
        int m = n%365;
        int month = m/30;
        int days = m%30;
        System.out.println(year+" year"+month+" month"+days+" days");

    }
}
