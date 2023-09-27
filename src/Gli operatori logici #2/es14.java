public class es14 {
    public static void main(String[] args) {
        int num = -2;
        System.out.println("Is the number even? " + isEven(num));
    }
    public static boolean isEven(int num) {
        boolean result = (num % 2) == 0;
        return result;
    }
}