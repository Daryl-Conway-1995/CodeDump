import java.util.Scanner;

public class PairProgramming {

    private int max = 100;

    //allow max value to change
    public void setMax(int i)
    {
        max = i;
    }
    public int getMax()
    {
        return max;
    }


    public void Places(int i) {

        //for all numbers between 1 and max
        for (int j =1 ;j<=max;j++)
        {
            //if the selected dog
            if (j==i)
            {
                //do nothing unless a multiple of 10 (start new line)
                if (j%10==0)
                {
                    System.out.println("");
                }

            }else {
                //if number ends in 1 and is not 11 end with st
                if ((j % 10 == 1) && (j  != 11)) {
                    System.out.print(j + "st, ");
                }
                //if number ends in 2 and is not 12 end with nd
                else if ((j % 10 == 2) && (j != 12)) {
                    System.out.print(j + "nd, ");
                }
                //if number ends with 3 and is not 13 end with rd
                else if ((j % 10 == 3) && (j != 13)) {
                    System.out.print(j + "rd, ");
                }
                //all other numbers end with th
                else {
                    System.out.print(j + "th, ");
                }
                //separate the lines in to 10 numbers (to look tidier)
                if (j%10==0)
                {
                    System.out.println("");
                }
            }
        }
        //add space after outputting all the places to look tidier.
        System.out.println("");

    }
}
