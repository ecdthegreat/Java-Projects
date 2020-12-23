import java.util.Scanner;
public class vending {
    public static void main(String[] args){
        Scanner input = new  Scanner(System.in);
        while(true){
        System.out.println("Press \n1_Cold drinks \n2_Snacks \n3_Cereal \n Input: ");
        int userInput = input.nextInt();
        if(userInput == 1){
            System.out.println("Press \n1_Cola (3$) \n2_Dr.Pepper(4$) \n3_Pepsi (5$) \n Input: ");
            int userSubSelection = input.nextInt();
            if(userSubSelection == 1){
                System.out.println("How many colas");
                int numberof = input.nextInt();
               double totalAmount = numberof * 3;
                System.out.println("total Amount = " + totalAmount);
            }
            else if(userSubSelection == 2){
                System.out.println("How many Dr.Peppers");
                int numberof = input.nextInt();
               double totalAmount = numberof * 4;
                System.out.println("total Amount = " + totalAmount);
            }
            else if(userSubSelection == 3){
                System.out.println("How many Pepsis");
                int numberof = input.nextInt();
               double totalAmount = numberof * 5;
                System.out.println("total Amount = " + totalAmount);
            }
            else{
                System.out.println("Invalid input");
            }
        }
        else if(userInput == 2){
            System.out.println("You selected Snacks");
            System.out.println("Press \n1_Bbq chips(4.25) \n2_Salt and vinger chips(3.99) \n3_Cookies(1.99) \n Input: ");
            int userSubSelection = input.nextInt();
            if(userSubSelection == 1){
                System.out.println("How many bbq chips");
                int numberof = input.nextInt();
               double totalAmount = numberof * 4.25;
                System.out.println("total Amount = " + totalAmount);
            }
            else if(userSubSelection == 2){
                System.out.println("How many salt and vinger chips");
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
            System.out.println("Press \n1_Cheerios(5.99) \n2_Captain Crunch(6.99) \n3_Fruit loops(2.99)  \n Input:");
            int userSubSelection = input.nextInt();
            if(userSubSelection == 1){
                System.out.println("How many Cheerios");
                int numberof = input.nextInt();
               double totalAmount = numberof * 5.99;
                System.out.println("total Amount = " + totalAmount);
            }
            else if(userSubSelection == 2){
                System.out.println("How many Captain Crunch");
                int numberof = input.nextInt();
               double totalAmount = numberof * 6.99;
                System.out.println("total Amount = " + totalAmount);
            }
            else if(userSubSelection == 3){
                System.out.println("How many Fruit loops");
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
}
