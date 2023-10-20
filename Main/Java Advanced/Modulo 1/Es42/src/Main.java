public class Main {
    public static void main(String[] args) {
        Integer num = 10;
        Integer den = 2;
        try {
            System.out.println(divideNumDen(num, den));
        } catch(NullPointerException npe) {
            System.out.println(npe);
        }
    }
    public static double divideNumDen(Integer num, Integer den) {
        if(num == null && den == null) {
            throw new NullPointerException("Both num and den are null");
        } else if(num == null) {
            throw new NullPointerException("Num is null");
        } else if(den == null) {
            throw new NullPointerException("Den is null");
        } else {
            return num/den;
        }
    }
}