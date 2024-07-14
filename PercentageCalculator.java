package Java_DSA_Interview_Preparation_Course;
import java.util.Scanner;
//Lecture 6(Exercise 1)
public class PercentageCalculator {
    public static void main(String[] args) {
        System.out.println("Percentage Calculator");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks of 1st subjects: ");
        int sub1 = sc.nextInt();
        System.out.print("Enter the marks of 2nd subjects: ");
        int sub2 = sc.nextInt();
        System.out.print("Enter the marks of 3rd subjects: ");
        int sub3 = sc.nextInt();
        System.out.print("Enter the marks of 4th subjects: ");
        int sub4 = sc.nextInt();
        System.out.print("Enter the marks of 5th subjects: ");
        int sub5 = sc.nextInt();
        int percentage = (sub1 + sub2 + sub3 + sub4 + sub5) / 5;
        System.out.println("The percentage is: " + percentage);
    }
}
