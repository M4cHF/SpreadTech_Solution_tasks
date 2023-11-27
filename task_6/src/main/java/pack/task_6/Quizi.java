/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pack.task_6;

/**
 *
 * @author Fadi
 */
public class Quizi {
    String question;
    String answer;
    int indexOFRightAnswer;
    String q1;
    String q2;
    String q3;
    String q4;
    int numQuestion = 0 ;
    Quizi(){
        
    }
    Quizi(int numQuestion,String question,String answer,String q1,String q2,String q3,String q4,int indexOFRightAnswer){
        this.question = question;
        this.answer = answer ;
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
        this.q4 = q4;
        this.indexOFRightAnswer = indexOFRightAnswer;
        this.numQuestion += 1 ;
    }
    public void show_Question(){
        System.out.println("*** Question n° " + this.numQuestion + "***");
        System.out.println("+ " + this.question + "?");
        System.out.println("-1-" + this.q1 + ".");
        System.out.println("-2-" + this.q2 + ".");
        System.out.println("-3-" + this.q3 + ".");
        System.out.println("-4-" + this.q4 + ".");
    }
    public void show_Answer(){
        System.out.println("the right answer is : " + this.answer + ".");
    }
}