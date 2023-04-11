package Example;

import chapterSix.CoinTossGame;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CoinTossGameTest {

    private CoinTossGame coinTossGame;

    @BeforeEach
    public void setup(){
        coinTossGame= new CoinTossGame();

    }

    @Test
    public void testThatGameExists(){
        Assertions.assertNotNull(coinTossGame);
    }

    @Test
    public void testMenuOption() {
        String menu = CoinTossGame.getGameMenu();
        Assertions.assertEquals("""
                1.Toss coin
                2.Exit Game
                """, menu);
    }

    @Test
    public void testCoinFlip(){
        String outcome = coinTossGame.flip();


    }

}