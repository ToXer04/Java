public class Main {
    public static void main(String[] args) {
        int value = 12;
        divideByZero(value);
    }
    public static void divideByZero(int value) {
        try {
            double result = value / 0;
        } catch(ArithmeticException ae) {
            System.out.println(ae);
        }
    }
}