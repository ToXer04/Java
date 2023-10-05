import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type an operation (ex: 1 + 2 =)");
        String operation = in.nextLine();
        String[] arr = operation.split(" ");
        System.out.println(Arrays.toString(arr));
        label:
        for (int i = 0; i<arr.length; i++) {
            try {
                Double.parseDouble(arr[i]);
            } catch (NumberFormatException nfe) {
                switch (arr[i]) {
                    case "+":
                        double sum = sum(Double.parseDouble(arr[i - 1]), Double.parseDouble(arr[i + 1]));
                        arr[i + 1] = String.valueOf(sum);
                        System.out.println(Arrays.toString(arr));
                        break;
                    case "-":
                        double sub = sub(Double.parseDouble(arr[i - 1]), Double.parseDouble(arr[i + 1]));
                        arr[i + 1] = String.valueOf(sub);
                        break;
                    case "*":
                        double mul = mul(Double.parseDouble(arr[i - 1]), Double.parseDouble(arr[i + 1]));
                        arr[i + 1] = String.valueOf(mul);
                        break;
                    case "/":
                        double div = div(Double.parseDouble(arr[i - 1]), Double.parseDouble(arr[i + 1]));
                        arr[i + 1] = String.valueOf(div);
                        break;
                    case "^":
                        double pow = pow(Double.parseDouble(arr[i - 1]), Double.parseDouble(arr[i + 1]));
                        arr[i + 1] = String.valueOf(pow);
                        break;
                    case "=":
                        System.out.print(arr[i - 1]);
                        break label;
                    default:
                        System.out.println("Invalid character: " + arr[i]);
                        break;
                }
            }
        }
        System.out.println(arr[arr.length-1]);
    }
    public static double sum(double num1, double num2) {
        return num1 + num2;
    }
    public static double sub(double num1, double num2) {
        return num1 - num2;
    }
    public static double mul(double num1, double num2) {
        return num1 * num2;
    }
    public static double div(double num1, double num2) {
        return num1 / num2;
    }
    public static double pow(double num1, double num2) {
        double result = 1;
        for(int i = 0;i<num2;i++) {
            result*=num1;
        }
        return result;
    }
}
