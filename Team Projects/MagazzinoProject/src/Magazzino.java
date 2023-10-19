import java.util.ArrayList;

public class Magazzino {
    private ArrayList<Dispositivo> magazzino;
    public Magazzino(ArrayList<Dispositivo> magazzino) {
        this.magazzino = magazzino;
    }

    @Override
    public String toString() {
        return "Magazzino{" +
                "\narticolo=" + magazzino.get(0) +
                "\n}";
    }
    public void printMagazzino(ArrayList<Dispositivo> magazzino) {
        magazzino.forEach(System.out::println);
        System.out.println();
    }
}