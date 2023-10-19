public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        divideArrayByZero(array);
    }
    public static void divideArrayByZero(int[] array) {
        try {
            for(int i = 0; i<array.length+1; i++) {
                int result = array[i] / 0;
            }
        } catch (ArithmeticException ae) {
            System.out.println(ae);
        } catch (ArrayIndexOutOfBoundsException aiobe) {
            System.out.println(aiobe);
        }
    }
}