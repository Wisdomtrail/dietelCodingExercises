package tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParcelTest {


    @Test
    public void parcelLessThan50Test() {
        Parcel parcel = new Parcel();
        int bonus = parcel.amount(49);
        Assertions.assertEquals(0, bonus);


    }

    @Test
    public void Parcel50Test(){
        Parcel parcel = new Parcel();
        int bonus = parcel.amount(50);
        Assertions.assertEquals(10000,bonus);
                
    }
    @Test
    public void Parcel60Test(){
        Parcel parcel = new Parcel();
        int bonus = parcel.amount(60);
        Assertions.assertEquals(15000,bonus);

    }

    @Test
    public void parcel70Test(){
        Parcel parcel = new Parcel();
        int bonus = parcel.amount(70);
        Assertions.assertEquals(35000,bonus);
    }

 
    
}
