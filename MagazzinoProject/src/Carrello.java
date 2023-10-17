import java.util.ArrayList;

public class Carrello {
     private ArrayList<Dispositivo> carrello;

     public Carrello(ArrayList<Dispositivo> carrello) {
          this.carrello = carrello;
     }
     public void printCarrello(ArrayList<Dispositivo> carrello) {
          carrello.forEach(System.out::println);
          System.out.println();
     }
}
