import org.junit.*;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

public class isSummerJuint {

    @Test
    public void test()
    {
        isSummer summer = new isSummer();
        assertEquals(false, summer.WithinRange(40,false));
        assertEquals(true, summer.WithinRange(60,false));
        assertEquals(false, summer.WithinRange(100,false));
        assertEquals(true, summer.WithinRange(100,true));
        assertEquals(true, summer.WithinRange(90,false));
    }

}
