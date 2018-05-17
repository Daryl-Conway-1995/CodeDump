public class CodingMain {

    public static void main(String[] args) {

        boolean isPrime = true;
        int max=2000000000;
        int numOfPrime =max;
        for(int i =0;i<=max;i++)
        {
            if (i%1000000==0)
            {
                System.out.print(i+ " , ");
            }
            if(i%25000000==0)
            {
                System.out.println();
            }
            if (i!=1||i!=0) {
                for (int j = 2; j <= Math.sqrt((double) i); j++) {
                    if (i % j == 0) {
                        isPrime =false;
                    }
                    if(isPrime==false)
                    {
                        numOfPrime--;
                        isPrime=true;
                        break;
                    }

                }
            }
            else
            {
                numOfPrime--;
            }

        }
        System.out.println("\n"+numOfPrime);
    }
}
