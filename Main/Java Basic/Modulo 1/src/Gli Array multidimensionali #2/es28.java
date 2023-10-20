import java.util.Arrays;
public class es28 {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6},{7,8,9},{10,11,12},{13,14,15}};
        int[][] newArray = arrayReversed(array);
    }
    public static int[][] arrayReversed(int[][] array) {
        int[][] newArray = new int[array[0].length][array.length];
        int rowLength = array[0].length;
        for(int i = 0; i < array.length; i++) {
            if(rowLength != array[i].length) {
                System.out.println("The matrix must have the same amount of columns in each row");
                return null;
            }
            if(i == array.length-1) {
                System.out.println("Normal array: " + Arrays.deepToString(array));
                for(int j = 0; j < array.length; j++) {
                    for(int k = 0; k < array[j].length; k++) {
                        newArray[k][j] = array[j][k];
                    }
                }
                System.out.println("Reversed array: ");
                for (int[] ints : newArray) {
                    System.out.println(Arrays.toString(ints));
                }
            }
        }
        return newArray;
    }
}