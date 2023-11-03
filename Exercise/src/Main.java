import javax.print.Doc;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Docente doc1 = new Docente("Simone", "Farina", 1, 18);
        Docente doc2 = new Docente("Antonio", "Iovine", 2, 12);
        Docente[] listaDocenti = new Docente[] {doc1, doc2};
        Università docenti = new Università(listaDocenti);
        System.out.println(docenti.minAge(listaDocenti));
//        String[] array = {"test", "parola", "iahuis", "io"};
//        int value = 4;
//        System.out.println(searchStringLength(array, value));
//        int[] array = {1,2,3,4,5,6,7,8,9};
//        int[] arrayMinMax = calcMaxMin(array);
//        System.out.println(Arrays.toString(arrayMinMax));
//        printEvenSum(array);
    }
    public static boolean searchStringLength(String[] array, int value) {
        boolean bool = false;
        for(String element : array) {
            if(element.length() == value) {
                bool = true;
                return bool;
            } else {
                bool = false;
            }
        }
        return bool;
    }
    public static int[] calcMaxMin(int[] array) {
        int[] arrayMinMax = new int[2];
        int max = array[0];
        int min = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i]>max) {
                max = array[i];
            } else if (array[i]<min) {
                min = array[i];
            }
        }
        arrayMinMax[0] = min;
        arrayMinMax[1] = max;

        return arrayMinMax;
    }
    public static void printEvenSum(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);;
    }
}