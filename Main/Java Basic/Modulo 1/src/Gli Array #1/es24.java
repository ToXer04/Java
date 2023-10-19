public class es24 {
    public static void main(String[] args) {
        System.out.println(arraySum());
    }
    public static int arraySum() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for(int num: arr) {
            sum+=num;
        }
        return sum;
    }
}