enum TipoForma {
    rettangolo,
    triangolo
}


public class Forma {
    private double base;
    private double altezza;

    public Forma(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }
    public double getBase() {
        return base;
    }
    public double getAltezza() {
        return altezza;
    }

    public void calcolaArea() {
        System.out.println("Area generica");
    }
}
