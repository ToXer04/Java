public class es12 {
    public static void main(String[] args) {
        char char1 = 'c';
        char char2 = 'c';
        System.out.println("Char1 = " + char1);
        System.out.println("Char2 = " + char2);
        System.out.println("Are char1 and char2 equal? " + charComp(char1, char2));
    }
    public static boolean charComp(char char1, char char2) {
        boolean result = char1 == char2;
        return result;
    }
}