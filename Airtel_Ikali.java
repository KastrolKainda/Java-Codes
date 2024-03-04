import java.util.Scanner;

public class Airtel_Ikali {
    public static void main(String [] args){
        
        System.out.print("\nPLEASE DIAL *117# TO ACCESS THIS SERVICE");

        Scanner ikali = new Scanner(System.in);

            String dial = "*117#";
            System.out.println("\nEnter the Code ");
                dial = ikali.nextLine();
            if (dial=="*117#"){
                System.out.println("1. Ikali - Data and Voice\n2. Airtel Soche Pack\n3. All network Soche\n4. Data Packs\n5. Buy for others\n6. Balance Chech\n7. Siliza - Airtime Loan\n8. INTL calling & roaming");
                int sel = ikali.nextInt();
                        //case 1 of option 1
                 if (sel == 1){
                    System.out.println("Select:\n1. K2=12 Min Onnet, 24Hrs\n2. K2=12 All Networks Min, 24Hrs\n3. K5=35 Airtel Min, 7Days\n4. K2=150MB, 24Hrs\n5. K5=400MB, 7Days\n6. K10=2GB, 7Days");
                    int select = ikali.nextInt();
                 }
                 else if (sel == 2){

                 }
                 else if (sel == 3){

                 }
                 else if (sel == 4){

                 }
                 else if(sel == 5){

                 }
                 else if(sel == 6){

                 }
                 else if(sel == 7){

                 }
                 else if(sel == 8){

                 }
                 else{
                    System.out.print("Invalid request:\n");
                 }
            }

            else{
                System.out.println("Invalid MMI code");
            }

            ikali.close();
    }

}
