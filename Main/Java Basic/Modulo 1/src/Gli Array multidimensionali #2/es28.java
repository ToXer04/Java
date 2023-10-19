import java.util.Arrays;
public class es28 {
    public static void main(String[] args) {
        arrayMultSum();
    }
    public static void arrayMultSum() {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {4, 5, 6}};
        int[][] newArr = new int[arr[0].length][arr.length];
        if(arr[0].length != arr[1].length) {
            System.out.println("The matrix must have 2 rows with the same amount of columns");
        } else {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    newArr[j][i] = arr[i][j];
                }
            }
            System.out.println(Arrays.deepToString(newArr));
        }
    }
}