import java.util.Scanner;

public class FunctionCall{

    static void sum() {
        System.out.println("The Sum is: ");
        
    }

    public static void main(String[]args){
        Scanner add = new Scanner (System.in);
        
         System.out.println("Enter the first number");
         double x = add.nextDouble();
         System.out.println("Enter the second number");
          double y = add.nextDouble();
            //formula for 
          double sum = x + y;
     
         sum();
    
        add.close();
    }
}