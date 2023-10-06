public class es27 {
    public static void main(String[] args) {
        System.out.println(arrayMultSum());
    }
    public static int arrayMultSum() {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10}};
        int sum = 0;
        for(int i = 0; i<arr[0].length; i++) {
            sum += arr[0][i];
        }
        return sum;
    }
}