public class es18 {
    public static void main(String[] args) {
        char operator = '*';
        System.out.println(checkDay(operator));
    }
    public static String checkDay(char operator) {
        switch (operator) {
            case '+': {
                return "Addiction";
            }
            case '-': {
                return "Subtraction";
            }
            case '*': {
                return "Multiplication";
            }
            case '/': {
                return "Division";
            }
            default: {
                return "There's an error!";
            }
        }
    }
}