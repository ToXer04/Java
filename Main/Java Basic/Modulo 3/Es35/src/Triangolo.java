public class Triangolo extends Forma{
    private double base;
    private double altezza;

    public void setTriangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }
    @Override
    public double calcolaArea() {
        double area = (base*altezza)/2;
        return area;
    }
}
