public class Main {
    public static void main(String[] args) {
        checkNumAndDen();
    }
    public static void checkNumAndDen() {
        Integer num = null;
        Integer den = 5;
        try {
            double result = num/den;
            System.out.println(result);
        } catch(NullPointerException npe) {
            System.out.println(npe);
        }
    }
}