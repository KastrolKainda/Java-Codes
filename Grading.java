import java.util.Scanner;

public class Grading {
    public static void main(String [] args){

        Scanner marks = new Scanner(System.in);

        System.out.println("Enter your marks: ");
          float x = marks.nextFloat();

            if ( x >=81.0 && x <= 100.0){
                System.out.println("You have gotten A+ Grade");
            }

            else if( x >= 61.0 && x <= 80.9){
                System.out.println("You have gotten B+ Grade");
            }

            else if( x >= 40.0 && x <= 59.9){
                System.out.println("You have gotten C+ Grade");
            }

            else if( x >= 0.0 && x <= 39.9){
                System.out.println("You have failed");
            }

            else{
                System.out.println("Invalid marks entered!!\n\n");
            }

            marks.close();
    }
}
