package Java_DSA_Interview_Preparation_Course;
import java.util.Scanner;
//Lecture 6(Exercise 1)
public class PercentageCalculator {
    public static void main(String[] args) {
        System.out.println("Percentage Calculator");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks of 1st subject: ");
        int sub1 = sc.nextInt();
        System.out.print("Enter the marks of 2nd subject: ");
        int sub2 = sc.nextInt();
        System.out.print("Enter the marks of 3rd subject: ");
        int sub3 = sc.nextInt();
        System.out.print("Enter the marks of 4th subject: ");
        int sub4 = sc.nextInt();
        System.out.print("Enter the marks of 5th subject: ");
        int sub5 = sc.nextInt();
        sc.close();
        float percentage = (float)(sub1 + sub2 + sub3 + sub4 + sub5) / 5;
        System.out.println("The percentage is: " + percentage);
    }
}
