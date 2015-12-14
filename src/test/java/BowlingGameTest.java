import org.junit.Test;
import org.junit.Assert;


public class BowlingGameTest {
    BowlingGame game = new BowlingGame();

    @Test
        public void gutterGame() {
            for(int i= 0; i<20; i++ ){
                game.roll(0);
            }
            Assert.assertEquals(0, game.score());
        }

    @Test
        public void scoreOfTwenty() {
            for(int i = 0; i < 20; i++) {
                game.roll(1);
            }
            Assert.assertEquals(20, game.score());
        }

    @Test
        public void scoresASpare() {
            game.roll(5);
            game.roll(5);
            game.roll(3);
            for (int i = 0; i < 17; i++) {
                game.roll(0);
            }
            Assert.assertEquals(16, game.score());
        }

    @Test
        public void scoresAStrike() {
            game.roll(10);
            game.roll(4);
            game.roll(4);

            for(int i=0; i<16; i++) {
                game.roll(0);
            }

            Assert.assertEquals(26, game.score());
        }

    @Test
        public void perfectGame() {
            for (int i = 0; i < 12 ; i++) {
                game.roll(10);
            }
            Assert.assertEquals(300, game.score());
        }

}
