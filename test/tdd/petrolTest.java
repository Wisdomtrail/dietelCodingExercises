package tdd;

import chapterThree.Petrol;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class petrolTest {
    @Test
    public void petrolTest() {
        Petrol petrol = new Petrol("aja", "diesel", 5, 200, 2);
        Assertions.assertNotNull(petrol);
    }

    @Test
    public void petrolAttributesInitialised(){
        Petrol petrol = new Petrol("aja", "diesel", 5, 200, 2);
        Assertions.assertEquals("aja",petrol.getLocation());
        Assertions.assertEquals("diesel", petrol.getPetrolType());
        Assertions.assertEquals(5,petrol.getquantity());
        Assertions.assertEquals(200, petrol.getpriceperliter());
        Assertions.assertEquals(2, petrol.getDiscount());
    }

    @Test
    public void petrolNegativePrice(){
        Petrol petrol = new Petrol("aja", "diesel", 5, 200, 2);
       Assertions.assertEquals(998, petrol.getPurchase());
    }
}
