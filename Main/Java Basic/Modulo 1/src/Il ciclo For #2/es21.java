public class es21 {
    public static void main(String[] args) {
        int num = 6;
        int maxRes = 8;
        invCount(num, maxRes);
    }
    public static void invCount(int num, int maxRes) {
        for(int x = maxRes;x>0;x--) {
            System.out.println(num);
            num--;
        }
    }
}