import java.util.Scanner; //java library
public class SUM {
    public static void main(String[]args){
        Scanner box = new Scanner (System.in);
            //SUM OF TWO NUMBERS >>COMMENT 1
            System.out.println("Enter the first number");
            double firstnumber = box.nextDouble();

            System.out.println("Enter the second number");
            double secondnumber = box.nextDouble();

                //formula for SUM
            double sum = firstnumber + secondnumber;
                //formula for product
            double product = firstnumber * secondnumber;
            
            System.out.println("The Sum of Two numbers is "+sum); //FOR SUM
            System.out.println("The Product of Two numbers is "+product);   //FOR PRODUCT


        box.close();
    }
    
}
