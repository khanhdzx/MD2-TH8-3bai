package TH1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    @DisplayName("Testing addition")
    void testCalculateAdd(){
        int a = 2;
        int b = 1;
        char o ='+';
        int expect =2;
        int result = Calculator.calculate(a,b,o);
        assertEquals(expect,result);
    }
}
