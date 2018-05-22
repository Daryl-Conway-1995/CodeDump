import java.text.DecimalFormat;
import java.util.ArrayList;

public class PrimeTime {
    public void primeAmount(int max) {
        // start count at half of max this is to get rid of all even numbers (excluding 2) but also including 1 as it is classed as a non-prime number.
        //this balances out at guaranteeing half of the max is impossible to be a prime number to start with.
        ArrayList<Integer> primes = new ArrayList<>();
        primes.add(2);
        boolean isPrime =true;
        double sqrtNumber =0;
        //for all odd numbers between 3 and the max number.
        for(int i =3;i<=max;i+=2) {
            if (i%((max/100)+1)==0)
            {
                System.out.println(i/((max/100)+1)+"%");
            }
            isPrime =true;
            sqrtNumber = Math.sqrt((double)i);
                /*
                 try to find the mod of all odd numbers between 3 and the current numbers square root.(eluding even)
                 a number can only have divisible pairs if one of the numbers is below or equal the square root. eg.

                    27  the square root is 5.19, its dividable pairs are: (1,27) and (3,9)
                 in each pair one of the digits is lower then the square root.

                    9   the square root is 3, its dividable pairs are: (1,9) and (3,3)
                 in this case one of the pairs is a perfect square root so <= is needed to include the lower square numbers. when compairing to square roots
                */
            for (Integer p:primes) {
                if (p>sqrtNumber) break;
                if (i % p == 0) {
                    //if any are a divisible number then mod returns 0 and therefor not prime.
                    //remove one count off the total number iterated through and set j to equal i to leave the loop quicker.
                    isPrime=false;
                    break;
                }
            }
            if(isPrime) primes.add(i);
        }
        DecimalFormat formatter = new DecimalFormat("#,###");
        System.out.println("The number of primes under "+formatter.format((double)max)+" is "+formatter.format((double)primes.size()));
    }
}

