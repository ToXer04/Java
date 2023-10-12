// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Forma forma = new Forma(2, 4);
        forma.calcolaArea();

        Rettangolo rettangolo = new Rettangolo(forma.getBase(), forma.getAltezza(), TipoForma.rettangolo);
        rettangolo.calcolaArea();

        Triangolo triangolo = new Triangolo(forma.getBase(), forma.getAltezza(), TipoForma.triangolo);
        triangolo.calcolaArea();
    }
}