package put.io.testing.audiobooks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AudiobookPriceCalculatorTest {

    @Test
    void subscriberTest(){
        Customer client= new Customer("Andrew", Customer.LoyaltyLevel.SILVER,true);
        Audiobook book=new Audiobook("Lord of the rings",100);
        AudiobookPriceCalculator calculator=new AudiobookPriceCalculator();
        assertEquals(0,calculator.calculate(client,book));

    }

    @Test
    void isSilverTest(){
        Customer client= new Customer("Andrew", Customer.LoyaltyLevel.SILVER,false);
        Audiobook book=new Audiobook("Lord of the rings",100);
        AudiobookPriceCalculator calculator=new AudiobookPriceCalculator();
        assertEquals(90,calculator.calculate(client,book));
    }

    @Test
    void isGoldTest(){
        Customer client= new Customer("Andrew", Customer.LoyaltyLevel.SILVER,true);
        Audiobook book=new Audiobook("Lord of the rings",100);
        AudiobookPriceCalculator calculator=new AudiobookPriceCalculator();
        assertEquals(80,calculator.calculate(client,book));
    }

    @Test
    void standardCustomerTest(){
        Customer client= new Customer("Andrew", Customer.LoyaltyLevel.SILVER,true);
        Audiobook book=new Audiobook("Lord of the rings",100);
        AudiobookPriceCalculator calculator=new AudiobookPriceCalculator();
        assertEquals(100,calculator.calculate(client,book));
    }
}