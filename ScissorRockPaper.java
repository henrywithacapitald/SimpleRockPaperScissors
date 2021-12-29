import java.util.*;

import javax.lang.model.util.ElementScanner6;
public class ScissorRockPaper{
    public static void main(String[] args) {
        int counter;
        Random rnum = new Random();
        Scanner scan = new Scanner (System.in);
        System.out.println("Rock Paper Scissors");
        System.out.println("Enter your choice!");
        System.out.println("\n 0 for rock \n 1 for paper \n 2 for Scissor \n");
        int user = scan.nextInt();
        
            int computer = rnum.nextInt(3);
            
            int rock = 0;
            int paper = 1;
            int Scissor = 2;
            if (user == computer) {
                System.out.println("Tie");
            } else if (user == rock && computer == paper) {
                System.out.println("Computer Wins: Rock Beats Paper");
            
            } else if (user == paper && computer == rock) {
                System.out.println("User wins Rock Beats Paper");
        } else if (user == paper && computer == Scissor){
            System.out.println("Computer Wins Scissors Beat Paper");
        } else if (user == Scissor && computer == paper){
            System.out.println("User Wins Scissors Beat Paper");
        } else if (user == rock && computer == paper) {
            System.out.println("Computer Wins Paper Beats Rock");
        } else if (user == paper && computer == rock) {
            System.out.println("User picked Paper and Computer picked Rock User Wins Paper beats Rock");
        }

}
}