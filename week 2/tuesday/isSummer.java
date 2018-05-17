public class isSummer {

    boolean WithinRange(int temp,boolean isSummer)
    {
        boolean result = false;
        int lower = 60;
        int upper = 90;

        if (isSummer) {upper = 100;}

        if (lower<= temp && temp <=upper)
        {result = true;}
        return result;
    }

}

