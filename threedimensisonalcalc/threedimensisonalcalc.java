import java.math.*;
public class threedimensisonalcalc{
    static void calc(){
        double x = 8d;
        double y = 12d;
        double z = 30d;
        double x2 = 19d;
        double y2 = 22d;
        double z2 = 40d;
        double x3;
        double y3;
        double z3;
        double unSquaredAnswer;
        double Result;
        
        x3 = x2 - x;
        y3 = y2 - y;
        z3 = z2 - z;

        x3 = Math.sqrt(((Math.pow(x3, 2))));
        y3 = Math.sqrt(((Math.pow(y3, 2))));
        z3 = Math.sqrt(((Math.pow(z3, 2))));
        
        x3 = Math.pow(x3, 2);
        y3 = Math.pow(y3 ,2);
        z3 = Math.pow(z3 ,2);
        

        unSquaredAnswer= x3 + y3 + z3;
        Result = Math.sqrt(unSquaredAnswer);
        System.out.println(Result);
        
    }
    public static void main(String[] args){
        calc();
    }
}