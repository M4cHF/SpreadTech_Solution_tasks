import java.util.Scanner;
import java.lang.Math;


class NumbGuessingGame {
    public static void main(String[] args) {
        System.out.println("Guess what ....");
        Scanner input = new Scanner(System.in);

        System.out.println("INSTRUCTION :\nYou have to guess a number between 1 and 100.\nEverytime your wrong w'll give a hint too high OR too low");
        System.out.println("!!! HAVE FUN !!!");
        // generate arndom number name "goal"
        int goal = (int)(Math.random() *100);
        int guess;
        do{
                System.out.println("Take a guess...");
                guess = input.nextInt();
                if (guess > goal) {System.out.println("Too high");}
                if (guess < goal) {System.out.println("Too low");}
        }while(guess != goal );
            
        System.out.println("    YOU WIN    ");
        
    }
}