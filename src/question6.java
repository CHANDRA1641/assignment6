import java.util.Scanner;

/**
 * Write a method that finds the number of occurrences of a specified character in a string using
 * the following header:
 * public static int count(String str, char a)
 * For example, count ("Welcome", 'e') returns 2.
 * Write a java program that prompts the user to enter a string followed by a character and
 * displays the number of occurrences of the character in the string
 */
public class question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string ");
        String str = sc.nextLine();
        System.out.println("enter the character whose repetition");
        char ch = sc.next().charAt(0);
        count(str, ch);
    }
    public static void count(String str,char ch){
        int n = str.length();
        int count=0;
        for (int i =0 ;i<n;i++){
            if(str.charAt(i)==ch) count++;
        }
        System.out.println(count);
    }
}
