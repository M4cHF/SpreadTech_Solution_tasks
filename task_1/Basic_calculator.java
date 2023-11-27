import java.util.Scanner;
import java.lang.String;

class Main {
    public static void main(String[] args) {
        System.out.println("********** BAsic_Calculator ***********");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number : ");
        float num1 = input.nextFloat();
        
    
        System.out.println("Shoose operation (-, +, *, / ) : ");
        String opr = input.next();
        
        float num2 ;
        System.out.println("Enter your second number : ");
        num2 = input.nextFloat();
        
        if(opr.equals("/")){
            while (num2 == 0){
                System.out.println("Enter your second number : ");
                num2 = input.nextFloat();
            };
        }

    
        if (opr.equals("-")){ System.out.println("result = " + (num1 - num2));}
        if (opr.equals("+")) { System.out.println("result = " + (num1 + num2));}
        if (opr.equals("*")) { System.out.println("result = " + (num1 * num2));}
        if (opr.equals("/")) { System.out.println("result = " + (num1 / num2));}
        

    }
}
