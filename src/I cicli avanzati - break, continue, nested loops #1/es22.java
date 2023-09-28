public class es22 {
    public static void main(String[] args) {
        int val = 10;
        invCount(val);
    }
    public static void invCount(int val) {
        for(int x = 0;x<=val;x++) {
            if(x==5) {
                break;
            }
            System.out.println(x);
        }

    }
}