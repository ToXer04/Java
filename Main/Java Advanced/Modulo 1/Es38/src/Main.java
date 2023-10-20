import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int value = r.nextInt(0,1000);
        int valMin = r.nextInt(0,100);
        int valMax = r.nextInt(900, 1000);
//        System.out.println(value);
//        System.out.println(valMin);
//        System.out.println(valMax);
        System.out.println(checkRange(value, valMin, valMax));
    }
    public static boolean checkRange(int value, int valMin, int valMax) {
        if(valMin<=value && value<=valMax) {
            return true;
        } else {
            throw new ArithmeticException(value +  " is not between " + valMin + " and " + valMax);
        }
    }
}