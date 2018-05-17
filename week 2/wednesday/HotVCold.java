import java.util.Random;
import java.util.Scanner;

public class HotVCold {

    private int upper = 1000;
    private int lower = -1;
    private int guess;
    private int count=0;
    private boolean isRunning = true;
    private boolean isNotGuessed = true;
    private int input;
    private String option;
    private Random rand = new Random();
    private Scanner sc = new Scanner(System.in);

    public void runGame()
    {
            System.out.println("Welcome to the game.");

            //get lower limit
            do {
            System.out.println("please choose an lower limit");
            input = sc.nextInt();
            lower = input;
            } while (input < 0);

            //get upper limit
            do {
               System.out.println("please choose an upper limit");
               input = sc.nextInt();
               upper = input;
            }while (upper < lower);

            //output the possible input options
            System.out.println("The option of replying is: [t] that is my number, [b] boiling, [vw] very warm [w] warm, [c] cold, [vc] very cold [f] freezing");
            guess = rand.nextInt(upper) + lower;

            //call guesser
            while (isNotGuessed) {
                System.out.println("I guess: " + guess + ". Am i warm?");
                option = sc.next();
                alterGuess(option);
            }


    }

    public void alterGuess(String input)
    {
        do {

            //accept inputs
            switch (input) {
                case "b": {
                    //guess extremely close
                    guess = rand.nextInt(guess + (upper / 100)) + guess - (upper / 100);
                    break;
                }
                case "vw": {
                    //guess very close
                    guess = rand.nextInt(guess + (upper / 30)) + guess - (upper / 30);
                    break;
                }
                case "w": {
                    //guess close
                    guess = rand.nextInt(guess + (upper / 10)) + guess - (upper / 10);
                    break;
                }
                case "c": {
                    //guess
                    guess = rand.nextInt(guess + (upper / 5)) + guess - (upper / 5);
                    break;
                }
                case "vc": {
                    //guess vaguely
                    guess = rand.nextInt(guess + (upper / 2)) + guess - (upper / 2);
                    break;
                }
                case "f": {
                    //random stab in the dark
                    guess = rand.nextInt(upper) + lower;
                    break;
                }
                case "t":{
                    //win condition
                    isNotGuessed = false;
                    System.out.println("It took me " + (count+1)+ " guesses.");
                    break;
                }

            }
            //if in range
        }while (!(guess<lower||guess>upper));
    }


}
