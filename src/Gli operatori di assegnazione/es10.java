public class es10 {
    public static void main(String[] args) {
        double var1 = 1.2;
        double var2 = 99;
        System.out.println("The multiplication of the two increased variables is : " + moltInc(var1, var2));
    }
    public static double moltInc(double var1, double var2) {
        var1 += 3.8;
        var2 ++;
        double result = var1*var2;
        return result;
    }
}