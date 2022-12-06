package put.io.testing.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;


class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAdd() {

        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            int x = rand.nextInt();
            int y = rand.nextInt();

            assertEquals(x + y, calculator.add(x, y));
        }
    }

    @Test
    void testMultiply() {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int x = random.nextInt();
            int y=random.nextInt();

            assertEquals(x*y, calculator.multiply(x,y));

        }
    }

    @Test
    void testAddPositiveNumbers(){
        Exception exception=new Exception();
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.addPositiveNumbers(-3,5));

    }
    //3.1 nie bedzie dzialac

}