public class es11 {
    public static void main(String[] args) {
        int num1 = 13;
        int num2 = 11;
        System.out.println("Are num1 and num2 equal? " + intComp(num1, num2));
    }
    public static boolean intComp(int num1, int num2) {
        boolean result = num1 == num2;
        return result;
    }
}