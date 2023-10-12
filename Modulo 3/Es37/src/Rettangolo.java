public class Rettangolo extends Forma {
    private TipoForma tipo;
    public Rettangolo(double base, double altezza, TipoForma tipo) {
        super(base, altezza);
        this.tipo = tipo;
    }

    @Override
    public void calcolaArea() {
        double area = getBase()*getAltezza();
        System.out.println("L'area del " + tipo + " è: " + area);
    }
}
