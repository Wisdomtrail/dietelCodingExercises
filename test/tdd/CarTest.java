package tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    public void theCarTest() {
        Car lexus = new Car("lexus 320", "2020", 998.00);
        Assertions.assertNotNull(lexus);

    }

    @Test
    public void theCarAttributesAreInitialised() {
        Car lexus = new Car("lexus 320", "2020", 998.00);
        Assertions.assertEquals("lexus 320", lexus.getModel());
        Assertions.assertEquals("2020", lexus.getYear());
        Assertions.assertEquals(998.00, lexus.getPrice());

    }

    @Test
    public void negativePriceForCarTest() {
        Car lexus = new Car("lexus 320", "2020", 998.00);
        lexus.setPrice(-873.00);
        Assertions.assertEquals(998.00, lexus.getPrice());

    }

}