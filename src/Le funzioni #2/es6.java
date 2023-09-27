public class es6 {
    public static void main(String[] args) {
        String str = "This is test";
        System.out.println("The length of the string is : " + calcLength(str));
    }
    public static int calcLength (String str) {
        int lengthOf = str.length();
        return lengthOf;
    }
}
