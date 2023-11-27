import java.util.Scanner;
import java.lang.Math;
import java.util.Random;


class PRS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random randomNum = new Random();
        System.out.println("Paper,Rock,,Scissors");
        System.out.println("INSTRUCTION :\nYou're going to play against the computer and we'll see who wins");
        System.out.println("the game is quite simple \nPaper beats Rock, \nRock beats Scissors\nand Scissors beats Paper ");
        System.out.println("You shoowe first and the computer will shoose randomly");
        System.out.println("Select : \n1 : Paper \n2 : Rock \n3 : Scissors");
        
        int choice;
        choice = input.nextInt();
        while(choice < 1 || choice > 3){
            System.out.println("Try selecting a number from 1, 2, or 3.");
            choice = input.nextInt();} 

        int computerChoice;
        computerChoice = randomNum.nextInt(3) + 1;
        String choiceList[] = {"Paper", "Rock", "Scissors"};
        
        if (choice == computerChoice){ 
            System.out.println("Computer selected : " + choiceList[computerChoice - 1]);
            System.out.println("There was a tie, and nobody prevailed.");}
        else if(((choice == 1) && (computerChoice == 2)) || ((choice == 2) && (computerChoice == 1)) || ((choice == 3) && (computerChoice == 1))){
            System.out.println("Computer selected : " + choiceList[computerChoice - 1]);
            System.out.println("You win, Good Job !!!"); }
        else{
            System.out.println("Computer selected : " + choiceList[computerChoice - 1]);
            System.out.println("Computer win, \nhard luck next time"); }
        
        
    }
}