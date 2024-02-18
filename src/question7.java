import java.util.Scanner;

/**
 *Write a java method to check a string is palindrome or not.
 */
public class question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println(reverse(name));
        System.out.println("the given name is pallindrome or not :"+pallindrome(name));

    }
    static boolean pallindrome(String raj){
        String var = reverse(raj);
        if(var.equals(raj))
            return true;
        else
            return false;
    }
    static String reverse(String m){
        String var= "";
        for (int i = m.length()-1;i>=0;i--){
            var = var+ m.charAt(i);

        }
        return var;



    }
}
