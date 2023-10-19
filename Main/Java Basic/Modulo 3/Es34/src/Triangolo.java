public class Triangolo extends Forma {
    private double base;
    private double altezza;

    public void setTriangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }
    @Override
    public void calcolaArea() {
        double area = (base*altezza)/2;
        System.out.println("L'area del triangolo è: " + area);
    }
}
