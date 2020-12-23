import java.util.Scanner;
public class vending {
    public static void main(String[] args){
        Scanner input = new  Scanner(System.in);
        
        System.out.println("Press \n1_Cold drinks \n2_Snacks \n3_cereal \n input: ");
        int userInput = input.nextInt();
        if(userInput == 1){
            System.out.println("Press \n1_Cola (3$) \n2_Dr.Pepper(4$) \n3_Pepsi (5$) \n input: ");
            int userSubSelection = input.nextInt();
            if(userSubSelection == 1){
                System.out.println("how many colas");
                int numberof = input.nextInt();
               double totalAmount = numberof * 3;
                System.out.println("total Amount = " + totalAmount);
            }
            else if(userSubSelection == 2){
                System.out.println("how many Dr.Peppers");
                int numberof = input.nextInt();
               double totalAmount = numberof * 4;
                System.out.println("total Amount = " + totalAmount);
            }
            else if(userSubSelection == 3){
                System.out.println("how many Pepsis");
                int numberof = input.nextInt();
               double totalAmount = numberof * 5;
                System.out.println("total Amount = " + totalAmount);
            }
            else{
                System.out.println("Invalid input");
            }
        }
        else if(userInput == 2){
            System.out.println("you selected Snacks");
            System.out.println("Press \n1_bbq chips(4.25) \n2_salt and vinger chips(3.99) \n3_cookies(1.99) \n input: ");
            int userSubSelection = input.nextInt();
            if(userSubSelection == 1){
                System.out.println("how many bbq chips");
                int numberof = input.nextInt();
               double totalAmount = numberof * 4.25;
                System.out.println("total Amount = " + totalAmount);
            }
            else if(userSubSelection == 2){
                System.out.println("how many salt and vinger chips");
                int numberof = input.nextInt();
               double totalAmount = numberof * 3.99;
                System.out.println("total Amount = " + totalAmount);
            }
            else if(userSubSelection == 3){
                System.out.println("you selected cookies");
                int numberof = input.nextInt();
               double totalAmount = numberof * 1.99;
                System.out.println("total Amount = " + totalAmount);
            }
            else{
                System.out.println("Invalid input");
            }
        }
        else if(userInput == 3){
            System.out.println("Press \n1_Cheerios(5.99) \n2_Captain Crunch(6.99) \n3_Fruit loops(2.99)  \n input:");
            int userSubSelection = input.nextInt();
            if(userSubSelection == 1){
                System.out.println("how many Cheerios");
                int numberof = input.nextInt();
               double totalAmount = numberof * 5.99;
                System.out.println("total Amount = " + totalAmount);
            }
            else if(userSubSelection == 2){
                System.out.println("how many Captain Crunch");
                int numberof = input.nextInt();
               double totalAmount = numberof * 6.99;
                System.out.println("total Amount = " + totalAmount);
            }
            else if(userSubSelection == 3){
                System.out.println("how many Fruit loops");
                int numberof = input.nextInt();
               double totalAmount = numberof * 2.99;
                System.out.println("total Amount = " + totalAmount);
            }
            else{
                System.out.println("Invalid input");
            }
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
