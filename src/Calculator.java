public class Calculator {

    public static double add(double num1,double num2)
    {
        return num1+num2;
    }
    public static double substract(double num1,double num2)
    {
        return num1-num2;
    }
    //adding here
    public static double multiply(double num1, double num2)
    {
        double m=num1*num2;//this is the conflict
        return m;
    }

    public static double divide(double num1, double num2)
    {
        return num1/num2;

    }

    // trying branching
}
