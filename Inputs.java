import java.util.Scanner;


public class Inputs {
    public static void main(String [] args){

     //   Scanner scanner = new Scanner(System.in);

        Scanner names = new Scanner(System.in);

        String firstname, lastname;
        int age;

        System.out.println("Enter your first name: ");
        firstname = names.nextLine();

        System.out.println("Enter your last name: ");
        lastname = names.nextLine();

        System.out.println("Enter your age: ");
        age = names.nextInt();

        System.out.println("Hello " +firstname+" "+lastname);
        System.out.println("you are "+age+" years old.THANK YOU BA "+firstname+"!!!\n\n");



            /* 
        System.out.println("Enter your first name");
        String fname =  scanner.nextLine();
        

        System.out.println("Enter your last name");
        String lname = scanner.nextLine();
         

       // Scanner kinds = new Scanner (System.in);
        // System.out.print(kinds.nextLine());

        System.out.println("Hello " +fname +lname);

        */

        names.close();
    }
}
