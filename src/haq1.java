import java.util.Scanner;

/**
 * Question-1:
 * Write a program to find the first non-repeated character in a given String, for example, if the
 * given String is "Java" then the first non-repeated character is "J".
 */
public class haq1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string:");
        String name = sc.nextLine();
        System.out.println("the given string is:" + name);
        int c = repeat(name);
        if (c != -1)
            System.out.println("the first non repeated charecter in string is" +
                    " :" + name.charAt(c));
        else
            System.out.println("no repeated character");
    }


    public static int repeat(String str){
        for (int i = 0;i<str.length();i++){
            boolean fun = true;
            for (int j = 0 ;j<str.length();j++){
                if(i!=j && str.charAt(i)==str.charAt(j)){
                    fun =false;
                }


            }if (fun)
                return i;
        }return -1;
    }
}
