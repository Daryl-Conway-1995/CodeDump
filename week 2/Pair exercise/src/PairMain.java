import java.util.Scanner;

public class PairMain {

    public static void main(String[] args) {

        //create scanner and race objects
        Scanner userInput = new Scanner(System.in);
        PairProgramming race = new PairProgramming();

        //create run condition
        boolean isRun = true;
        while (isRun) {

            //get max place
            System.out.println("How many dogs ran in this race?");
            int i = userInput.nextInt();

            //if zero dogs raced end program
            if (i == 0)
            {
                isRun = false;
                break;
            }

            //set max dog number
            race.setMax(i);

            //get current place
            System.out.println("Which place did your dog come?");
            i = userInput.nextInt();

            // call places from race class
            race.Places(i);
        }

    }

}
