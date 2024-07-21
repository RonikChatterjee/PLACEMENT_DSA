// ROCK, PAPER & SCISSOR GAME
package Java_DSA_Interview_Preparation_Course.CWH;
import java.util.Scanner;
import java.util.Random;

public class Exercise2RockPaperScissor {
    public static void main(String[] args) {
        System.out.println("\t\tROCK, PAPER & SCISSOR GAME");
        System.out.println("Result will be declared on the basis of best of five attempts:");
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        byte win = 0, lost = 0;
        byte i = 0;
        while (i < 5) {
            System.out.printf("\t\t\tRound(%d)\n\n", i+1);
            System.out.print("1: Rock\n2: Papper\n3: Scissor\nEnter your choice from 1 - 3: -> ");
            // Taking input of User's Choice
            byte choice = scan.nextByte();
            // Genarating Random Number:
            int rand_num = rand.nextInt(3);
            String s_choice;
            // Computer's Choice:
            if (rand_num == 0) {
                s_choice = "Rock";
            }
            else if (rand_num == 1) {
                s_choice = "Paper";
            }
            else {
                s_choice = "Scissor";
            }
            // Comparing User's Choice with Computer's Choice & Calculating Result of each Round.
            switch (choice) {
                case 1: System.out.printf("Your Choice -> Rock\t\tComputer's Choice -> %s\n", s_choice);
                if (s_choice == "Rock") {

                    System.out.println("You have tied this round.");
                }
                else if (s_choice == "Paper") {
                    
                    lost++;
                    System.out.println("You have lost this round.");
                }
                else {
                    win++;
                    System.out.println("You have won this round.");
                }
                break;
                
                case 2: System.out.printf("Your Choice -> Paper\t\tComputer's Choice -> %s\n", s_choice);
                if (s_choice == "Rock") {

                    win++;
                    System.out.println("You have won this round.");
                }
                else if (s_choice == "Paper") {
                    
                    System.out.println("You have tied this round.");
                }
                else {
                    lost++;
                    System.out.println("You have lost this round.");
                }
                break;
                
                case 3: System.out.printf("Your Choice -> Scissor\t\tComputer's Choice -> %s\n", s_choice);
                if (s_choice == "Rock") {

                    lost++;
                    System.out.println("You have lost this round.");
                }
                else if (s_choice == "Paper") {
                    
                    win++;
                    System.out.println("You have won this round.");
                }
                else {
                    System.out.println("You have tied this round.");
                }
                break;

                default: System.out.println("You have entered incorrect option.");
            }
            i++;
        }
        // Calculating the Final Result
        System.out.println("\t\tResult\n");
        if (win == lost) {
            System.out.printf("\t\tGame Tied\nWin -> %d\tLost -> %d\tTied -> %d\n", win, lost, 5-(win + lost));
        }
        else if (win > lost) {
            System.out.printf("\t\tGame Won\nWin -> %d\tLost -> %d\tTied -> %d\n", win, lost, 5-(win + lost));
        }
        else {
            System.out.printf("\t\tGame Lost\nWin -> %d\tLost -> %d\tTied -> %d\n", win, lost, 5-(win + lost));
        }
        scan.close();
    }
}