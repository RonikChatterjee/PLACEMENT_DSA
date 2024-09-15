package Java_DSA_Interview_Preparation_Course.CWH;
import java.util.Scanner;

public class PracticeSet5 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
// Question 1: Write a program to print the following pattern:
        /* * * * 
         * * *
         * *
         * 
        */

        // System.out.print("Enter no. of rows: -> ");
        // int rows = scan.nextInt();
        // for (int i = rows; i > 0; i--) {
        //     for (int j = i; j > 0; j--) {
        //         System.out.printf("* ");
        //     }
        //     System.out.print("\n");
        // }
        // scan.close();

// Question 2: Write a Java Program to sum first n even numbers using while loop

        // System.out.print("Enter the value of \'n\': -> ");
        // int n = scan.nextInt();
        // System.out.printf("First %d Even Numbers are:  ",n);
        // int i = 0, sum = 0;
        // while (i < n) {
        //     sum += (2 * i);
        //     System.out.printf("%d ", 2 * i);
        //     i++;
        // }
        // System.out.printf("\nSum of first %d even numbers is %d.", n, sum);
        // scan.close();
        
// Question 3: Write a Java Program to print multiplication table of a given number n.
        
        // System.out.print("Enter a number to calculate its multiplication table: -> ");
        // int n = scan.nextInt();
        // System.out.printf("\tMultiplication Table of %d:\n\n", n);
        // for (int i = 1; i <= 15; i++) {
        //     System.out.printf("\t\t%2d  *  %d  =  %2d\n", i, n, (i * n));
        // }
        // scan.close();
                
// Question 4: Write a Java Program to print multiplication table of 10 in reverse order.
                
        // System.out.print("\tMultiplication Table of 10:\n\n");
        // for (int i = 15; i > 0; i--) {
        //     System.out.printf("\t\t%2d  *  10  =  %3d\n", i, (i * 10));
        // }
        
// Question 5: Write a Java Program to find the factorial of a givenumber using for loop.
        
        // System.out.print("Enter a number: -> ");
        // short n = scan.nextShort();
        // int fact = 1;
        // for (int i = 1; i <= n; i++) {
        //     fact = fact * i;
        // }
        // System.out.printf("Factorial of %d is %d.", n, fact);
        // scan.close();
        
// Question 6: Repeat 5 using while loop.
        
        // System.out.print("Enter a number: -> ");
        // short n = scan.nextShort();
        // int fact = 1, i = 1;
        // while (i <= n) {
        //     fact = fact * i;
        //     i++;
        // }
        // System.out.printf("Factorial of %d is %d.", n, fact);
        // scan.close();
        
// Question 9: Write a Java Program to calculate the sum of the numbersoccuring in the multiplication table of number 8.
        
        // System.out.print("\tMultiplication Table of 8:\n\n");
        // int sum = 0;
        // for (int i = 1; i <= 15; i++) {
        //     System.out.printf("\t\t%2d  *  8  =  %3d\n", i, (i * 8));
        //     sum += (i * 8);
        // }
        // System.out.printf("Sum of the above multiplication table is %d.", sum);
        // scan.close();
        
// Question 10: A do while loop is executed
// At least once
        
        // byte x = 0;
        // do{
        //         System.out.println("This loop will run only once.");
        //         x++;
        // }while(x < 1);       
        
// At least twice
        
        // byte x = 0;
        // do{
        //         System.out.println("This loop will run two times.");
        //         x++;
        // }while(x < 2);       
        
// At most once
        
        // byte x = 0;
        // do{
        //         System.out.println("This loop will run three times.");
        //         x++;
        // }while(x < 3);      
                                
// Question 11: Repeat No.2 using for loop.
                                
        System.out.print("Enter the value of \'n\': -> ");
        int n = scan.nextInt();
        System.out.printf("First %d Even Numbers are:  ",n);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (2 * i);
            System.out.printf("%d ", 2 * i);
        }
        System.out.printf("\nSum of first %d even numbers is %d.", n, sum);
        scan.close();
        }
}
                