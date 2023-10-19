public class Rettangolo extends Forma {
    private double base;
    private double altezza;

    public void setRettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }
    @Override
    public void calcolaArea() {
        double area = base*altezza;
        System.out.println("L'area del rettangolo è: " + area);
    }
}
