import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LcmTest {

    @Test
    void lcmMethod() {
        int[] array = Lcm.lcmMethod(700);
        int[] actual = {2,2,5,5,7};
        assertEquals(Arrays.toString(array), Arrays.toString(actual));
    }
}