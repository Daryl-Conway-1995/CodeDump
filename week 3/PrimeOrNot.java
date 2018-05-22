import com.sun.org.apache.xalan.internal.xsltc.dom.ArrayNodeListIterator;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class PrimeOrNot {
    //input max value
    // start count at half of max this is to get rid of all even numbers (excluding 2) but also including 1 as it is classed as a non-prime number.
    //this balances out at guaranteeing half of the max is impossible to be a prime number to start with.
    private int numOfPrime;

    public void findPrimes(int max) {

        numOfPrime = 0;
        for (int i=max ;i>1;i--)
        {
            if(isItPrime(i)!=0){
                numOfPrime++;
            }
        }

        DecimalFormat formatter = new DecimalFormat("#,###");
        System.out.println("The number of primes under " + formatter.format((double) (max)) + " is " + formatter.format(((double) (numOfPrime))));

    }

    private int isItPrime(int max)
    {
        return (primes(max,2));
    }


    private int primes(int x,int i)
    {
        if (i > Math.sqrt((double)x)) {return 1;}
        return (x%i==0) ? 0:primes(x,i+1);
    }
}

