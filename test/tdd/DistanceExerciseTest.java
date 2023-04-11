package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DistanceExerciseTest {

    @Test
    public void testTwoPointsInAPlane(){
       assertTrue(DistanceExercise.isPerpendicular(2, 2, 9, 3));
    }

    @Test
    public void testPerpendicularity(){
        assertFalse(DistanceExercise.isPerpendicular(2, 2,5, 5));
    }

}
