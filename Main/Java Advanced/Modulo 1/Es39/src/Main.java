public class Main {
    public static void main(String[] args) {
        char value = 'a';
        checkChar(value);
    }
    public static void checkChar(char value) {
        try {
            double valNum = Double.parseDouble(String.valueOf(value));
        } catch(NumberFormatException nfe) {
            throw new NumberFormatException(value + " is not a number");
        }
    }
}