import java.util.Arrays;

public class es26 {
    public static void main(String[] args) {
        arraySearch();
    }
    public static void arraySearch() {
        int[] arr = {1, 2, 3, 4, 1, 2, 5, 6, 1, 1, 1, 10, 12};
        int[] newArr = {};
        for(int i = 0; i<arr.length; i++) {
            for(int x = i+1; x<arr.length; x++) {
                if(arr[i] == arr[x]) {
                    break;
                }
                if(x==arr.length-1) {
                    newArr = addNewArray(arr[i], newArr);
                }
            }
        }
        int[] finalArr = Arrays.copyOf(newArr, newArr.length + 1);
        finalArr[finalArr.length-1] = arr[arr.length-1];
        System.out.println(Arrays.toString(finalArr));
    }
    public static int[] addNewArray(int num, int[] newArr) {
        int[] tempArr = Arrays.copyOf(newArr, newArr.length + 1);
        tempArr[tempArr.length-1] = num;
        return tempArr;
    }
}