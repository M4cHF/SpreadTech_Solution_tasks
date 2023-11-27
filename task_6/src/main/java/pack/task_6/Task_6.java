/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pack.task_6;
import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Quizi []quiz;
        quiz = new Quizi[3];
        quiz[0] = new Quizi(1,"what the capital of England","London","Liveropool","Manchester","York","London",4);
        quiz[1] = new Quizi(2,"what the capital of India","New Delhi","Chenai","New Delhi","Calcutta","Bombay",2);
        quiz[2] = new Quizi(3,"what the capital of USA","New york","Dallas","Nevada","New york","Los Angeles",4);

        int score = 0;
        int userAnswer ;
        for(int i = 0; i < quiz.length ; i++){
            quiz[i].show_Question() ;
            userAnswer = input.nextInt();
            if(userAnswer == quiz[i].indexOFRightAnswer){
                System.out.println("!! Well done !!");
                score += 10;
            }
            else{
                System.out.println(".. Wrong answer ..");
                quiz[i].show_Answer() ;
            }
        }
        System.out.println("Your score is : " + score + "/" + quiz.length * 10 + ".");
    }
}
