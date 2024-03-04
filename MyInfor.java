import java.util.Scanner;

public class MyInfor{

    public static void main (String []args){

                //THIS PART IS STATIC SIMPLE INFORMATION ABOUT MYSELF
            System.out.println("My name is Kainda Castrol.\nYou can find me on H/No: 227/75 Ibex Extension\nand my Cell Number is +26(0)978-027-616.\nHowever, am a student of CUZ doing BSc in Computing. \nTherefore, Programming in Java (COM 324) is one of the Modules am taking.");
            System.out.println("\nTHANK YOU !!");


                //THIS PART IS DYNAMIC SIMPLE INFORMATION ABOUT MYSELF
            System.out.println("\n>>>>> LETS TRY THIS AND SEE >>>>>");
            Scanner MyInfor = new Scanner (System.in);
            String name, address, module, mobile;
         
                    //your full names
            System.out.println("Enter your Full Names");
            name = MyInfor.nextLine();

                    //your address
            System.out.println("Enter your Physical Address");
            address = MyInfor.nextLine();

                    //your module
            System.out.println("Enter your Module Name");
            module = MyInfor.nextLine();

                    //your mobile
            System.out.println("Enter your Cell Number");
            mobile = MyInfor.nextLine();


                    //OUPUT PART OF YOUR INFORMATION
            System.out.println("\nYour Name is " +name);
             System.out.println("Your Home Address is " +address);
              System.out.println("Your  Module is " +module);
               System.out.println("Your Cell Number is " +mobile);
                System.out.println("\nTHANK YOU!!");

                MyInfor.close();

    }


}
