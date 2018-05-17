public class BlackJack {

    public int CloseToTwentyOne(int a,int b)
    {
        //ignore any number over 21
        if (a>21)
        {
            a=0;
        }
        if (b>21)
        {
            b=0;
        }
        //if A is closer to 21 then B:  return A
        //if A is not closer to 21 then: return B (works if both the same)
        return  ((21-a) > (21-b))  ?  b:a;
    }


}
