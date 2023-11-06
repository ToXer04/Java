import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        BigDecimal num1 = BigDecimal.valueOf(11235.8132134558914423337761098715972584418167651094617711286574636875025);
        BigDecimal num2 = BigDecimal.valueOf(3.14159265358979323846264338327950288419716939937510);
        Operation operazione = Operation.Divisione;
        BigDecimal result = calcOperation(num1, num2, operazione);
        System.out.println(result);
    }
    public static BigDecimal calcOperation(BigDecimal num1, BigDecimal num2, Operation operazione) {
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
        System.out.println("operazione: " + operazione);
        if(num1 == null || num2 == null || operazione == null) {
            return null;
        } else {
            if(operazione.equals(Operation.Addizione)) {
                return num1.add(num2);
            } else if(operazione.equals(Operation.Sottrazione)) {
                return num1.subtract(num2);
            } else if(operazione.equals(Operation.Moltiplicazione)) {
                return num1.multiply(num2);
            } else if(operazione.equals(Operation.Divisione)) {
                return num1.divide(num2, RoundingMode.CEILING);
            } else if (operazione.equals(Operation.Min)) {
                return num1.min(num2);
            } else if(operazione.equals(Operation.Max)) {
                return num1.max(num2);
            }
        }
        throw new ArithmeticException("Make sure to type correct numbers and a valid operation");
    }
}
