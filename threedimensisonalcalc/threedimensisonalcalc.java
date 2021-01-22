import java.util.Scanner;
public class ThreeDimensisonalCalc{
    static void calc(double x, double y, double z, double x2, double y2, double z2){
        
        double unSquaredAnswer;
        double Result;
        double x3 = Math.pow(x2 - x, 2);
        double y3 = Math.pow(y2 - y, 2);
        double z3 = Math.pow(z2 - z, 2);

        unSquaredAnswer = x3 + y3 + z3;
        Result = Math.sqrt(unSquaredAnswer);
        System.out.println("Your answer is " + Result);

    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("type your first int: ");
        double x = input.nextDouble();
        System.out.println("type your second int: ");
        double y = input.nextDouble();
        System.out.println("type your third int: ");
        double z = input.nextDouble();
        System.out.println("type your second set of ints");
        System.out.println("type your first int: ");
        double x2 = input.nextDouble();
        System.out.println("type your second int: ");
        double y2 = input.nextDouble();
        System.out.println("type your third int: ");
        double z2 = input.nextDouble();
        calc(x, y, z, x2, y2, z2);
        input.close();
    }
}