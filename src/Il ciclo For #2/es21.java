public class es21 {
    public static void main(String[] args) {
        int num = 10;
        int maxRes = 15;
        invCount(num, maxRes);
    }
    public static void invCount(int num, int maxRes) {
        for(int x = maxRes;x>0;x--) {
            System.out.println(num);
            num--;
        }
    }
}