import org.junit.*;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

public class UniqueSumJuint {

    @Test
    public void test()
    {
        UniqueSum uniqueSum = new UniqueSum();
        assertEquals(0, uniqueSum.findSum(4,4,4));



    }
    @Test
    public void WTH1()
    {
        UniqueSum uniqueSum = new UniqueSum();
        assertEquals(4, uniqueSum.findSum(5,5,4));
    }
    @Test
    public void WTH2()
    {
        UniqueSum uniqueSum = new UniqueSum();
        assertEquals(5, uniqueSum.findSum(5,4,4));
    }
    @Test
    public void WTH3()
    {
        UniqueSum uniqueSum = new UniqueSum();
        assertEquals(6, uniqueSum.findSum(4,6,4));
    }
    @Test
    public void WTH4()
    {
        UniqueSum uniqueSum = new UniqueSum();
        assertEquals(15, uniqueSum.findSum(5,4,6));
    }
    @Test
    public void WTH5()
    {
        UniqueSum uniqueSum = new UniqueSum();
        assertEquals(100, uniqueSum.findSum(40,10,50));
    }
}
