public class es8 {
    public static void main (String[] args) {
        double num1 = 218;
        double num2 = 199;
        double num3 = 0.01;
        System.out.println("The average is : " + avgCalc(num1, num2, num3));
    }
    public static double avgCalc(double num1, double num2, double num3) {
        double result = (num1 + num2 + num3)/3;
        return result;
    }
}