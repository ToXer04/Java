public class es13 {
    public static void main (String[] args) {
        int num1 = 1;
        int num2 = 10;
        double val = 5;
        System.out.println("Is val between num1 and num2? " + isBetween(num1, num2, val));
    }
    public static boolean isBetween(int num1, int num2, double val) {
        boolean result = (num1 < val) && (val < num2);
        return result;
    }
}