import java.util.Scanner;

public class SquareTwoNumbers{
    public static void main(String [] args){
        Scanner solve = new Scanner(System.in);
            //first number
        System.out.println("Enter the length of side a");
        double a = solve.nextDouble();
            //second number
        System.out.println("Enter the length of sie b");
        double b = solve.nextDouble();
            //final formula
        double c = Math.sqrt((a*a + b*b));

            //output 
        System.out.println("The Answer is: "+c);

        solve.close();
    }
}