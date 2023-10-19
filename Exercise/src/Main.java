import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
     public static void main(String[] args) {
          int[] array = filler();
          System.out.println(Arrays.toString(array));
          ArrayList<Integer> arrayPrime = primeArray(array);
          System.out.println(arrayPrime);
     }
     public static int[] filler() {
          Random r = new Random();
          int[] array = new int[5];
          for(int i=0;i<array.length;i++) {
               array[i] = r.nextInt(0,100);
          }
          return array;
     }
     public static ArrayList<Integer> primeArray(int[] array) {
          ArrayList<Integer> arrayPrime= new ArrayList<>();
          System.out.println(array.length);
          for(int i=1; i<=100; i++) {
               for(int j=0; j< array.length; j++) {
                    if(!(array[j] % i == 0)) {
                         continue;
                    }
                    arrayPrime.add(i);
               }
          }
          return arrayPrime;
     }
}