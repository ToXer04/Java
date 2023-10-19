public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo();
        rettangolo.setRettangolo(2,4);
        double areaRettangolo = rettangolo.calcolaArea();
        System.out.println("L'area del rettangolo è: " + areaRettangolo);

        Triangolo triangolo = new Triangolo();
        triangolo.setTriangolo(2,4);
        double areaTriangolo = triangolo.calcolaArea();
        System.out.println("L'area del triangolo è: " + areaTriangolo);
    }
}