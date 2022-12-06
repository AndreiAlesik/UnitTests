package put.io.testing.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FailureOrErrorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator=new Calculator();
    }

    @Test
    void test1(){ assertEquals(4, calculator.add(3,5));
    //failure
        }

    @Test
    void test2(){ assertEquals(0, calculator.addPositiveNumbers(-1,5));
    //failed
    }

    @Test
    void test3(){
        try {
            assertEquals(3*6,1+3);
        }
        catch (Exception e){
            System.out.println(e.getStackTrace());
        }
    }
}