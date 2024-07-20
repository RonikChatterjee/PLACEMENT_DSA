package Java_DSA_Interview_Preparation_Course.CWH;
// import java.util.Scanner;

public class PracticeSet4 {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        // Question 1: What will be the output of this program
        /*float a = 10;
        if (a = 11) {
            System.out.println("I am 11");
        }
        else {
            System.out.println("I am not 11");
        }*/

        // Output: Compilation Error {(a = 11) cannot be converted to boolean.}

        // Question 2: Write a program to find out whether a student is pass or fail; if it requires total 40% and at least 33% in each subject to pass. Assume 3 subjects and take marks as an input from the user
        
        // System.out.print("Enter the marks of 1st subject: -> ");
        // float marks1 = scan.nextInt();
        // System.out.print("Enter the marks of 2nd subject: -> ");
        // float marks2 = scan.nextInt();
        // System.out.print("Enter the marks of 3rd subject: -> ");
        // float marks3 = scan.nextInt();
        // scan.close();
        // float total = (marks1 + marks2 + marks3) / 3;

        // if (total >= 40 && marks1 >= 33 && marks2 >= 33 && marks3 >= 33) {
        //     System.out.printf("Congrats!!!\n\tYou have passed with %.2f percentage.", total);
        // }
        // else {
        //     System.out.printf("Sorry!!!\n\tYou have failed.");
        // }

        // Question 3: Calculate income tax paid by an employee to the government as per the slabs mentioned bellow:
        /*Income Slab       Tax
            2.5L - 5.0L     5%
            5.0L - 10.0L    20%
            Above 10.0L     30%
         */
        // Note that there is no tax bellow 2.5L.

        //  System.out.print("Enter your yearly income: -> ");
        //  double income = scan.nextDouble();
        //  scan.close();
        //  if (income <= 250000) {
        //     System.out.print("Congrats!!!\n\tYou have no income tax to pay.");
        //  }
        //  else if (income > 250000 && income <= 500000) {
        //     System.out.printf("Income Tax you have to pay is -> %.2f inr.", (5 * income) / 100);
        //  }
        //  else if (income > 500000 && income <= 1000000) {
        //     System.out.printf("Income Tax you have to pay is -> %.2f inr.", (10 * income) / 100);
        //  }
        //  else {
        //     System.out.printf("Income Tax you have to pay is -> %.2f inr.", (20 * income) / 100);
        //  }

        // Question 4: Write a Java Program to find out the day of the week given the number [ 1 for Monday, 2 for Tuesday .... & so on!]

        // System.out.print("Enter your choice from 1 to 7: -> ");
        // byte choice = scan.nextByte();
        // scan.close();
        // switch (choice) {
        //     case 1 -> System.out.print("Monday");
        //     case 2 -> System.out.print("Tuesday");
        //     case 3 -> System.out.print("Wedday");
        //     case 4 -> System.out.print("Thursday");
        //     case 5 -> System.out.print("Friday");
        //     case 6 -> System.out.print("Saturday");
        //     case 7 -> System.out.print("Sunday");
        //     default -> System.out.printf("%d is a wrong choice.", choice);
        // }

        // Question 5: Write a Java Program to find whether a year entered by the user is a leap year or not.

        // System.out.print("Enter the year to be checked: -> ");
        // short year = scan.nextShort();
        // scan.close();
        // System.out.printf("%d is a %s!!!", year, year % 400 == 0 ? "Leap Year" : "not a Leap Year" ); // Ternary Operator

        // Question 6: Write a Java Program to find out the type of website from the url
                /*.com ->   Commercial Website
                  .org ->   Organisation Website
                  .in  ->   Indian Website
                 */

        // System.out.print("Enter the Url to be checked: -> ");
        // String url = scan.nextLine();
        // scan.close();
        // if (url.endsWith(".com")) {
        //     System.out.print("It is a Commercial Website.");
        // }
        // else if (url.endsWith(".org")) {
        //     System.out.print("It is a Commercial Website.");
        // }
        // else if (url.endsWith(".in")) {
        //     System.out.print("It is a Commercial Website.");
        // }
        // else {
        //     System.out.print("It is a different type of Website.");
        // }
    }
}
