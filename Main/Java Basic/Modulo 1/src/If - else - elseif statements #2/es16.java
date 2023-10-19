public class es16 {
    public static void main(String[] args) {
        String str = "This is a test";
        checkLength(str);
    }
    public static void checkLength(String str) {
        int length = str.length();
        if(length == 10) {
            System.out.println("The length of the string is 10");
        } else if(length < 10) {
            System.out.println("The length of the string is less 10");
        } else if(length > 10) {
            System.out.println("The length of the string is more 10");
        } else {
            System.out.println("There's an error");
        }
    }
}