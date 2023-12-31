import java.math.BigDecimal;
import java.math.RoundingMode;

public class OperationUtils {
    public static BigDecimal calcOperation(BigDecimal num1, BigDecimal num2, Operation operazione) {
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
        System.out.println("operazione: " + operazione);
        if (num1 == null || num2 == null || operazione == null) {
            return null;
        } else {
            switch (operazione) {
                case Addizione -> {
                    return num1.add(num2);
                }
                case Sottrazione -> {
                    return num1.subtract(num2);
                }
                case Moltiplicazione -> {
                    return num1.multiply(num2);
                }
                case Divisione -> {
                    return num1.divide(num2, RoundingMode.CEILING);
                }
                case Min -> {
                    return num1.min(num2);
                }
                case Max -> {
                    return num1.max(num2);
                }
                default -> throw new ArithmeticException("This is not a valid operation");
            }
        }
    }
}
