public class ThreeDimensisonalCalc{
    static void calc(double x, double y, double z, double x2, double y2, double z2){
        double unSquaredAnswer;
        double Result;
        double x3 = Math.pow(x2 - x, 2);
        double y3 = Math.pow(y2 - y, 2);
        double z3 = Math.pow(z2 - z, 2);

        unSquaredAnswer = x3 + y3 + z3;
        Result = Math.sqrt(unSquaredAnswer);
        System.out.println(Result);

    }
    public static void main(String[] args){
        double x = 8d;
        double y = 12d;
        double z = 30d;
        double x2 = 19d;
        double y2 = 22d;
        double z2 = 40d;
        calc(x, y, z, x2, y2, z2);
    }
}