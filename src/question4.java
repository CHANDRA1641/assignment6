/**
 * Write a method that returns the number of days in a year using the following header:
 * public static int numberOfDaysInAYear(int year)
 * Write a java program that displays the number of days in year from 2000 to 2020
 */
public class question4 {
    public static int numberofdaysinyear(int year){
        if (year%4==0&&(year%400==0||year%100!=0)){
            return 365;
        }
        else
            return 364;
    }

    public static void main(String[] args) {
        for (int i = 2000;i<=2020;i++){
            System.out.println("number of days in a year "+i+" "+numberofdaysinyear(i));
        }
    }
}
