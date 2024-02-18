import java.util.Scanner;

/**
 * Write the methods with the following headers
 * // Return the reversal of an integer. Example: reverse (456), returns 654
 * public static int reverse(int number)
 * // Return true if number is a palindrome
 * public static boolean isPalindrome(int number)
 * Use the reverse method to implement isPalindrome. A number is a palindrome if its reversal is
 * the same as itself. Write a java program that prompts the user to enter an integer and reports
 * whether the integer is a palindrome
 */
public class a6q3 {
    public static void main(String[] args) {
        System.out.println("enter the number to chechk whteher its pallindrome or not:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("the reverse of number is "+reverse(num));
        System.out.println("the number is pallindrome :"+ispallindrome(num));
    }
    static boolean ispallindrome(int num){
        int rev2 = reverse(num);
        if(rev2==num)
            return true;
        else
            return false;
    }
    static int reverse(int num){
        int rev1 = 0;
        int vara = num;
        while(vara!=0){
            rev1 = (rev1*10)+vara%10;
            vara = vara/10;

        }return rev1;
    }

}
