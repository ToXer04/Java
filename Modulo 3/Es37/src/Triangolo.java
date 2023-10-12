public class Triangolo extends Forma {
    private TipoForma tipo;
    public Triangolo(double base, double altezza, TipoForma tipo) {
        super(base, altezza);
        this.tipo = tipo;
    }

    @Override
    public void calcolaArea() {
        double area = (getBase()*getAltezza())/2;
        System.out.println("L'area del " + tipo + " è: " + area);
    }
}
