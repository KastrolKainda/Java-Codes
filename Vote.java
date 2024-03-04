import java.util.Scanner;

public class Vote {
    public static void main (String [] arggs) {

        Scanner vote = new Scanner(System.in);

            //declaration of variable age
        int age;
        System.out.print("Enter your age \n");
            age = vote.nextInt();

                //if age is >= 18yrs
            if(age >= 18){
                System.out.print("WELCOME, YOU ARE ELIGIBLE TO VOTE\n");

                        //assigning the variable x
                    int x = 1;
                    System.out.print("Press 1 to continue \n");
                        x = vote.nextInt();

                    if(x == 1){
                        System.out.print("Choice the type of Election\n");
                        System.out.print(" 1. Presidential Elections\n 2. Vice Presidential Election\n 3. Prime Minister Elections\n 4. Ministers Elections\n 5. Other Elections\n");

                            //declaration of variable y
                        int y;
                        y = vote.nextInt();
                            // option 1
                        if (y == 1){
                            System.out.print("You have select Presidential Elections\nSelect your Candidate\n");
                            System.out.print(" 1. Peter Pan\n 2. Tom Jerry\n 3. PJ Mask\n");
                        }
                        
                            // option 2 
                        else if(y == 2){
                             System.out.print("You have select Vice Presidential Elections\nSelect your Candidate\n");
                            System.out.print(" 1. Jean P\n 2. Micky M\n 3. Pappi D\n");
                        }
                        
                        else if(y == 3){

                             System.out.print("You have select Prime Minister Elections\nSelect your Candidate\n");
                            System.out.print(" 1. Kinds\n 2. Mie\n 3. Shimi\n");
                        }

                        else if( y == 4){
                             System.out.print("You have select Ministers Elections\nSelect your Candidate\n");
                            System.out.print(" 1. Mac\n 2. Daffu\n 3. Crazy\n");

                        }

                        else if (y == 5){
                             System.out.print("You have select Other Elections\nSelect your Choice\n");
                            System.out.print(" 1. Vice Ministers\n 2. Coucilor\n 3. Members Of Parliament\n");

                        }
                        else {
                            System.out.print("Invalid Option Entered");
                        }

                    }
                    
                    else{
                        System.out.print("The option you have entered is Invalid!! \n\n");
                    }
            }

                //if age is < 18yrs
            else{
                System.out.print("Sorry, you can't VOTE!!\n\n");
            }

            vote.close();
    }
}
