import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    @Test
    public void calSumTest(){
        SimpleCalculator calculator = new SimpleCalculator();
        int calc = calculator.calcSum(2,3);
        assertEquals(10,calc ); //This Test Should Pass since 2+3 equals to 3
        //To test on the terminal... RUn the following command:
        //      mvn clean test
    }
}