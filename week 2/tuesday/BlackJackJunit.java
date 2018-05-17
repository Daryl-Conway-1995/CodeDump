
import org.junit.*;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;


public class BlackJackJunit {

        @Test
        public void test()
        {
            BlackJack blackJack = new BlackJack();
            assertEquals(10, blackJack.CloseToTwentyOne(10 ,22));
            assertEquals(9, blackJack.CloseToTwentyOne(23 ,9));
            assertEquals(1, blackJack.CloseToTwentyOne(1 ,22));
            assertEquals(0, blackJack.CloseToTwentyOne(25 ,22));
            assertEquals(20, blackJack.CloseToTwentyOne(10 ,20));
            assertEquals(18, blackJack.CloseToTwentyOne(10 ,18));
        }

}
