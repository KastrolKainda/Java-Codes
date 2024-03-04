import java.util.Scanner;

public class Calculator{
    public static void main(String args[]){

        Scanner math = new Scanner(System.in);

            //declaration of the variables
        double x, y, sum, pro, div, sub, avr;

        System.out.print("Enter the value of x:\n");
        x = math.nextDouble();

        System.out.print("Enter the value of y: \n");
        y = math.nextDouble();

            //formula of our claculator
        sum = x + y;
        pro = x * y;
        div = x / y;
        sub = x - y;
        avr = (x + y) / 2;

        System.out.print("The sum is "+sum);
          System.out.print("\nThe product is " +pro);
            System.out.print("\nThe division is " +div);
              System.out.print("\nThe subtration is " +sub);
                System.out.print("\nThe average is " +avr);

      math.close();
    }
}