
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.example.Calculator;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void 割り切れる数で商が計算できる() {
        assertEquals(4, calculator.divide(12, 3));
    }

    @Test
    void 割り切れない数で商が計算できる() {
        assertEquals(2, calculator.divide(12, 5));
    }

}
