// Definisci un metodo che calcoli la media tra 3 numeri e restituisca il risultato che dovrà essere stampato.

public class Main {
    public static void main (String[] args) {
        double num1 = 218;
        double num2 = 199;
        double num3 = 0.01;
        System.out.println("The average is : " + avgCalc(num1, num2, num3));
    }
    public static Double avgCalc(Double num1, Double num2, Double num3) {
        if(num1 == null || num2 == null || num3 == null) {
            return null;
        }
        double result = (num1 + num2 + num3)/3;
        return result;
    }
}