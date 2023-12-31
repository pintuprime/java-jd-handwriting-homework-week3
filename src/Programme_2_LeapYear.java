import java.util.Scanner;
/*
 *Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */
public class Programme_2_LeapYear {
    public static void main(String[] args) {
        //scanner declaration for reading the input from console
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        Programme_2_LeapYear leapYear = new Programme_2_LeapYear();
        leapYear.isItLeapYear(year);
        scanner.close();//scanner close
    }
    //checking is it leap year or not
    public void isItLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("The year " + year + " is leap year");
            return;
        }
        System.out.println("The Year " + year + "is not a leap year");
    }
}



