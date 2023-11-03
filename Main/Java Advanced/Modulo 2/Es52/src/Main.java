public class Main {
    public static void main(String[] args) {
        Punto punto1 = new Punto(3,7);
        Punto punto2 = new Punto(-7,0);
        System.out.println("punto1 " + punto1);
        System.out.println("punto1 X " + punto1.x());
        System.out.println("punto1 Y " + punto1.y());

        System.out.println("punto2 " + punto2);
        System.out.println("punto2 X " + punto2.x());
        System.out.println("punto2 Y " + punto2.y());
    }
}