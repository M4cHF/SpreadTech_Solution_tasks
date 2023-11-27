import java.util.ArrayList; 
import java.util.Scanner;


public class ToDoList
{
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> todo = new ArrayList<String>();
        String proceed = "y";
        while(proceed.equals("y")){
            view_menu();
            int sel = select_function();
            if(sel == 1){
                view_todo(todo) ;
            }
            if(sel == 2){
                add_todo(todo) ;
            }
            if(sel == 3){
                System.out.println("Enter index of row you want to delete :");
                int index = input.nextInt();
                //todo.clear() ;
                todo.remove(index - 1) ;
            }

            System.out.println("Want to proceed !! Go ahead and type \"y\" ...or type anything else. ");
            proceed = input.nextLine();
        }
	}
	static void view_menu() {
        System.out.println("**** To-Do Menu ****");
        System.out.println("-1- view To-Do .");
        System.out.println("-2- Add To-Do .");
        System.out.println("-3- Remove To-Do .");
        System.out.println("Pick a function from the list above. ");
    }
    static int select_function() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while(n < 1 || n > 3){
            System.out.println("Try selecting a number from 1, 2, or 3.");
            n = input.nextInt();}
        return n; 
    }
    static void view_todo(ArrayList<String> t) {
        System.out.println("**** To-Do List ****");
        for(int i=0; i < t.size() ;i++){
            System.out.println("-"+ (i+1) +"- " + t.get(i));
        }    
    }
     static void add_todo(ArrayList<String> t) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type your To-Do :"); 
        String adding_todo = input.nextLine();
        t.add(adding_todo);
    }
    
}