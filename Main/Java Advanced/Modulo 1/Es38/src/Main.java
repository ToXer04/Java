public class Main {
    public static void main(String[] args) {
        int value = 101;
        System.out.println(checkRange(value));
    }
    public static boolean checkRange(int value) {
        if(0<=value && value<=100) {
            return true;
        } else {
            throw new ArithmeticException(value +  " is not between 0 and 100");
        }
    }
}