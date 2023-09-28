public class es19 {
    public static void main(String[] args) {
        int val = 5;
        int x = 1;
        System.out.println(sumOfValues(val, x));
    }
    public static int sumOfValues(int val, int x) {
        int sum = 0;
        while(x<val) {
            sum += x;
            x++;
        }
        return sum;
    }
}