import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        Integer string = null;
        BigDecimal num1 = BigDecimal.valueOf(11235.8132134558914423337761098715972584418167651094617711286574636875025);
        BigDecimal num2 = BigDecimal.valueOf(3.14159265358979323846264338327950288419716939937510);
        Operation operazione = Operation.Divisione;
        OperationUtils ou = new OperationUtils();
        BigDecimal result = ou.calcOperation(num1, num2, operazione);
        System.out.println(result);
    }
}
